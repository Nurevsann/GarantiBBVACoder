package Hafta1;

import java.util.Scanner;

public class HipotenüsHesaplama {
    public static void main(String[] args) {
        int a,b;
        double c;
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen sırasıyla kenar uzunuluklarını giriniz:");
        a= input.nextInt();
        b= input.nextInt();
        c=Math.sqrt((a*a)+(b*b));
        System.out.println("Hipotenüz uzunluğu=" +c);

    }
}
