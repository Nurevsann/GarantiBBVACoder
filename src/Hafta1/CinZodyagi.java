package Hafta1;

import java.util.Scanner;

public class CinZodyagi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Doğum Yılınızı Giriniz: ");
        int dogumYili = scanner.nextInt();

        String[] cinZodyagi = {
                "Maymun", "Horoz", "Köpek", "Domuz",
                "Fare", "Öküz", "Tiger", "Tavşan",
                "Ejderha", "Yılan", "At", "Koyun"
        };

        int zodyakIndeksi = dogumYili % 12;
        String cinZodyagiBurcu = cinZodyagi[zodyakIndeksi];

        System.out.println("Çin Zodyağı Burcunuz: " + cinZodyagiBurcu);



    }
}
