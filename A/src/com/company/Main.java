package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int map_length = in.nextInt();
        int max_sum = 0;
            int[][] array = new int[map_length][map_length];
            for (int n =0 ;n < map_length; n++) {              //n - строка
                for (int j = 0; j < map_length; j++) {          // j - столбец
                    array[n][j] = in.nextInt();
                }
            }
            int k = 0;
        for (int n = 0; n < map_length; n++) {
            int max = -1000;
            int sum = max_sum;
            for (int j = 0; j < map_length; j++) {
                if (j >= k) {
                sum = array[n][j] + sum;
                if (array[n][j] > max) {
                    max_sum = sum;
                    max = array[n][j];
                    k = j;
                    }
                if (n == map_length - 1) {
                    max_sum = sum;
                }
                } else {
                    continue;
                }
            }
        }
if (max_sum < 0) {
    System.out.println("NO_WIN");
} else {
    System.out.println(max_sum);
}
          /*  for (int n = 0; n < map_length; n++) {
                for (int j = 0; j < map_length; j++) {
                    System.out.println("" + array[n][j] + "");
                }
            }
            */
        }
    }




