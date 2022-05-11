package org.codewithJinDu;

import java.util.*;


public class Main {
    public static void main(String[] args) {
        displayList();
    }

    public static void callContact(String name){
        System.out.println("Calling " + name);
    }
    public static void saveContact(String name, long number, String email){
        System.out.println("Saving contact " + name + " : " + number + " : " + email);
    }
    public static void searchContact(String name){
        System.out.println("No Results " + name);
    }



    public static void displayList(){

        Scanner in = new Scanner(System.in);
        String name, email;

        System.out.println("Hi there, what would you want to do?(1, 2, 3, 4)");
        System.out.println("1. Call contact");
        System.out.println("2. Save Contact");
        System.out.println("3. Search Contact");
        System.out.println("4. Delete Contact");

         int attributes = in.nextInt();
         in.nextLine();

         switch (attributes){
             case 1:
                 System.out.println("\nWhat contact to call  (Firstname Lastname)");
                 name = in.nextLine();
                 break;

                 case 2:
                 System.out.println("\nName of contact to save (Firstname Lastname)");
                  name = in.nextLine();
                 System.out.println("\nWhat is the phone number to save?  (09072627667)");
                 long number = in.nextLong();
                 in.nextLine();

                 System.out.println("\nWhat is the email address of the contact to save?  (augusta.eshiowula@decagon.dev)");
                 email = in.nextLine();

                 saveContact(name, number, email);
                     break;

             case 3:
                 System.out.println("\nName of contact whose phone number you are searching? (Firstname Lastname)");
                 searchContact(in.nextLine());
                 System.out.println("No result");
                 break;



             default:

                 break;

         }

    }
}