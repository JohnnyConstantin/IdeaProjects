package com.company;

import java.util.Scanner;

class Point {

    double x;
    double y;

    void Sdvig(double dx, double dy) {
        x += dx;
        y += dy;
    }

    void Vyvod() {
        System.out.println("(" + x + ";" + y + ")");
    }

    void Vvod() {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter x: ");
        double x = in.nextDouble();
        System.out.println("Enter y: ");
        double y = in.nextDouble();
        Sdvig(x, y);
    }

    double Rasstoyanie(Point a) {
        return Math.sqrt(Math.pow(x - a.x, 2) + Math.pow(y - a.y, 2));
    }
}

public class Main {

    public static void main(String[] args) {

        Point p1 = new Point();
        Point p2 = new Point();

        p1.Vvod();
        System.out.println("Точка 1:");
        p1.Vyvod();

        p2.Vvod();
        System.out.println("Точка 2:");
        p2.Vyvod();

        System.out.println("Расстояние:" + p1.Rasstoyanie(p2));

        p1.Sdvig(1, 2);

        System.out.println("Point 1 after move:");
        p1.Vyvod();

        System.out.println("New distanse:" + p1.Rasstoyanie(p2));
    }
}



