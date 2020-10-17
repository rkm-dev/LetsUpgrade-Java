package com.letsupgrade.java;

public class Main {

    public static void main(String[] args) {
        Avengers[] avenger = new Avengers[7];

        for(int i=0;i<7;i++) {
            avenger[i] = new Avengers();
        }

        System.out.println("Enter the details of seven Avengers");
        for(int i=0;i<7;i++) {
            avenger[i].getDetails(i+1);
            System.out.println();
        }

        System.out.println("\n\t\t\t\tDetails of seven Avengers");
        System.out.println("-------------------------------------------------------------------------");
        for(int i=0;i<7;i++) {
            avenger[i].displayDetails(i+1);
        }
    }
}
