package Hafta1;

import java.util.Scanner;

public class HavaSicaklik {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Sıcaklık değerini giriniz: ");
        int derece = scanner.nextInt();

        if (derece < 5) {
            System.out.println("Kayak yapmayı öneririm.");
        } else if (derece >= 5 && derece <= 15) {
            System.out.println("Sinema etkinliğini öneririm.");
        } else if (derece > 15 && derece <= 25) {
            System.out.println("Piknik etkinliğini öneririm.");
        } else {
            System.out.println("Yüzme etkinliğini öneririm.");
        }

        scanner.close();
    }
}
