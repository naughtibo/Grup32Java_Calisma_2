package com.temelt.grup32java.ders4;

import java.util.Scanner;

public class KarekokAlgoritamasi {

    /**
     *  iterasyonlar
     *  indis farkMiktari toplam
     *  0       1          1
     *  1       3          4
     *  2       5          9
     *  ....
     */
    public void tamKarekokBulma(){
        Scanner scanner =new Scanner(System.in);
        System.out.println("Tam Karekök için deger giriniz:");
        int girilenDeger = scanner.nextInt();
        int farkMiktari=1;
        int toplam=0;
        System.out.println(Math.sqrt(girilenDeger));

        for (int i=0;i<girilenDeger;i++){
            toplam = toplam +farkMiktari;
            if(girilenDeger<toplam){
                System.out.println(i);
                break;
            }
            farkMiktari =farkMiktari+2;
        }
    }
}
