package Hafta1;

import java.util.Scanner;

public class NotOrtalaması {
    public static void main(String[] args) {
        int mat,fizik,kimya,turkce,tarih,muzik;
        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen matematik notunu giriniz:");
        mat = input.nextInt();

        System.out.println("Lütfen fizik notunu giriniz:");
        fizik = input.nextInt();

        System.out.println("Lütfen kimya notunu giriniz:");
        kimya = input.nextInt();

        System.out.println("Lütfen türkçe notunu giriniz:");
        turkce = input.nextInt();

        System.out.println("Lütfen tarih notunu giriniz:");
        tarih = input.nextInt();

        System.out.println("Lütfen müzik notunu giriniz:");
        muzik = input.nextInt();

        int toplam =(mat+fizik+kimya+turkce+tarih+muzik);
        double sonuc = toplam/6;

        System.out.println("Ortalamnız = " +sonuc);
    }
}
