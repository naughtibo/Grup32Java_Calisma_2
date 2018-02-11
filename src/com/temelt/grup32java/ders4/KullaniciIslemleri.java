package com.temelt.grup32java.ders4;

import java.util.Scanner;

public class KullaniciIslemleri {

    public void giris() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kullanıcı Adınızı Giriniz:");
        String kullaniciAdi = scanner.nextLine();
        System.out.println("Kullanıcı Sifrenizi Giriniz:");
        String kullaniciSifre = scanner.nextLine();
        if (kullaniciAdi.equals("admin")) {
            if (kullaniciSifre.equals("admin"))
                adminMenuGoster();
            else
                System.out.println("Kullanıcı Şifreniz Hatalı");
        } else if (kullaniciAdi.equals("user")) {
            if (kullaniciSifre.equals("user"))
                userMenuGoster();
            else
                System.out.println("Kullanıcı Şifreniz Hatalı");

        } else {
            System.out.println("Kullanıcı Adınız Hatalı");
        }
    }

    private void adminMenuGoster() {
        System.out.println("Admin İşlemleri");
        System.out.println("1 - Karekök için 1 giriniz");
        System.out.println("2 - Toplama için 2 giriniz");
        System.out.println("3 - Çıkarma için 3 giriniz");
        System.out.println("4 - Çarpma için 4 giriniz");
        System.out.println("5 - Bölme için 5 giriniz");
        Scanner scanner = new Scanner(System.in);
        int kullaniciGirisi = scanner.nextInt();
        if (kullaniciGirisi == 1) {
            KarekokAlgoritamasi karekokAlgoritamasi = new KarekokAlgoritamasi();
            karekokAlgoritamasi.tamKarekokBulma();
        } else if (kullaniciGirisi == 2) {
            aritmetikIslemler(1);
        } else if (kullaniciGirisi == 3) {
            aritmetikIslemler(2);
        } else if (kullaniciGirisi == 4) {
            aritmetikIslemler(3);
        } else if (kullaniciGirisi == 5) {
            aritmetikIslemler(4);
        } else {
            System.out.println("Yanlış Giriş Yaptınız");
        }
    }

    private void userMenuGoster() {
        System.out.println("User İşlemleri");
        System.out.println("1 - Toplama için 1 giriniz");
        System.out.println("2 - Çıkarma için 2 giriniz");
        Scanner scanner = new Scanner(System.in);
        int kullaniciGirisi = scanner.nextInt();
        if (kullaniciGirisi == 1) {
            aritmetikIslemler(1);
        } else if (kullaniciGirisi == 2) {
            aritmetikIslemler(2);
        } else {
            System.out.println("Yanlış Giriş Yaptınız");
        }
    }

    public void aritmetikIslemler(int islemTipi) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Sayıyı giriniz:");
        int deger1 = scanner.nextInt();
        System.out.println("2. Sayıyı giriniz:");
        int deger2 = scanner.nextInt();
        if (islemTipi == 1) {
            System.out.println("Sonuç :" + (deger1 + deger2));
        } else if (islemTipi == 2) {
            System.out.println("Sonuç :" + (deger1 - deger2));
        } else if (islemTipi == 3) {
            System.out.println("Sonuç :" + (deger1 * deger2));
        } else {
            System.out.println("Sonuç :" + (deger1 / deger2));
        }
    }
}
