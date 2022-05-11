package org.codewithJinDu.models;
import java.util.*;
public class Contact {
    private String name, emailAddress, homeAddress;
    private List<String> listOfPhoneNumbers;

    public Contact(){

    }
    public Contact(String name, String emailAddress, String homeAddress, String phoneNumber1) {
        this.name = name;
        this.emailAddress = emailAddress;
        this.homeAddress = homeAddress;
        this.listOfPhoneNumbers = new ArrayList<>();
        listOfPhoneNumbers.add(phoneNumber1);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    public List<String> getListOfPhoneNumbers() {
        return listOfPhoneNumbers;
    }

    public void setListOfPhoneNumbers(List<String> listOfPhoneNumbers) {
        this.listOfPhoneNumbers = listOfPhoneNumbers;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", homeAddress='" + homeAddress + '\'' +
                ", listOfPhoneNumbers=" + listOfPhoneNumbers +
                '}';
    }
}
