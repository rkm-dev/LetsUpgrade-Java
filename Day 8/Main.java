package com.letsupgrade.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Employee[] d = new Doctor[3];
        Employee[] e = new Engineer[3];
        Employee[] p = new Pilot[3];

        Scanner sc = new Scanner(System.in);
        int c;

        do {
            System.out.println("\n\nEmployee Registry --- Please choose any of the following actions");
            System.out.println("------------------------------------------------------------------");
            System.out.println("1. Enter details of Doctors");
            System.out.println("2. Enter details of Engineers");
            System.out.println("3. Enter details of Pilots");
            System.out.println();
            System.out.println("4. Display details of Doctors");
            System.out.println("5. Display details of Engineers");
            System.out.println("6. Display details of Pilots");
            System.out.print("Your Choice : ");
            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    for(int i=0;i<3;i++) {
                        d[i] = new Doctor("Doctor");
                        System.out.println("\nEnter details of Doctor "+(i+1));
                        d[i].getDetails();
                        d[i].getQuals();
                    }
                    break;
                case 2:
                    for(int i=0;i<3;i++) {
                        e[i] = new Engineer("Engineer");
                        System.out.println("\nEnter details of Engineer "+(i+1));
                        e[i].getDetails();
                        e[i].getQuals();
                    }
                    break;
                case 3:
                    for(int i=0;i<3;i++) {
                        p[i] = new Pilot("Pilot");
                        System.out.println("\nEnter details of Pilot "+(i+1));
                        p[i].getDetails();
                        p[i].getQuals();
                    }
                    break;
                case 4:
                    if(d[1]==null) {
                        System.out.println("No records yet");
                    }else{
                        for(int i=0;i<3;i++) {
                            System.out.println("\nDetails of Doctors "+(i+1));
                            d[i].displayDetails();
                            d[i].putQuals();
                        }
                    }
                    break;
                case 5:
                    if(e[1]==null) {
                        System.out.println("No records yet");
                    }else{
                        for(int i=0;i<3;i++) {
                            System.out.println("\nDetails of Engineers "+(i+1));
                            e[i].displayDetails();
                            e[i].putQuals();
                        }
                    }
                    break;
                case 6:
                    if(p[1]==null) {
                        System.out.println("No records yet");
                    }else{
                        for(int i=0;i<3;i++) {
                            System.out.println("\nDetails of Pilots "+(i+1));
                            p[i].displayDetails();
                            p[i].putQuals();
                        }
                    }
                    break;
                default:
                    System.out.println("Please Enter a correct Choice");
            }

            System.out.print("Do you wish to continue? (1 for Yes  or  0 for No) : ");
            c = Integer.parseInt(sc.nextLine());
        } while(c!=0);
    }
}
