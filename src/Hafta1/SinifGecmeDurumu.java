package Hafta1;

import java.util.Scanner;

public class SinifGecmeDurumu {
    public static void main(String[] args) {
        int mat, fizik, kimya, turkce, tarih, muzik;
        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen matematik notunu giriniz:");
        mat = input.nextInt();

        System.out.println("Lütfen fizik notunu giriniz:");
        fizik = input.nextInt();

        System.out.println("Lütfen kimya notunu giriniz:");
        kimya = input.nextInt();

        System.out.println("Lütfen türkçe notunu giriniz:");
        turkce = input.nextInt();

        System.out.println("Lütfen müzik notunu giriniz:");
        muzik = input.nextInt();

        double average = (mat + fizik + kimya + turkce + muzik) / 5;
        if (average < 55) {
            System.out.println("Sınıfta Kaldınız!Seneye Görüşmek Üzere");
            System.out.println("Ortalamanız:" + average);
        } else {
            System.out.println("Tebrikler!Sınıfı Geçtiniz!");
            System.out.println("Ortalamanız:" + average);
        }
    }
}
