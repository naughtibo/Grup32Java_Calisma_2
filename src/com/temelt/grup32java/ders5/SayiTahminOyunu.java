package com.temelt.grup32java.ders5;

import java.util.Random;
import java.util.Scanner;

public class SayiTahminOyunu {

    Scanner scanner = new Scanner(System.in);

    public void kullaniciGiris() {
        System.out.println("Kullanici Adınızı Giriniz");
        String kullaniciAdi = scanner.nextLine();

        System.out.println("Şifrenizi Giriniz");
        String sifre = scanner.nextLine();

        if (kullaniciAdi.equals("a") && sifre.equals("a")) {
            menuGoster();
        } else {
            System.out.println("Hatalı Giriş");
        }
    }

    public void menuGoster() {
        for (int i=1;i>0;i++) {
            System.out.println("Çıkmak için 1 e basınız :");
            System.out.println("Say Tahmin Oyunu için 2 e basınız :");
            int islemTipi = scanner.nextInt();

            if (islemTipi == 1) {
                System.exit(0);
            } else {
                sayBul();
            }
        }
    }

    public void sayBul() {
        Random random = new Random();
        int tahmin = random.nextInt(50) + 1;

        for (int i = 50; i > 0; i--) {
            System.out.println("Tahmin giriniz");
            int kullaniciTahmini = scanner.nextInt();
            if (kullaniciTahmini == tahmin) {
                System.out.println("Tebrikler Puanınız :" + i);
                break;
            } else if (kullaniciTahmini < tahmin) {
                System.out.println("Daha Büyük Giriniz");
            } else {
                System.out.println("Daha Küçük Giriniz");
            }
        }
    }
}
