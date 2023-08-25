package Hafta2;

import java.util.Arrays;
import java.util.Scanner;

public class ClosestNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Dizi boyutunu girin: ");
        int size = scanner.nextInt();
        int[] numbers = new int[size];

        System.out.println("Dizi elemanlarını girin:");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        System.out.print("Bir sayı girin: ");
        int target = scanner.nextInt();

        Arrays.sort(numbers);

        int closestSmaller = Integer.MIN_VALUE;
        int closestLarger = Integer.MAX_VALUE;

        for (int number : numbers) {
            if (number < target && number > closestSmaller) {
                closestSmaller = number;
            }
            if (number > target && number < closestLarger) {
                closestLarger = number;
            }
        }

        System.out.println("Sayılardan en yakın küçük sayı: " + closestSmaller);
        System.out.println("Sayılardan en yakın büyük sayı: " + closestLarger);
    }
}
