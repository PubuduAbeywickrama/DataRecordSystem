package com.example.datarecordsystem;

public class DataClass {
    private String dataName;
    private String dataAddress;
    private String dataContact;
    private String dataImage;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    private String key;
    public DataClass(String dataName, String dataAddress, String dataContact, String dataImage) {
        this.dataName = dataName;
        this.dataAddress = dataAddress;
        this.dataContact = dataContact;
        this.dataImage = dataImage;
    }

    public DataClass(){

    }

    public String getDataName() {
        return dataName;
    }

    public void setDataName(String dataName) {
        this.dataName = dataName;
    }

    public String getDataAddress() {
        return dataAddress;
    }

    public void setDataAddress(String dataAddress) {
        this.dataAddress = dataAddress;
    }

    public String getDataContact() {
        return dataContact;
    }

    public void setDataContact(String dataContact) {
        this.dataContact = dataContact;
    }

    public String getDataImage() {
        return dataImage;
    }

    public void setDataImage(String dataImage) {
        this.dataImage = dataImage;
    }
}
