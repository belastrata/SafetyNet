package com.SafetyNet.Alerts.service.dto;

import com.SafetyNet.Alerts.model.Person;

import java.awt.*;
import java.util.List;

public class ChildAlertDto {

    private String lastname;
    private String firstname;
    private String age;

    private List<Person> numberofhousehold;

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public List<Person> getNumberofhousehold() {
        return numberofhousehold;
    }

    public void setNumberofhousehold(List<Person> numberofhousehold) {
        this.numberofhousehold = numberofhousehold;
    }
}
