package com.OM;

public class Main {

    public static void main(String[] args) {

        Doctor[] doctors=new Doctor[3];
        //creating objects for Doctors
        for(int i=0;i<3;i++)
        {
            doctors[i]=new Doctor();
        }

        //get details
        for(int i=0;i<3;i++)
        {
            doctors[i].getDetails();
        }
        //print details
        for(int i=0;i<3;i++)
        {
            doctors[i].displayDetails();
            doctors[i].doSurgery();
        }


        Engineer[] engineers=new Engineer[3];
        //creating objects for Engineers
        for(int i=0;i<3;i++)
        {
            engineers[i]=new Engineer();
        }

        //get details
        for(int i=0;i<3;i++)
        {
            engineers[i].getDetails();
        }
        //print details
        for(int i=0;i<3;i++)
        {
            engineers[i].displayDetails();
            engineers[i].doResearch();
        }


        Pilot[] pilots=new Pilot[3];
        //creating objects for Pilots
        for(int i=0;i<3;i++)
        {
            pilots[i]=new Pilot();
        }

        //get details
        for(int i=0;i<3;i++)
        {
            pilots[i].getDetails();
        }
        //print details
        for(int i=0;i<3;i++)
        {
            pilots[i].displayDetails();
            pilots[i].doFly();
        }

    }
}
