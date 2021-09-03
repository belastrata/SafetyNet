package com.SafetyNet.Alerts.service.dto;

import com.SafetyNet.Alerts.model.Person;

import java.util.List;

public class ChildAlertDto {

    private String LastName;
    private String FirstName;
    private String Age;

    private List<Person> numerologist;

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastname) {
        this.LastName = lastname;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstname) {
        this.FirstName = firstname;
    }

    public String getAge() {
        return Age;
    }

    public void setAge(String age) {
        this.Age = age;
    }

    public List<Person> getNumerologist() {
        return numerologist;
    }

    public void setNumerologist(List<Person> numerologist) {
        this.numerologist = numerologist;
    }
}
