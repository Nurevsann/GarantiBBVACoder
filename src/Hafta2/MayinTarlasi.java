package Hafta2;

import java.util.Random;
import java.util.Scanner;

public class MayinTarlasi {
    private char[][] minefield;
    private char[][] displayGrid;
    private int rowCount;
    private int colCount;
    private int remainingCells;

    public MayinTarlasi(int rowCount, int colCount, int mineCount) {
        this.rowCount = rowCount;
        this.colCount = colCount;
        this.remainingCells = rowCount * colCount - mineCount;
        minefield = new char[rowCount][colCount];
        displayGrid = new char[rowCount][colCount];
        initializeGame();
    }

    private void initializeGame() {
        // Mayınları yerleştirir
        placeMines();

        // Oyun tahtasını oluşturur
        for (int i = 0; i < rowCount; i++) {
            for (int j = 0; j < colCount; j++) {
                displayGrid[i][j] = '-';
            }
        }
    }

    private void placeMines() {
        Random rand = new Random();
        int minesPlaced = 0;

        while (minesPlaced < rowCount * colCount / 4) {
            int row = rand.nextInt(rowCount);
            int col = rand.nextInt(colCount);

            if (minefield[row][col] != '*') {
                minefield[row][col] = '*';
                minesPlaced++;
            }
        }
    }

    private void printGrid(char[][] grid) {
        for (int i = 0; i < rowCount; i++) {
            for (int j = 0; j < colCount; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void play() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Mayın Tarlası Oyuna Hoşgeldiniz!");
        printGrid(displayGrid);

        while (true) {
            System.out.print("Satır Giriniz: ");
            int row = scanner.nextInt();
            System.out.print("Sütun Giriniz: ");
            int col = scanner.nextInt();

            if (row < 0 || row >= rowCount || col < 0 || col >= colCount) {
                System.out.println("Geçersiz konum. Lütfen tekrar deneyin.");
                continue;
            }

            if (minefield[row][col] == '*') {
                System.out.println("Game Over!!");
                displayGrid[row][col] = '*';
                printGrid(displayGrid);
                break;
            } else {
                revealCell(row, col);
                printGrid(displayGrid);

                if (remainingCells == 0) {
                    System.out.println("Oyunu Kazandınız!");
                    break;
                }
            }
        }
    }

    private void revealCell(int row, int col) {
        if (displayGrid[row][col] != '-') {
            return;
        }

        int minesAround = countMinesAround(row, col);
        displayGrid[row][col] = (char) (minesAround + '0');
        remainingCells--;

        if (minesAround == 0) {
            // Etrafındaki boş hücreleri de aç
            for (int i = -1; i <= 1; i++) {
                for (int j = -1; j <= 1; j++) {
                    int newRow = row + i;
                    int newCol = col + j;
                    if (newRow >= 0 && newRow < rowCount && newCol >= 0 && newCol < colCount) {
                        revealCell(newRow, newCol);
                    }
                }
            }
        }
    }

    private int countMinesAround(int row, int col) {
        int count = 0;

        for (int i = -1; i <= 1; i++) {
            for (int j = -1; j <= 1; j++) {
                int newRow = row + i;
                int newCol = col + j;
                if (newRow >= 0 && newRow < rowCount && newCol >= 0 && newCol < colCount &&
                        minefield[newRow][newCol] == '*') {
                    count++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Satır Sayısını Giriniz: ");
        int rowCount = scanner.nextInt();
        System.out.print("Sütun Sayısını Giriniz: ");
        int colCount = scanner.nextInt();
        int mineCount = rowCount * colCount / 4;

        MayinTarlasi game = new MayinTarlasi(rowCount, colCount, mineCount);
        game.play();
    }

}

