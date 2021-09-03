package com.SafetyNet.Alerts.controller;


import com.SafetyNet.Alerts.model.Person;
import com.SafetyNet.Alerts.service.PersonService;

import com.SafetyNet.Alerts.service.dto.ChildAlertDto;
import com.SafetyNet.Alerts.service.dto.FireDto;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PersonsController {

    private final PersonService personService;

    PersonsController(PersonService personService) {
        this.personService = personService;
    }

    //Get an email list
    @RequestMapping(value = "communityEmail", method = RequestMethod.GET)
    public List<String> listEmails(@RequestParam(name = "city") String city) {

        return this.personService.findAllEmailsByCity(city);

    }

    //http://localhost:8080/phoneAlert?firestation=<firestation_number>
    @RequestMapping(value = "phoneAlert", method = RequestMethod.GET)
    public List<String> listPhone(@RequestParam(name = "firestation") String firestation) {

        return this.personService.findAllPhoneByFirestation(firestation);
    }

    @RequestMapping(value = "fire", method = RequestMethod.GET)
    public List<FireDto> listAddress(@RequestParam(name = "address") String address) {

        return this.personService.findAllfireByAddress(address);
    }

        //http://localhost:8080/Persons
        @RequestMapping(value = "/Persons", method = RequestMethod.GET)
        public List<Person> getListOfPersons () {

            return this.personService.getList();
        }

    @RequestMapping(value = "childAlert", method = RequestMethod.GET)
    public List<ChildAlertDto> listChildAlert(@RequestParam(name = "address") String address) {

        return this.personService.findAllchildsUnder18ByAddress(address);
    }



    }


