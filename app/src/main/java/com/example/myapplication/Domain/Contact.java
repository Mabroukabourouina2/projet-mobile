package com.example.myapplication.Domain;

public class Contact {
    private String name;
    private String picAddress;

    public Contact(String name,String picAddress) {
        this.name = name;
        this.picAddress=picAddress;

}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getPicAddress() {
        return picAddress;
    }

    public void setPicAddress(String name) {
        this.picAddress = picAddress;
    }
}
