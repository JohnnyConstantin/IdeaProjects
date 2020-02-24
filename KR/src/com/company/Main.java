package com.company;
import java.util.Scanner;

public class Main {

    private static Scanner in;
    private static int max_sum;
    private static int n;
    private static int[][] array;

    private static void count(int sum, int x, int y) {
        sum += array[y][x];
        if (x == n - 1 && y == n - 1) {
            if (max_sum < sum)
                max_sum = sum;
        } else {
            if (x != n - 1) {
                count(sum, x + 1, y);
            }
            if (y != n - 1)
                count(sum, x, y + 1);
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                array[i][j] = in.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                array[i][j] = in.nextInt();
            in = new Scanner(System.in);
            max_sum = 0;
            n = in.nextInt();
            array = new int[n][n];

            count(0, 0, 0);
            if (max_sum <= 0)
                System.out.print("NO_WIN");
            else
                System.out.print(max_sum);
        }
    }
}