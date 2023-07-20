package Hafta1;

import java.util.Scanner;

public class KDVhesaplama {
    public static void main(String[] args) {
        double tutar;
        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen tutarı giriniz:");
        tutar = input.nextDouble();

        double kdv = tutar*18/100;

        System.out.println("KDV tutarı =" +kdv);

    }
}
