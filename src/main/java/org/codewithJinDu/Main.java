package org.codewithJinDu;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        displayList();
    }

    public static void callContact(String name){
        System.out.println("Calling " + name);
    }
    public static void saveContact(String name, String email, long number){
        System.out.println("Saving contact" + name + " : " + number + " : " + email);
    }
    public static void searchContact(String name, long number){
        System.out.println("searching " + name + " : " + number);
    }



    public static void displayList(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hi there, what would you want to do?(1, 2, 3, 4)");
        System.out.println("1. Call contact");
        System.out.println("2. Save Contact");
        System.out.println("3. Search Contact");

         int attributes = scanner.nextInt();
         scanner.nextInt();

         switch (attributes){
             case 1:
                 System.out.println("\nWhat contact to call  (Firstname Lastname)");
                 break;

                 case 2:
                 System.out.println("\nName of contact to save (Firstname Lastname)");

                 System.out.println("\nWhat is the phone number to save?  (+2349072627667)");

                 System.out.println("\nWhat is the email address of the contact to save?  (augusta.eshiowula@decagon.dev)");

                     break;

             case 3:
                 System.out.println("\nName of contact whose phone number you are searching? (Firstname Lastname)");

                 System.out.println("\nWhat is the phone number to save?  (+2349072627667)");
                 break;



             default:

                 break;

         }

    }
}