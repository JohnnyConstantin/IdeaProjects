package com.company;

public class Fraction {
    private int numerator;
    private int denominator = 1;

    public Fraction(int numerator, int denominator) {
        if (denominator == 0) {
            System.out.println("Denominator can't be zero. Choose another one.");
            return;
        }
        this.numerator = numerator * (denominator < 0 ? -1 : 1);
        this.denominator = Math.abs(denominator);
        normalization();
    }


    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public void setDenominator(int denominator) {
        if (denominator == 0) {
            System.out.println("Denominator can't be zero. Choose another one.");
            return;
        }
        if (denominator < 0) {
            this.numerator *= -1;
        }
    }

    private int gcd(int numerator, int denominator) {
        while (numerator != 0 && denominator != 0) {
            if (numerator > denominator) {
                numerator %= denominator;
            } else {
                denominator %= numerator;
            }
        }
        return numerator + denominator;
    }

    private void normalization() {
        int n = gcd(Math.abs(numerator), Math.abs(denominator));
        numerator /= n;
        denominator /= n;
    }

    public boolean properFraction() { //РїСЂРѕРІРµСЂРєР° РїСЂР°РІРёР»СЊРЅРѕСЃС‚Рё РґСЂРѕР±Рё
        return (Math.abs(numerator) < denominator ? true : false);
    }

    public int isIntegerPart() { // РІС‹РґРµР»РµРЅРёРµ С†РµР»РѕР№ С‡Р°СЃС‚Рё
        return (numerator / denominator);
    }

    public Fraction fractionalPart() { // РІС‹РґРµР»РµРЅРёРµ РґСЂРѕР±РЅРѕР№ С‡Р°СЃС‚Рё
        return new Fraction(numerator % denominator, denominator);
    }

    public double toDecimalFractions() { // СЂРµР·СѓР»СЊС‚Р°С‚ РґРµР»РµРЅРёСЏ РІ РІРёРґРµ РґРµСЃСЏС‚РёС‡РЅРѕР№ РґСЂРѕР±Рё
        return (double) numerator / denominator;
    }

    public String toString() { // РІС‹РІРѕРґ РґСЂРѕР±Рё РЅР° РїРµС‡Р°С‚СЊ
        return new String(numerator + " / " + denominator);
    }

    public Fraction sumFractionTo(Fraction obj) {
        return new Fraction(this.numerator * obj.denominator + obj.numerator * this.denominator, this.denominator * obj.denominator);
    }

    public static Fraction sumFraction(Fraction obj1, Fraction obj2) {
        return new Fraction(obj1.numerator * obj2.denominator + obj2.numerator * obj1.denominator, obj1.denominator * obj2.denominator);
    }

    public Fraction minusFractionTo(Fraction obj) {
        return new Fraction(this.numerator * obj.denominator - obj.numerator * this.denominator, this.denominator * obj.denominator);
    }

    public static Fraction minusFraction(Fraction obj1, Fraction obj2) {
        return new Fraction(obj1.numerator * obj2.denominator - obj2.numerator * obj1.denominator, obj1.denominator * obj2.denominator);
    }

    public Fraction multiFractionTo(Fraction obj) {
        return new Fraction(this.numerator * obj.numerator, this.denominator * obj.denominator);
    }

    public static Fraction multiFraction(Fraction obj1, Fraction obj2) {
        return new Fraction(obj1.numerator * obj2.numerator, obj1.denominator * obj2.denominator);
    }

    public Fraction fractFractionTo(Fraction obj) {
        return new Fraction(this.numerator * obj.denominator, this.denominator * obj.numerator);
    }

    public static Fraction fractFraction(Fraction obj1, Fraction obj2) {
        return new Fraction(obj1.numerator * obj2.denominator, obj1.denominator * obj2.numerator);
    }
}
