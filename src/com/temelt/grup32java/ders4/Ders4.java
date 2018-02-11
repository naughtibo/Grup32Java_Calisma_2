package com.temelt.grup32java.ders4;

import java.util.Scanner;

public class Ders4 {

    public void ifelse(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Yaşınızı Giriniz:");
        int yas = scanner.nextInt();
        if (yas > 0 && yas < 12)
            System.out.println("Çocuksunuz");
        else if (yas > 11 && yas < 20)
            System.out.println("Gençsiniz");
        else if (yas > 19 && yas < 40)
            System.out.println("Orta Yaş grubundasınız");
        else if (yas > 39 && yas < 99)
            System.out.println("Yaşlandınız biraz");
        else
            System.out.println("Bir terslik mi var?");

    }


}
