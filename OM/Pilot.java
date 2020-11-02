package com.OM;

public class Pilot extends Employee{
    static int flightcount=0;
    public  void doFly()
    {
        flightcount++;
        System.out.println("Pilot flew a plane without any trouble!");
        System.out.println("Total Count: "+flightcount);
    }
}
