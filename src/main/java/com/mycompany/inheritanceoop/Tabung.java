package com.mycompany.inheritanceoop;

public class Tabung extends BangunDatar{
        double r;
        double t;
        @Override
    double volume (){
        double volume = 3.14*r*r*t;
        System.out.println("Volume Tabung adalah " + (3.14*r*r*t));
        return volume;
    }
    
    double LuasP (){
        System.out.println("Luas Permukaan Tabung adalah " +(2*3.14*r*(r+t)));
        return 0;
    }
    
}
