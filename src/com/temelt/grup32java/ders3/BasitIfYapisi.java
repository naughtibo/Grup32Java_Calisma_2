package com.temelt.grup32java.ders3;

public class BasitIfYapisi {

    public void basitIf(int yas) {
        if (yas == 20) {
            System.out.println("Yaşınız 20");
        }
    }

    public void basitIfYapisi(int yas) {
        if (yas > 0 && yas < 12) {
            System.out.println("Çocuksunuz");
        }

        if (yas > 11 && yas < 20) {
            System.out.println("Gençsiniz");
        }

        if (yas > 19 && yas < 40) {
            System.out.println("Orta Yaş grubundasınız");
        }

        if (yas > 39 && yas < 99) {
            System.out.println("Yaşlandınız biraz");
        }
        if (yas > 100) {
            System.out.println("Bir terslik mi var?");
        }
    }

    public void basitIfElse(int yas) {
        if (yas == 20) {
            System.out.println("Yaşınız 20");
        }else{
            System.out.println("Yaş 20 Değil");
        }
    }
}
