package com.example.coderspot.ui.main;

public class User {
    public User(String doctor_name, String patient_name, String phone, String disease_name) {
        this.doctor_name = doctor_name;
        this.patient_name = patient_name;
        this.phone = phone;
        this.disease_name = disease_name;
    }

    String doctor_name,patient_name,phone,disease_name;

    public User() {

    }

    public String getDoctor_name() {
        return doctor_name;
    }

    public void setDoctor_name(String doctor_name) {
        this.doctor_name = doctor_name;
    }

    public String getPatient_name() {
        return patient_name;
    }

    public void setPatient_name(String patient_name) {
        this.patient_name = patient_name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDisease_name() {
        return disease_name;
    }

    public void setDisease_name(String disease_name) {
        this.disease_name = disease_name;
    }
}
