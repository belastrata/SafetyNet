package com.SafetyNet.Alerts.service;

import com.SafetyNet.Alerts.repository.PersonRepository;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PersonService {

    private final PersonRepository personRepository;

    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }


    public List<String> findAllEmailsByCity(String city) {

        return this.personRepository.findAllPersons().stream().filter(p -> p.getCity().equals(city)).map(p -> p.getEmail()).collect(Collectors.toList());
    }



}



