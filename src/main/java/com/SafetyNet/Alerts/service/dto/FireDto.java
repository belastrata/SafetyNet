package com.SafetyNet.Alerts.service.dto;

public class FireDto {
    private String firestation;
    private String lastname;
    private String phone;
    private String age;
    private String[] medications;
    private String[] allergies;

    public String getFirestation() {
        return firestation;
    }

    public void setFirestation(String firestation) {
        this.firestation = firestation;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String[] getMedications() {
        return medications;
    }

    public void setMedications(String[] medications) {
        this.medications = medications;
    }

    public String[] getAllergies() {
        return allergies;
    }

    public void setAllergies(String[] allergies) {
        this.allergies = allergies;
    }
}
