package org.codewithJinDu;

import org.codewithJinDu.models.Contact;
import org.codewithJinDu.models.Phonebook;

public class Run {
    public static void main(String[] args) {
        Phonebook phonebook = new Phonebook();
        Contact augusta = new Contact("Augusta",
                "augusta@decagon.dev",
                "Edo Tech-Park",
                "09012345678");
        Contact peter = new Contact("Peter",
                "peter@decagon.dev",
                "Edo Tech-Park",
                "09053456789");

        System.out.println(phonebook.saveContact(augusta));
        System.out.println(phonebook.saveContact(peter));

        System.out.println(phonebook.searchContact("Augusta"));
        System.out.println(phonebook.searchContact("Peter"));


        System.out.println(augusta);
        System.out.println(phonebook);

        System.out.println(phonebook.deleteContact("Peter"));
        System.out.println(phonebook.deleteContact("Peter"));
        System.out.println(phonebook);

    }
}
