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

    public void sifreleme() {
        String diziKucuk1[] = new String[]{"abcdefghijklmnopqrstuvwxyz "};
        String diziKucuk2[] = new String[]{"bcdefghijlmnopqrstuvwxyzak "};

        String diziBuyuk1[] = new String[]{"ABCDEFGHIJKLMNOPQRSTUVWXYZ"};
        String diziBuyuk2[] = new String[]{" ABCDEFGHIJKLMNOPQRSTUVWXYZ"};

        for (int i = 0; i < diziKucuk1.length; i++) {
            diziKucuk1[i] = diziKucuk2[i];
            System.out.println(diziKucuk1[i]);
        }
    }

    String metin = "patID|467|name|Taner|sname|TEMEL|bdate|01/01/1956|RBC|46|L|45|H|50|LB|34|L|23|H|67";

    public void hastaneUygulama() {
        String[] dizi = metin.split("\\|");
        for (int i=0;i<dizi.length;i++)
        System.out.println(dizi[i]);

    }
}
















