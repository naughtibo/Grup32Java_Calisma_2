package com.temelt.grup32java.ders4;

public class ForDongusu {

    public void forDongusu(){
        for(int i = 0; i<100 ; i++){
            System.out.println("Indis :"+ i);
        }
    }

    public void ciftSayilar(){
        for(int i = 0; i<100 ; i++){
            if(i%2==0)
            System.out.println("Indis :"+ i);
        }
    }

    public void ucVeyaBesinKati(){
        for(int i = 0; i<100 ; i++){
            if(i%3==0 || i%5==0)
                System.out.println("Indis :"+ i);
        }
    }
}
