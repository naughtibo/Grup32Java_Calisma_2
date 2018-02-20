package com.temelt.grup32java.ders6;

public class Sifreleme {
    String encoder = "abcdefghijklmnopqrstuvwxyz ";
    String decoder = "bcdefghijlmnopqrstuvwxyzak ";

    public String enc(String metin) {
        String donenMetin = "";
        for (int i = 0; i < metin.length(); i++) {
            int indis = encoder.indexOf(metin.charAt(i));
            donenMetin += decoder.charAt(indis);
        }
        return donenMetin;
    }

    public String dec(String metin) {
        String donenMetin = "";
        for (int i = 0; i < metin.length(); i++) {
            int indis = decoder.indexOf(metin.charAt(i));
            donenMetin += encoder.charAt(indis);
        }
        return donenMetin;
    }


}
