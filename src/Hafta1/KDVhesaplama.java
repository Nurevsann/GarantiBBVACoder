package Hafta1;

import java.util.Scanner;

public class KDVhesaplama {
    public static void main(String[] args) {
        double tutar;
        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen tutarı giriniz:");
        tutar = input.nextDouble();
        if (tutar<1000) {
            double kdv = tutar * 18 / 100;
            System.out.println("KDV tutarı =" +kdv);
        } else {
            double kdv = tutar * 8 / 100;
            System.out.println("KDV tutarı =" +kdv);
        }




    }
}
