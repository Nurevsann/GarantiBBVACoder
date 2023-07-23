package Hafta1;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Fibonacci serisi eleman sayısını giriniz: ");
        int elemanSayisi = inp.nextInt();

        int[] fibonacci = new int[elemanSayisi];
        fibonacci[0] = 0;
        fibonacci[1] = 1;

        for (int i = 2; i < elemanSayisi; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }

        System.out.println("Fibonacci Serisi:");
        for (int i = 0; i < elemanSayisi; i++) {
            System.out.print(fibonacci[i] + " ");
        }
    }
}
