package com.ferragnez.party;

import java.util.Scanner;

public class CheckGuest {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String[] guests = {"Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi", "Bebe Vio", "Luis Muriel", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic"};
        //System.out.println(guests[0]);

        System.out.println("Welcome to the party! What's your name?");

        String guestName = input.nextLine();

        boolean isGuest = false;

        for (int i = 0; i < guests.length; i++) {
            if (guestName.equalsIgnoreCase(guests[i])) {
                System.out.println("Welcome to the party, " + guestName + "!");
                isGuest = true;
                break;
            } 
        }

        if (isGuest == false) {
            System.out.println("Sorry, you're not on the list. Please leave.");
        }

        System.out.println("Thank you for coming to the party!");

    }
}
