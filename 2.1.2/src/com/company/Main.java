package com.company;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        String convert = Integer.toBinaryString(a);
        System.out.println(convert);


        convert = Integer.toOctalString(a);
        System.out.println(convert);


        convert = Integer.toHexString(a);
        System.out.println(convert);

        System.out.println(Math.abs(a) > Byte.MAX_VALUE ? "NO" : "YES");
        System.out.print(Math.abs(a) > Short.MAX_VALUE ? "NO" : "YES");
    }
}