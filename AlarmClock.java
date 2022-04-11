package com.company;

public class AlarmClock {


    public void method(int n,String str){

        boolean v = Boolean.parseBoolean(str);

        if(v && n>=1 && n<=5)
            System.out.println("10:00");
        else if(v && (n==0 || n==6 ))
            System.out.println("off");
        else if(!v && n>=1 && n<=5)
            System.out.println("7:00");
        else if(!v && (n==0 || n==6 ))
            System.out.println("10:00");
        else
            System.out.println("error");

    }
}
