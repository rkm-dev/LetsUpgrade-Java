package com.letsupgrade.java;

import java.util.Scanner;

public class Question {
    private final String ques;
    private final String [] opt= new String[4];
    private final int ans;
    Scanner sc = new Scanner(System.in);

    Question (String q, String o1, String o2,String o3, String o4,String a) {
        ques=q;
        opt[0]=o1;
        opt[1]=o2;
        opt[2]=o3;
        opt[3]=o4;
        ans=Integer.parseInt(a);
    }

    public boolean askQues() {
        System.out.println(ques);
        for(int i =0;i<4;i++) {
            System.out.println((i+1)+") "+opt[i]);
        }
        System.out.print("Choose your option between (1 and 4) : ");
        int userInput = sc.nextInt();
        return userInput == ans;
    }
}
