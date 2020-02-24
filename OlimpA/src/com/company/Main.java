package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] array = new int[n];
        for (int j = 0; j < n; j++) {
            array[j] = in.nextInt();
        }
        int k = 0;
        int c = 1;
        int c_down = 0;
        int c_up = 0;
        for (int j = 1; j < n; j++) {
            if (array[j-1] < array[j]) {                // Рассм возрастающие последовательности
                c = c + 1;
                k = 0;
                if (c > c_up) {                         // И находим наибольшую из них
                    c_up = c;
                }
            }

            if (array[j] <= array[j-1]){                 // Рассматриваем убывающие последовательности
                c_down += 1;                             // и распознаем их количество.
                k += 1;
                c = 0;
                //System.out.println(c_down);              // Проверка.
                if (k > 1) {                               // В зависимости от количества элементов подпоследовательности
                    for (int o = 1; o < k; o++) {          // находим колчество комбинаций.
                        c_down += 1;
                    }
                }
            }
        }

        System.out.println(c_up + " " + c_down);
    }
}
