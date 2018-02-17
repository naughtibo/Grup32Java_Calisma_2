package com.temelt.grup32java.ders5;

import java.util.Scanner;

public class OrtalamaHesaplama {

    public void ortalamaHesaplama() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ortalama Sayısı Giriniz:");
        int sayiAdedi = scanner.nextInt();
        int toplam = 0;
        for (int i = 0; i < sayiAdedi; i++) {
            System.out.println("Değer gir");
            toplam += scanner.nextInt();
        }
        System.out.println("Ortalama : " + (toplam / sayiAdedi));
    }


    public void enBuyukveEnKucukBulan() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sayı adedi Giriniz:");
        int sayiAdedi = scanner.nextInt();
        int enKucuk = 0, enBuyuk = 0;
        for (int i = 0; i < sayiAdedi; i++) {
            System.out.println("Deger gir:");
            int girilenDeger = scanner.nextInt();
            if (i == 0) {
                enBuyuk = girilenDeger;
                enKucuk = girilenDeger;
            }
            if (girilenDeger > enBuyuk) {
                enBuyuk = girilenDeger;
            }
            if (girilenDeger < enKucuk) {
                enKucuk = girilenDeger;
            }
        }
        System.out.println(String.format("En Buyuk: %d En Küçük :%d", enBuyuk, enKucuk));
    }

    public void ondanBuyukOlanlar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sayı adedi Giriniz:");
        int sayiAdedi = scanner.nextInt();
        int sayac=0;
        for (int i = 0; i < sayiAdedi; i++) {
            System.out.println("Deger gir:");
            int girilenDeger = scanner.nextInt();
            if (girilenDeger>10) {
                sayac++;
            }
        }
        System.out.println(String.format("10 dan büyük olan sayı aded,: %d ", sayac));
    }

    public void sayiOkutma() {
        Scanner scanner = new Scanner(System.in);
        int sayi = 0;
        int ikiKati = 0;
        do {
            System.out.println("Sayı Giriniz:");
            sayi = scanner.nextInt();
            ikiKati += 2 * sayi;
        } while (sayi != 0);

        System.out.println("Sonuç :" + ikiKati);
    }
}













