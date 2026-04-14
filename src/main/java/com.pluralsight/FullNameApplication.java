package com.pluralsight;

import java.util.Scanner;

public class FullNameApplication {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        System.out.println("Please enter your name");
        String firstName = askString("Please enter your first name: ");
        String middleName = askString("Please enter your middle name: ");
        String lastName = askString("Please enter your last name: ");
        String suffix = askString("Please enter your suffix: ");
        String fullName =  formatName(firstName, middleName, lastName,suffix);
        System.out.printf("Full Name: %s",fullName);
    }

    public static String askString(String prompt){
        System.out.printf(prompt);
        return scanner.nextLine().trim();
    }

    public static String formatName(String firstName, String middleName, String lastName, String suffix){
        if (middleName.equals("") && suffix.equals("")) {
            return firstName + " " + lastName;
        } else if (!middleName.equals("") && suffix.equals("")){
            return firstName + " " + middleName + ". " + lastName;
        } else if(middleName.equals("") && !suffix.equals("")){
            return firstName + " " + lastName + ", " + suffix;
        }
        return firstName + " " + middleName + ". " + lastName + ", " + suffix;
    }


}
