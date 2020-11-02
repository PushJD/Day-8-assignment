package com.OM;

import java.util.Scanner;

public class Employee {
    Scanner sc=new Scanner(System.in);
    String name;
    int age;
    Double salary;
    String designation;

    public void getDetails() {
        System.out.println("Enter the name, age, salary, and designation respectively^^");
        name=sc.next();
        age=sc.nextInt();
        salary=sc.nextDouble();
        designation=sc.next();
    }
    public void displayDetails() {
        System.out.println(name+" "+age+" "+salary+" "+designation);
    }

}
