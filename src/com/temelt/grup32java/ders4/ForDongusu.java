package com.temelt.grup32java.ders4;

import java.util.Scanner;

public class ForDongusu {

    public void forDongusu() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Indis :" + i);
        }
    }

    public void ciftSayilar() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0)
                System.out.println("Indis :" + i);
        }
    }

    public void ucVeyaBesinKati() {
        for (int i = 0; i < 100; i++) {
            if (i % 3 == 0 || i % 5 == 0)
                System.out.println("Indis :" + i);
        }
    }

    public void asalSayiBulma() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Deger giriniz:");
        int girilenDeger = scanner.nextInt();
        boolean sayiAsal =false;
        for (int i = 2; i < girilenDeger; i++) {
            if(girilenDeger%i==0){
                System.out.println("Asal Değildir");
                sayiAsal=true;
            }
        }
        if(!sayiAsal)
            System.out.println("Sayı Asaldır");

    }
}
