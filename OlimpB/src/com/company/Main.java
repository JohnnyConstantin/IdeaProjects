package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
    int N = in.nextInt();
	int[][] array = new int[N][N];
	int l = ((N + 1)/2)*((N + 1)/2);
	int v = ((N + 1)/2)*((N + 1)/2);
	for (int n = 0; n < N; n++) {                   //  N - размерность матрицы
	    for (int j = 0; j < N; j++){
            array[n][j] = 0;
	        if ( n == j ){                           //Заполняем главную диагональ
	            if (n <= ((N-1)/2)) {
                    array[n][j] = 1 + n;
                } else {
                    array[n][j] = N - n;}
            }
            if ( n + j == N - 1) {                  //Заполняем побочную диагональ
                if (n <= ((N-1)/2)) {
                    array[n][j] = 1 + n;
                } else {
                    array[n][j] = N - n;}
            }
            if ((j == N/2) & (n < N/2)) {
                array[n][j] = l;
                l = l - (N + 1)/2;
            }
            if ((j == N/2) & (n >= N/2)) {
                array[n][j] = l;
                l = l + (N + 1)/2;
            }
                                                    //Четырьмя циклами заполняем центральную вертикаль и горизонталь
            if ((n == N/2) & (j >= N/2)) {
                array[n][j] = v;
                v = v + (N + 1)/2;
            }
            if ((n == N/2) & (j < N/2)) {
                array[n][j] = v;
                v = v - (N + 1)/2;
            }
        }
    }
        for (int j = 0; j < N; j++) {                   // Вывод
            for (int n = 0; n < N; n++) {
                System.out.print(" " + array[n][j] + " ");
            }
            System.out.println();
        }
    }
}