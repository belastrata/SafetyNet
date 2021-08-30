package com.SafetyNet.Alerts.controller;


import com.SafetyNet.Alerts.model.FireStation;
import com.SafetyNet.Alerts.model.MedicalRecord;
import com.SafetyNet.Alerts.model.Person;
import com.SafetyNet.Alerts.service.PersonService;

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
    public List<String> listeEmails(@RequestParam(name = "city") String city) {

        return this.personService.findAllEmailsByCity(city);

    }



}