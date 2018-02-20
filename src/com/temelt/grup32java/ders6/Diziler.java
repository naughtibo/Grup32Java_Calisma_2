package com.temelt.grup32java.ders6;

import jdk.management.resource.internal.inst.FileOutputStreamRMHooks;

import java.util.Scanner;

public class Diziler {

    public void basitDizi() {

        int[] aDizisi = new int[500];

        int bDizi[] = new int[100];

        int[] cDizi = new int[]{45, 56, 67, 789};

    }


    public void diziIslemleri() {
        int[] cDizi = new int[]{45, 56, 67, 789, 46, 234, 12};
        System.out.println(cDizi.length);
        System.out.println(cDizi[3]);
        cDizi[4] = 1000;

        for (int i = 0; i < cDizi.length; i++) {
            System.out.println(cDizi[i]);
        }
    }

    public void enBuyukEleman() {
        int[] cDizi = new int[]{45, 56, 67, 789, 46, 234, 12};
        int enBuyuk = cDizi[0];

        for (int i = 1; i < cDizi.length; i++) {

            if (enBuyuk < cDizi[i]) {
                enBuyuk = cDizi[i];
            }
        }
        System.out.println("En Buyuk Eleman" + enBuyuk);
    }

    public void diziIslemi() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("eleman Sayısını Gir:");
        int elemanSayisi = scanner.nextInt();
        int dizi[] = new int[elemanSayisi];

        for (int i = 0; i < dizi.length; i++) {
            System.out.println("Dizinin " + i + ".inci Elemanını gir");
            dizi[i] = scanner.nextInt();
        }
        for (int i = 0; i < dizi.length; i++) {
            if (i % 2 == 0) {
                dizi[i] = dizi[i] * dizi[i];
            } else
                dizi[i] = dizi[i] + 1;
        }

        for (int i = 0; i < dizi.length; i++) {
            System.out.println(dizi[i]);
        }
    }


    public void stringDiziler() {
        String[] dizi = new String[]{"Ahmet", "Mehmet", "Cemal"};

        for (int i = 0; i < dizi.length; i++)
            System.out.println(dizi[i]);
    }

    public void stringMetodlari() {
        String degisken = "Ahmet bla bla Mehmet";

        degisken.equals("");
        degisken.charAt(7);
        degisken.length();
        degisken.contains("bla");
    }

   /* public void sifreleme(String metin) {
        String diziKucuk1[] = {"abcdefghijklmnopqrstuvwxyz "};
        String diziKucuk2[] = {"bcdefghijlmnopqrstuvwxyzak "};

        String diziBuyuk1[] = new String[]{"ABCDEFGHIJKLMNOPQRSTUVWXYZ "};
        String diziBuyuk2[] = new String[]{"ABCDFGHIJKLMNOPRSTUVWXYZEQ "};
        String encryptmetin = null;
   *//*     for (int i = 0; i < diziKucuk1.length; i++) {
            //diziKucuk1[i] = diziKucuk2[i];
           // System.out.println(diziKucuk1[i]);
        }*//*
        for (int i = 0; i < metin.length(); i++) {
            encryptmetin.replace(diziKucuk2.indexOf(metin.charAt(i));
            System.out.print();
            diziKucuk2.indexOf()
            // System.out.println(metin.charAt(i));
        }
    }*/


    String metin = "patID|467|name|Taner|sname|TEMEL|bdate|01/01/1956|RBC|46|L|45|H|50|LB|34|L|23|H|67";

    public void hastaneUygulama() {
        String[] dizi = metin.split("\\|");
        for (int i = 0; i < dizi.length; i++)
            System.out.println(dizi[i]);

    }


    public void diziAlıstırma() {

        int aDizi[] = new int[]{45, 67, 546, 789, 90, 75, 0};

        System.out.println(aDizi.length);
        System.out.println(aDizi[6]);
        aDizi[5] = 200;

        for (int i = 0; i < aDizi.length; i++) {
            System.out.println(aDizi[i]);
        }
    }

    public void diziEnBuyukEleman() {
        int[] aDizi = new int[]{45, 67, 546, 789, 90, 75, 0};

        int enBuyuk = aDizi[0];
        for (int i = 1; i < aDizi.length; i++) {
            if (enBuyuk < aDizi[i])
                enBuyuk = aDizi[i];
        }
        System.out.println("Dizinin en büyük elemanı    :" + enBuyuk);


    }

    public void diziTekCift() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Dizinin eleman sayısını giriniz :");
        int elemanSayisi = scanner.nextInt();
        int aDizi[] = new int[elemanSayisi];

        for (int i = 0; i < aDizi.length; i++) {
            System.out.println("Değer Gir   :");
            aDizi[i] = scanner.nextInt();
        }

        for (int i = 0; i < aDizi.length; i++) {
            if (i % 2 == 0)
                aDizi[i] = aDizi[i] * aDizi[i];
            else
                aDizi[i] = aDizi[i] + 1;
            System.out.println("Yeni Dizi   :" + aDizi[i]);
        }
    }

    public void stringDiziIslemleri() {
        String dizi[] = new String[3];
        dizi[0] = "Ali";
        dizi[1] = "Veli";
        dizi[2] = "Deli";

        String[] aDizi = new String[]{"Mahmut", "Abbas", "Hamit"};

        for (int i = 0; i < aDizi.length; i++)
            System.out.println(aDizi[i]);
        System.out.println(aDizi.length);
    }

    public void stringIslemleri() {

        String metin = "Ahmet okula Geldi";
        //System.out.println(metin.contains(" kula "));
//        System.out.println(metin.charAt(0));
//        System.out.println(metin.charAt(1));
////        System.out.println(metin.charAt(metin.length()-1));
//        System.out.println(metin.concat(" mahmut"));
//        System.out.println(metin.isEmpty());
//        System.out.println(metin.replace("e","x"));
        // System.out.println(metin.substring(6,17));
    }

    public void encrypt(String metin) {

        String harfler = "abcdefghijklmnopqrstuvwxyz ";
        String harflerSif = "bcdefghijlmnopqrstuvwxyzak ";
        char[] sifrelimetin = new char[metin.length()];

        System.out.println("Metin   : " + metin);
        for (int i = 0; i < metin.length(); i++) {
            char deger = metin.charAt(i);
            System.out.println(deger);
            int indis = harfler.indexOf(deger);
            System.out.println(indis);
            char sifrelichar = harflerSif.charAt(indis);
            System.out.println(sifrelichar);
            sifrelimetin[i] = sifrelichar;
        }
        System.out.print("Şifreli Metin : ");

        for (int i = 0; i < sifrelimetin.length; i++) {
            System.out.print(sifrelimetin[i]);
        }

    }

    public void decrypt(String metin) {
        String harfler = "abcdefghijklmnopqrstuvwxyz ";
        String harflerSif = "bcdefghijlmnopqrstuvwxyzak ";
        char cozulmusMetin[] = new char[metin.length()];
        for (int i = 0; i < metin.length(); i++) {
            cozulmusMetin[i] = harfler.charAt(harflerSif.indexOf(metin.charAt(i)));
        }

        for (int i = 0; i < cozulmusMetin.length; i++)
            System.out.print(cozulmusMetin[i]);
    }
}
















