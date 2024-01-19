package com.mycompany.inheritanceoop;
import java.util.Scanner;
public class InheritanceOOP {
    
    public static void main(String[] args) {
        Scanner vito = new Scanner (System.in);
         boolean lagi = true;
         int input, keputusan;
        
        
        while (lagi) {
            System.out.println("========== Menu Program Bangun Ruang ==========");
            System.out.println(""
                + "\n1. BOLA"
                + "\n2. BALOK"
                + "\n3. TABUNG"
                + "\n4. LIMAS SEGITIGA");
            System.out.println("=================================");
            System.out.print("PILIHAN ANDA : ");
          input = vito.nextInt();
         
          switch (input){
            case 1:
                 Bola Bola = new Bola();
            System.out.println("=====VOLUME, LUAS PERMUKAAN BOLA=====");
            System.out.print("Masukkan r dari bola : ");
            Bola.r = vito.nextDouble();
            Bola.volume();
            Bola.LuasP();
            System.out.print("APAKAH ANDA AKAN LANJUT ? (1. ya 2. tidak)");
            System.out.print("PILIHAN ANDA : ");
        keputusan = vito.nextInt();

         if (keputusan == 1) {
            lagi = true;
           } 
           else if (keputusan == 2) {
            lagi = false;
           }
             break;
        
            case 2:
                Balok Balok = new Balok();
            System.out.println("=====VOLUME, LUAS PERMUKAAN BALOK=====");
            System.out.print("Masukkan panjang dari balok : ");
            Balok.p = vito.nextDouble();
            System.out.print("Masukkan lebar dari Balok : ");
            Balok.l = vito.nextDouble();
            System.out.print("Masukkan tinggi dari Balok : ");
            Balok.t = vito.nextDouble();
            Balok.volume();
            Balok.LuasP();
            System.out.print("APAKAH ANDA AKAN LANJUT ? (1. ya 2. tidak)");
            System.out.print("PILIHAN ANDA : ");
        keputusan = vito.nextInt();

         if (keputusan == 1) {
            lagi = true;
           } 
           else if (keputusan == 2) {
            lagi = false;
           }
             break;
             
            case 3:
                Tabung Tabung = new Tabung ();
            System.out.println("=====VOLUME, LUAS PERMUKAAN TABUNG=====");
            System.out.print("Masukkan jari jari dari tabung : ");
            Tabung.r= vito.nextDouble();
            System.out.print("Masukkan tinggi dari tabung : ");
            Tabung.t = vito.nextDouble();
            Tabung.volume();
            Tabung.LuasP();
            System.out.println("APAKAH ANDA AKAN LANJUT ? (1. ya 2. tidak)");
            System.out.print("PILIHAN ANDA : ");
            keputusan = vito.nextInt();

          
         if (keputusan == 1) {
            lagi = true;
           } 
           else if (keputusan == 2) {
            lagi = false;
           }
             break;
             
             
             case 4:
                 LimasSegitiga LimasSegitiga = new LimasSegitiga();
            System.out.println("=====VOLUME, LUAS PERMUKAAN LIMAS SEGITIGA=====");
            System.out.print("Masukkan alas : ");
            LimasSegitiga.a = vito.nextDouble();
            System.out.print("Masukkan tinggi alas : ");
            LimasSegitiga.t = vito.nextDouble();
            System.out.print("Masukkan tinggi limas : ");
            LimasSegitiga.tl = vito.nextDouble();
            System.out.print("Masukkan tinggi sisi tegak : ");
            LimasSegitiga.tst = vito.nextDouble();
            LimasSegitiga.volume();
            LimasSegitiga.LuasP();
            System.out.print("APAKAH ANDA AKAN LANJUT ? (1. ya 2. tidak)");
            System.out.print("PILIHAN ANDA : ");
        keputusan = vito.nextInt();

         if (keputusan == 1) {
            lagi = true;
           } 
           else if (keputusan == 2) {
            lagi = false;
           }
             break;
           }
        }
    }
}
