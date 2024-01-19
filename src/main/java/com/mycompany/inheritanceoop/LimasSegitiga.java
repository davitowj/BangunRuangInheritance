package com.mycompany.inheritanceoop;
public class LimasSegitiga extends BangunDatar {
    double tl;
    double t;
    double a;
    double tst;
    @Override
    double volume (){
        System.out.println("Volume Limas Segitiga adalah : " + (a*t*tl/6));
        return 0;
    }
    @Override
    double LuasP (){
        System.out.println("Luas Permukaan Limas Segitiga adalah : " + (1/2*a*t+3*a*tst));
        return 0;
    }
}
    

