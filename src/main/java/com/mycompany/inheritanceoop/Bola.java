
package com.mycompany.inheritanceoop;

public class Bola extends BangunDatar {
    
     double r;
    @Override
    double volume(){   
         System.out.println("Menghitung volume bola " + (4/3*3.14*r*r*r));
        return 0;
    }
 @Override
 double LuasP(){
     System.out.println("Menghitung luas permukaan bola : " + (4*3.14*r*r));
     return 0;
 }   
}
