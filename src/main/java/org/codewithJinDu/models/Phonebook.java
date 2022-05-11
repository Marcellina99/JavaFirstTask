package org.codewithJinDu.models;

import java.util.*;

public class Phonebook {
    Map<String, Contact> contactList;

    public Phonebook() {
        this.contactList = new HashMap<>();
    }

    // search, call, save, delete, getallcontacts

    public Contact searchContact(String name){
        return contactList.get(name);
    }

    public String saveContact(Contact contact){
        contactList.put(contact.getName(), contact);
        return "Contact " + contact.getName() + " saved in phone book";
    }


    public String deleteContact(String contactName){
        if (contactList.containsKey(contactName)) {
        contactList.remove(contactName);
        return "Contact " + contactName + " deleted from phone book." ;
        }
        return "Contact not found";
    }




//    public String search(String name){
//
//
//    }

    public Map<String, Contact> getContactList() {
        return contactList;
    }

    public void setContactList(Map<String, Contact> contactList) {
        this.contactList = contactList;
    }

    @Override
    public String toString() {
        return "Phonebook{" +
                "contactList=" + contactList +
                '}';
    }
}
