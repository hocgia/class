package assignment3;

import java.util.Scanner;

public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction() {
    }

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public void enterFraction() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input fraction. ");
        System.out.println("Input numerator: ");
        this.setNumerator(scanner.nextInt());
        scanner.nextLine();
        System.out.println("Input denominator: ");
        this.setDenominator(scanner.nextInt());
    }

    public void printFraction() {
        System.out.println("Numerator: " + this.numerator);
        System.out.println("Denominator: " + this.denominator);
    }

    public Fraction shortentFraction() {
        int tmp = (this.numerator > this.denominator) ? this.denominator / 2 : this.numerator / 2;
        for (int i = 0; i < tmp; i++) {
            if (this.numerator % i == 0 && this.denominator % i == 0) {
                this.numerator = this.numerator / i;
                this.denominator = this.denominator / i;
            }
        }
        return null;
    }

    public void fractionFraction() {
        int tmp = this.numerator;
        this.numerator = this.denominator;
        this.denominator = tmp;
    }

    public Fraction add(Fraction a, Fraction b) {
        int tmpNumerator = a.getNumerator() * b.getDenominator() + a.getDenominator() * b.getNumerator();
        int tmpDenominator = a.denominator * b.getDenominator();
        return new Fraction(tmpNumerator, tmpDenominator).shortentFraction();
    }

    public Fraction sub(Fraction a, Fraction b) {
        int tmpNumerator = a.getNumerator() * b.getDenominator() - a.getDenominator() * b.getNumerator();
        int tmpDenominator = a.denominator * b.getDenominator();
        return new Fraction(tmpNumerator, tmpDenominator).shortentFraction();
    }

    public Fraction mul(Fraction a, Fraction b) {
        int tmpNumerator = a.getNumerator() * b.getNumerator();
        int tmpDenominator = a.getDenominator() * b.getDenominator();
        return new Fraction(tmpNumerator, tmpDenominator).shortentFraction();
    }

    public Fraction div(Fraction a, Fraction b) {
        int tmpNumerator = a.getNumerator() * b.getDenominator();
        int tmpDenominator = a.getDenominator() * b.getNumerator();
        return new Fraction(tmpNumerator, tmpDenominator).shortentFraction();
    }
}
