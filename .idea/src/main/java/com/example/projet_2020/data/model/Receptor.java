package com.example.projet_2020.data.model;

public class Receptor {
    String Address;
    private String Name;

    public String getName() {
        return Name;
    }
    public void setName(String name) {
        Name = name;
    }
    public String getAddress(){return Address;}

    public void setAddress(String address) {
        Address = address;
    }
    public Receptor(String address,String name) {
        Address = address;
        Name=name;
    }



}


