package Hafta2;

import java.util.Arrays;
import java.util.Scanner;

public class SortArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Dizinin boyutu: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.println("Dizinin elemanlarını girin:");
        for (int i = 0; i < n; i++) {
            System.out.print((i + 1) + ". elemanı : ");
            arr[i] = scanner.nextInt();
        }

        Arrays.sort(arr);

        System.out.print("Sıralama : ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
