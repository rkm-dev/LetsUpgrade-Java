package com.letsupgrade.java;

import java.util.Scanner;
import java.time.Period;
import java.time.LocalDate;

public class SalaryAndTax {
    String name;
    int day, month, year, salary, annualSalary;

    public void getDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter your name : ");
        name = sc.nextLine();

        System.out.println("Enter you D.O.B (Day, Month, Year) Separately");
        System.out.print("Day (between 1 & 31)   : ");
        day = Integer.parseInt(sc.nextLine());
        System.out.print("Month (between 1 & 12) : ");
        month = Integer.parseInt(sc.nextLine());
        System.out.print("Year (Four digit year) : ");
        year = Integer.parseInt(sc.nextLine());
        System.out.println();

        System.out.print("Monthly Salary (in digits) : ");
        salary = Integer.parseInt(sc.nextLine());

    }

    private int calcAge() {
        LocalDate birthDate = LocalDate.of(year, month, day);
        LocalDate today = LocalDate.now();
        return Period.between(birthDate, today).getYears();
    }

    private float calcTax() {
        int total = salary*12;
        if(total >= 500000) {
            return (float)(20.0/100)*total;
        } else if(total >= 400000) {
            return (float)(15.0/100)*total;
        } else if(total >= 300000) {
            return (float)(10.0/100)*total;
        } else {
            return (float)(5.0/100)*total;
        }
    }

    public void display() {
        System.out.println("\n\t\tFull Details");
        System.out.println("-------------------------");
        System.out.print("Employee Name   : "+name);
        System.out.print("\nAge             : "+calcAge());
        System.out.print("\nAnnual Salary   : "+(salary*12));
        System.out.print("\nTotal Tax       : "+calcTax());
    }

}
