package com.company;

public class Main {
    static int numerator;
    static int denuminator = 1;

    public Main(int denuminator, int numerator){
        if(denuminator == 0){
            System.out.println("U R STUPID");
            return;
        }
        this.numerator = numerator * (denuminator < 0 ? -1 : 1);
        this.denuminator = Math.abs(denuminator);
        normalization();
    }


    public int getNumerator(){
    return numerator;
    }

    public int getDenuminator(){
    return denuminator;
    }

    public void setNumerator(int numerator){
        this.numerator = numerator;
    }

    public void setDenuminator(int denuminator){
        this.denuminator = denuminator;
        if (denuminator < 0){
            denuminator *= -1;
        } else if(denuminator ==0){
            System.out.println("U R STUPID");
        }
    }

    public int gcd(int numerator, int denuminator) {
        while (numerator != 0 && denuminator != 0) {
            if (numerator > denuminator) {
                numerator %= denuminator;
            } else {
                denuminator %= numerator;
            }
        }
        return numerator + denuminator;
    }

    public void normalization(){
        int n = gcd(Math.abs(numerator), Math.abs(denuminator));
        numerator /= n;
        denuminator /= n;
    }

    public double sum(int numerator, int denuminator){
    return (this.numerator * denuminator + numerator * this.denuminator)/(this.denuminator + denuminator);
    }

    public void main(String[] argss){
        int a = 2;
        int b = 3;
        System.out.println(sum(a,b));

    }
}