package com.SafetyNet.Alerts.service;

import com.SafetyNet.Alerts.model.FireStation;
import com.SafetyNet.Alerts.model.MedicalRecord;
import com.SafetyNet.Alerts.model.Person;
import com.SafetyNet.Alerts.repository.FireStationRepository;
import com.SafetyNet.Alerts.repository.MedicalRecordsRepository;
import com.SafetyNet.Alerts.repository.PersonRepository;

import com.SafetyNet.Alerts.service.dto.FireDto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class PersonService {

    private final PersonRepository personRepository;
    private final FireStationRepository firestationRepository;
    private final MedicalRecordsRepository medicalRecordsRepository;

    public PersonService(PersonRepository personRepository, FireStationRepository firestationRepository, MedicalRecordsRepository medicalRecordsRepository) {
        this.personRepository = personRepository;
        this.firestationRepository = firestationRepository;
        this.medicalRecordsRepository = medicalRecordsRepository;

    }


    public List<String> findAllEmailsByCity(String city) {

        return this.personRepository.findAllPersons().stream().filter(p -> p.getCity().equals(city)).map(p -> p.getEmail()).collect(Collectors.toList());
    }

    public List<Person> getList() {
        return this.personRepository.findAllPersons();
    }

    public List<String> findAllPhoneByFirestation(String firestation) {
        List<String> tableau = new ArrayList<>();
        List<Person> persons = personRepository.findAllPersons();
        List<FireStation> firestations = firestationRepository.findAllFireStationByNumber(firestation);
        for (FireStation fs : firestations) {
            for (Person p : persons) {
                if (fs.getAddress().equals(p.getAdress())) {
                    tableau.add(p.getPhone());
                }
            }
        }
        return tableau;
    }

    public List<FireDto> findAllfireByAddress(String address) {

        List<FireDto> fireDtos = new ArrayList<>();
        List<FireStation> fireStations = firestationRepository.findAllFireStationByAddress(address);
        List<Person> personList = personRepository.findAllpersonByAddress(address);
        List<MedicalRecord> medicalRecordList = medicalRecordsRepository.findAllMedicalRecords();

        for (FireStation fs : fireStations) {
            for (Person p : personList) {
                for (MedicalRecord mr : medicalRecordList) {
                    if (fs.getAddress().equals(p.getAdress())) {
                        if (mr.getLastName().equals(p.getLastName())) {
                            FireDto dto = new FireDto();
                            dto.setAllergies(mr.getAllergies());
                            dto.setFirestation(fs.getStation());
                            dto.setLastname(p.getLastName());
                            dto.setMedications(mr.getMedications());
                            dto.setPhone(p.getPhone());
                            fireDtos.add(dto);
                        }
                    }
                }
            }
        }
        return fireDtos;
    }
}



