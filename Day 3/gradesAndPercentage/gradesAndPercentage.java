package com.letsupgrade.java;

import java.util.Scanner;

public class gradesAndPercentage {
    String name;
    int roll;
    char section, grade;
    int math,phy,chem,eng,comp;
    float total;

    public void getDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter your Name : ");
        name = sc.nextLine();
        System.out.print("Enter Roll No.: ");
        roll = Integer.parseInt(sc.nextLine());
        System.out.print("Enter Section : ");
        section = sc.next().charAt(0);
        sc.nextLine();

        System.out.println("Enter Your Marks");
        System.out.print("Math :");
        math = Integer.parseInt(sc.nextLine());
        System.out.print("Physics : ");
        phy = Integer.parseInt(sc.nextLine());
        System.out.print("Chemistry : ");
        chem = Integer.parseInt(sc.nextLine());
        System.out.print("English : ");
        eng = Integer.parseInt(sc.nextLine());
        System.out.print("CS : ");
        comp = Integer.parseInt(sc.nextLine());
    }

    private float calcPercentage() {
        total = math+phy+chem+eng+comp;
        float percentage = (total/500)*100;
        if(percentage >= 95) {
            grade = 'O';
        } else if(percentage >= 90) {
            grade = 'A';
        } else if(percentage >= 80) {
            grade = 'B';
        } else if(percentage >= 60) {
            grade = 'C';
        } else if(percentage >= 50) {
            grade = 'D';
        } else if(percentage >= 40) {
            grade = 'E';
        } else {
            grade = 'F';
        }
        return percentage;
    }

    public void display() {
        System.out.println("\n\t\tTotal Report");
        System.out.println("--------------------------------");
        System.out.println("Name        : "+name);
        System.out.println("Roll No.    : "+roll);
        System.out.println("Section     : "+section);
        System.out.println("Percentage  : "+calcPercentage());
        System.out.println("Grade       : "+grade);
    }
}
