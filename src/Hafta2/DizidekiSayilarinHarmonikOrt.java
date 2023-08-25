package Hafta2;

import java.util.Scanner;

public class DizidekiSayilarinHarmonikOrt {
    public static void main(String[] args) {

        System.out.print("Harmonik ortalaması hesaplanacak olan dizi kaç elemanlı?  n = ");
        Scanner input= new Scanner(System.in);
        int n = input.nextInt();

        double[] list = new double[n];
        double sum=0;
        for(int i=0; i<list.length;i++){
            System.out.print(i+". eleman : ");
            list[i] = input.nextDouble();

            sum += (1/ list[i]);
        }
        System.out.print("Dizi : [ ");
        for (double sayi : list) {
            System.out.print(sayi+" ");
        }
        System.out.print(" ]");

        System.out.println("\nSayıların harmonik serisi: " + sum);
        System.out.println("Dizinin Harmonik Ortalaması: " + (list.length / sum));


        }
}
