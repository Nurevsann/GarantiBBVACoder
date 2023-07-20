package Hafta1;

import java.util.Scanner;

public class UcgenAlanHesaplama {
    public static void main(String[] args) {
        //Üç𝑔𝑒𝑛𝑖𝑛 ç𝑒𝑣𝑟𝑒𝑠𝑖 = 2𝑢
        //
        //𝑢 = (a+b+c) / 2
        //
        //Alan * Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐)
        int a,b,c;
        double u, alan ;
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen sırasıyla kenar uzunuluklarını giriniz:");
        a= input.nextInt();
        b= input.nextInt();
        c= input.nextInt();

        u = (a+b+c)/2.0;
        alan=Math.sqrt(u * (u-a)* (u-b) * (u-c));
        System.out.println("Üçgenin Alanı" +alan);

    }
}
