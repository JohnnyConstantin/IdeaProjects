package com.company;

import java.util.Locale;

public class Main {
    double vX, vY;
    static int count;
    Main() {
        this.vX = 1;
        this.vY = 1;
        count ++;
    }

    Main(double x, double y) {
    vX = x;
    vY = y;
    count++;
    }

    Main(Main v) {
        vX = v.vX;
        vY = v.vY;
        count++;
    }

    void add(Main v){
        this.vX += v.vX;
        this.vY += v.vY;
    }

    void print(){
        System.out.print("(");
        System.out.print(String.format(Locale.US, "%.2f", vX));
        System.out.print(", ");
        System.out.print(String.format(Locale.US, "%.2f", vY));
        System.out.println(")");
    }

    public double length(){
        return Math.sqrt(vX * vX + vY * vY);
    }
    public static void main(String[] args) {
        Main v = new Main(1.2374, 2.2334);
        Main v2 = new Main();
        Main v3 = new Main(v);
        Main vB = new Main(1.0, 3.0);
        Main vA = new Main();
        v.print();
        v2.print();
        System.out.println(vB.length());
        v3.print();
        vA.add(vB);
        vA.print();
    }

}

