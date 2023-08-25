package Hafta2;

import java.util.Arrays;

public class FrekansSayaci {
    public static void main(String[] args) {
        int[] array = {10, 20, 20, 10, 10, 20, 5, 20};
        int[] visited = new int[array.length];

        Arrays.fill(visited, -1);

        for (int i = 0; i < array.length; i++) {
            int count = 1;
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    count++;
                    visited[j] = 0;
                }
            }

            if (visited[i] != 0) {
                visited[i] = count;
            }
        }

        for (int i = 0; i < array.length; i++) {
            if (visited[i] != 0) {
                System.out.println(array[i] + " sayısı " + visited[i] + " kere tekrar edildi.");
            }
        }
    }
}
