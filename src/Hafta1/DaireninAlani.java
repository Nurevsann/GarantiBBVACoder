package Hafta1;

import java.util.Scanner;

public class DaireninAlani {
    //Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.
    //
    //𝜋 sayısını = 3.14 alınız.
    //
    //Formül : (𝜋 * (r*r) * 𝛼) / 360
    public static void main(String[] args) {

            double pi = 3.14;
            double r, alpha, alan;

            Scanner input = new Scanner(System.in);

            System.out.print("Yarıçapını (r) giriniz: ");
            r = input.nextDouble();

            System.out.print("Merkez açısının ölçüsünü (α) giriniz: ");
            alpha = input.nextDouble();

            alan = (pi * r * r * alpha / 360.0);
            System.out.println("Daire diliminin alanı: " + alan);


    }
}
