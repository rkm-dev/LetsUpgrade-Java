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
        System.out.print("\nThe Odd numbers from the list of 5 numbers : ");

        for(int i=0;i<5;i++) {
	        if(arr[i]%2 != 0) {
                System.out.print( arr[i] + "  ");
            }
        }
    }
}
