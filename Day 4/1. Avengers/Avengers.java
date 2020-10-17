package com.letsupgrade.java;

import java.util.Scanner;

public class Avengers {
    String name,power,weapon,planet;
    int age;

    public void getDetails(int i) {
        Scanner sc = new Scanner(System.in);
        System.out.print("["+i+"] Enter Avenger's name : ");
        name = sc.nextLine();
        System.out.print("["+i+"] Enter the age : ");
        age = Integer.parseInt(sc.nextLine());
        System.out.print("["+i+"] Enter power : ");
        power = sc.nextLine();
        System.out.print("["+i+"] Enter weapon of choice : ");
        weapon = sc.nextLine();
        System.out.print("["+i+"] Enter from planet : ");
        planet = sc.nextLine();
    }

    public void displayDetails(int i) {
        System.out.println("["+i+"] "+name+", from planet "+planet+", according to earth years, age : "+age+", " +
                "has power of "+power+", uses weapon of choice as "+weapon);
    }
}
