package com.ferragnez.party;

import java.util.Scanner;

public class CheckGuest {
    public static void main(String[] args) {
        Scanner name = new Scanner(System.in);
        System.out.println("What is your name?");
        String userName = name.nextLine();

        String[] guests = {
                "Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi", "Bebe Vio",
                "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic"
        };

        boolean isOnGuestList = false;
        int index = 0;

        while (!isOnGuestList && index < guests.length) {
            if (guests[index].equalsIgnoreCase(userName)) {
                isOnGuestList = true;
            }
            index++;
        }

        // do the same thing with "for"
        // boolean isOnGuestList = false
        // for (index = 0; !isOnGuestList && index < guests.length ; index++) {
        // if (guests[index].equalsIgnoreCase(userName)) {
        // isOnGuestList = true;}}

        if (isOnGuestList == true) {
            System.out.println("Enjoy the party, " + userName + "!");
        } else {
            System.out.println("Sorry, " + userName + ", you're not on the guest list.");
        }

        name.close();
    }
}
