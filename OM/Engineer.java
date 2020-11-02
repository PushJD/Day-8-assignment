package com.OM;

public class Engineer extends Employee {
    static int researchcount=0;
    public void doResearch()
    {
        researchcount++;
        System.out.println("An engineer did research!");
        System.out.println("Total Count:"+researchcount);
    }

}
