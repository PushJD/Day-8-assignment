package com.OM;

public class Doctor extends Employee {
    static int surgecount=0;
    public void doSurgery()
    {
        surgecount++;
        System.out.println("A doctor performed Succesful surgery");
        System.out.println("Total Count: "+surgecount);
    }

}
