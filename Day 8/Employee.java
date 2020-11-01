package com.letsupgrade.java;

import java.util.Scanner;

public class Employee {
    private String name;
    private final String designation;
    private int age, salary;

    Scanner sc = new Scanner(System.in);

    public Employee(String designation) {
        this.designation = designation;
    }

    public void getDetails() {
        System.out.println("Please Enter Following Details");
        System.out.println("----------------------------------------");
        System.out.print("Name   : ");
        name = sc.nextLine();
        System.out.print("Age    : ");
        age = Integer.parseInt(sc.nextLine());
        System.out.print("Salary : ");
        salary = Integer.parseInt(sc.nextLine());
    }

    public void getQuals() {

    }

    public void displayDetails() {
        System.out.println("----------------------------------------");
        System.out.println("Name        : "+name);
        System.out.println("Age         : "+age);
        System.out.println("Salary      : "+salary);
        System.out.println("Designation : "+designation);
    }

    public void putQuals() {

    }

}
