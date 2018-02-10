package com.temelt.grup32java.ders3;

public class Ders3 {

    public void ornekMetod() {
        System.out.println("Örnek Metod Çalıştı");
    }

    public void parametreliMethod(int yas) {
        int mevcutYil = 2018;
        int dogumYili = mevcutYil - yas;
        System.out.println("Doğum Yiliniz :" + dogumYili);
    }

    public int dogumYiliHesaplama(int yas) {
        int mevcutYil = 2018;
        int dogumYili = mevcutYil - yas;
        return dogumYili;
    }
}
