package com.temelt.grup32java.ders5;

public class WhileDongusu {
    public void basitWhile(){

        int a=50;

        while (a>20){
            System.out.println("Büyük Değil");
            a=a-1;
        }
    }

    public void doWhile(){
        int count = 1;
        do {
            System.out.println(String.format("Count is: %d" , count));
            count++;
        } while (count < 11);
    }
}
