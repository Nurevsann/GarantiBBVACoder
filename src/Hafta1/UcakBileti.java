package Hafta1;

import java.util.Scanner;

import static java.lang.System.*;

public class UcakBileti {
    //Mesafeyi km türünden giriniz : 1500
    //Yaşınızı giriniz : 20
    //Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): 2
    //
    //Toplam Tutar = 216 TL
    public static void main(String[] args) {
        int km,yas, yolculuk_tipi;

        Scanner input = new Scanner(System.in);
        out.println("Mesafeyi km türünden giriniz:");
        km=input.nextInt();
        out.println("Yaşınızı giriniz:");
        yas= input.nextInt();
        out.println("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ):");
        yolculuk_tipi=input.nextInt();

        double normalTutar = km * 0.10;
        double indirimliTutar = normalTutar;

        if (km <= 0 || yas <= 0 || (yolculuk_tipi != 1 && yolculuk_tipi != 2)) {
            out.println("Hatalı veri girdiniz!");
        }

        if (yas < 12) {
            indirimliTutar -= normalTutar * 0.50;
        } else if (yas >= 12 && yas <= 24) {
            indirimliTutar -= normalTutar * 0.10;
        } else if (yas >= 65) {
            indirimliTutar -= normalTutar * 0.30;
        }

        // Yolculuk tipi indirimi
        if (yolculuk_tipi == 2) {
            indirimliTutar -= indirimliTutar * 0.20;
        }

        double toplamTutar = yolculuk_tipi == 2 ? indirimliTutar * 2 : indirimliTutar;
        out.println("Toplam Tutar: " + toplamTutar + " TL");

    }
}
