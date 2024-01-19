package com.mycompany.inheritanceoop;

public class Balok extends BangunDatar {
   double p;
   double l;
   double t;
  @Override
  double volume(){
      
      System.out.println("Volume Balok Adalah : " + (p*l*t));
      return 0;
   }
  @Override
  double LuasP(){
      double LuasP = 2*(p*l+p*t+l*t);
      System.out.println("Luas Permukaan Balok adalah "+ (2*(p*l+p*t+l*t)));
      return LuasP;
  }
}
