package Hafta1;

import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Birinci sayıyı giriniz: ");
        double num1 = scanner.nextDouble();

        System.out.print("İkinci sayıyı giriniz: ");
        double num2 = scanner.nextDouble();

        System.out.println("Yapmak istediğiniz işlemi seçiniz:");
        System.out.println("1. Toplama (+)");
        System.out.println("2. Çıkarma (-)");
        System.out.println("3. Çarpma (*)");
        System.out.println("4. Bölme (/)");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Sonuç: " + (num1 + num2));
                break;
            case 2:
                System.out.println("Sonuç: " + (num1 - num2));
                break;
            case 3:
                System.out.println("Sonuç: " + (num1 * num2));
                break;
            case 4:
                if (num2 != 0) {
                    System.out.println("Sonuç: " + (num1 / num2));
                } else {
                    System.out.println("Bir sayıyı 0'a bölemezsiniz!");
                }
                break;
            default:
                System.out.println("Geçersiz işlem seçimi!");
        }

        scanner.close();
    }
}
