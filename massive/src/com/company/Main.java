package com.company;

import java.util.Scanner;

public class Main {

    public static int count(int[] mass, int n) {
        int k = mass[n-1];
    if (mass[n] < mass[n-1]) {
        mass[n-1] = mass[n];
        int[] m = mass;
    }
    return m;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] mass;
        int n = in.nextInt();
        mass = new int[n];
        int i;
        for (i = 0; i <= n; i++) {
            int k = in.nextInt();
            mass[i] = k;
        }
        int[] mass1 = mass[];
    }


}
