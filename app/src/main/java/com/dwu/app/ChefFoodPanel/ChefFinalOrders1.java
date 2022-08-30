package com.dwu.app.ChefFoodPanel;

public class ChefFinalOrders1 {

    private String Address,GrandTotalPrice,MobileNumber,Name,RandomUID,Status,Button;

    public ChefFinalOrders1(String address, String grandTotalPrice, String mobileNumber, String name, String randomUID, String status, String button) {
        Address = address;
        GrandTotalPrice = grandTotalPrice;
        MobileNumber = mobileNumber;
        Name = name;
        Button = button;
        RandomUID = randomUID;
        Status = status;
    }

    public ChefFinalOrders1()
    {

    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getGrandTotalPrice() {
        return GrandTotalPrice;
    }

    public void setGrandTotalPrice(String grandTotalPrice) {
        GrandTotalPrice = grandTotalPrice;
    }

    public String getMobileNumber() {
        return MobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        MobileNumber = mobileNumber;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getRandomUID() {
        return RandomUID;
    }

    public void setRandomUID(String randomUID) {
        RandomUID = randomUID;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public String getButton(){return Button;}
    public void setButton(String button){Button=button;}
}
