package com.letsupgrade.java;

public class Main {

    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee();
        e1.name = "Rahul";
        e1.age = 25;
        e1.city = "Bangalore";
        e1.display();

        e2.name = "Manish";
        e2.age = 23;
        e2.city = "New Delhi";
        e2.display();
    }
}
