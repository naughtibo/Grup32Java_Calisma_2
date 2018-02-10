package com.temelt.grup32java;

import com.temelt.grup32java.ders3.BasitIfYapisi;
import com.temelt.grup32java.ders3.Ders3;

import java.util.Scanner;

public class Uygulama {

    public static void main(String[] args) {


        Ders3 ders3Nesnesi =new Ders3();
        //ders3Nesnesi.ornekMetod();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Yaşınızı Giriniz:");
        int t = scanner.nextInt();
        ders3Nesnesi.parametreliMethod(t);

        //int geriDonenDeger = ders3Nesnesi.dogumYiliHesaplama(t);
        //System.out.println(geriDonenDeger);

        BasitIfYapisi basitIfYapisi =new BasitIfYapisi();
        basitIfYapisi.basitIfYapisi(t);
    }

}
