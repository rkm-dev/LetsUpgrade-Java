package com.letsupgrade.java;

import java.util.Scanner;

public class Pilot extends Employee{

    public Pilot(String designation) {
        super(designation);
    }

    Scanner sc = new Scanner(System.in);
    private String currentAirline, planeSpeciality;
    private int Experience;

    public void getQuals() {
        System.out.println("--------------------------------");
        System.out.print("Plane Speciality          : ");
        planeSpeciality = sc.nextLine();
        System.out.print("No. of Flights (in digits): ");
        Experience = Integer.parseInt(sc.nextLine());
        System.out.print("current Airline           : ");
        currentAirline = sc.nextLine();
    }

    public void putQuals() {
        System.out.println("--------------------------------");
        System.out.println("Plane Speciality            : "+planeSpeciality);
        System.out.println("Experience (No. of Flights) : "+Experience);
        System.out.println("current Airline             : "+currentAirline);
    }
}
