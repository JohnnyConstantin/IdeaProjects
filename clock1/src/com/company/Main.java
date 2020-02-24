package com.company;


import java.util.Scanner;

public class Main {

    public static int count() {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int m, b, c, d, sum, k;
		k = 0;
		for (m = 100; m <= a; m++) {
			b = m / 100;
			c = (m % 100) / 10;
			d = m % 10;
			sum = b + c + d;
			if (sum % 13 == 0) {
				k += 1;
			}
		}
		return k;
	}

	public static void main(String[] args) {
		int p = count();
		System.out.println(p);

	}

}
