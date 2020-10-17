package com.letsupgrade.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("Please enter any 5 numbers :");
        for(int i =0;i<5;i++) {
            System.out.print("Enter number "+(i+1)+" : ");
            arr[i]=sc.nextInt();
        }
        System.out.print("\nSum of the user entered values is : "+add(arr));
    }

    public static int add (int a[]) {
        int total = 0;
        for(int i=0;i<5;i++) {
            total += a[i];
        }
        return total;
    }
}
