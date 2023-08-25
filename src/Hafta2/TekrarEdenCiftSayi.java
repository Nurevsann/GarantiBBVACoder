package Hafta2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TekrarEdenCiftSayi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Dizi uzunluğunu girin: ");
        int length = input.nextInt();

        int[] numbers = new int[length];
        System.out.println("Dizi elemanlarını girin:");
        for (int i = 0; i < length; i++) {
            numbers[i] = input.nextInt();
        }

        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int number : numbers) {
            if (number % 2 == 0) {
                frequencyMap.put(number, frequencyMap.getOrDefault(number, 0) + 1);
            }
        }

        System.out.println("Tekrar eden çift sayılar:");
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey());
            }
        }
    }
}
