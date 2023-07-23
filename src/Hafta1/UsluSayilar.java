package Hafta1;

import java.util.Scanner;

public class UsluSayilar {
    public static void main(String[] args) {
        int n,k;
        Scanner input = new Scanner(System.in);
        System.out.println("Üssü alınacak sayı:");
        n= input.nextInt();
        System.out.println("Üs olacak sayı:");
        k=input.nextInt();
        int total = 0;

        int i = 1;
        while (i<=k){
            total *=n;

            i++;
        }
        System.out.println("Cevap:" +total);
    }
}
