package com.example.coderspot;

public class ColdHelp {
    public ColdHelp(String patient, String dis, String id)
    {
        this.patient = patient;
        this.id = id;
        this.dis = dis;

    }
    public ColdHelp(){

    }
    String patient,id,dis;

    public String getPatient() {
        return patient;
    }

    public void setPatient(String patient) {
        this.patient = patient;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDis() {
        return dis;
    }

    public void setDis(String dis) {
        this.dis = dis;
    }
    public  String toString(){

        return "Patient Name-"+this.patient+", "+"Disease Name-"+this.dis+", "+"id-"+this.id;
    }
}
