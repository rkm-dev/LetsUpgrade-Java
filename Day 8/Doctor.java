package com.letsupgrade.java;

import java.util.Scanner;

public class Doctor extends Employee {

    public Doctor(String designation) {
        super(designation);
    }

    Scanner sc = new Scanner(System.in);
    private String currentHospital, speciality;
    private int yearsOfPractice;

    public void getQuals() {
        System.out.println("--------------------------------");
        System.out.print("Speciality       : ");
        speciality = sc.nextLine();
        System.out.print("Experience       : ");
        yearsOfPractice = Integer.parseInt(sc.nextLine());
        System.out.print("Current Hospital : ");
        currentHospital = sc.nextLine();
    }

    public void putQuals() {
        System.out.println("--------------------------------");
        System.out.println("Speciality       : "+speciality);
        System.out.println("Experience       : "+yearsOfPractice);
        System.out.println("Current Hospital : "+currentHospital);
    }

}
