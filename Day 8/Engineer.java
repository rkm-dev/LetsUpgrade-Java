package com.letsupgrade.java;

import java.util.Scanner;

public class Engineer extends Employee {

    public Engineer(String designation) {
        super(designation);
    }

    Scanner sc = new Scanner(System.in);
    private String currentCompany, Field;
    private int Experience;

    public void getQuals() {
        System.out.println("--------------------------------");
        System.out.print("Field                 : ");
        Field = sc.nextLine();
        System.out.print("Experience (in digits): ");
        Experience = Integer.parseInt(sc.nextLine());
        System.out.print("Current Company       : ");
        currentCompany = sc.nextLine();
    }

    public void putQuals() {
        System.out.println("--------------------------------");
        System.out.println("Field            : "+Field);
        System.out.println("Experience       : "+Experience);
        System.out.println("Current Company  : "+currentCompany);
    }
}
