import java.util.Objects;

public class Rational {
    private final int numerator;
    private final int denominator;

    public Rational(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }


    public Rational add(Rational num) {
        int newNumerator = this.numerator * num.denominator + num.numerator * this.denominator;
        int newDenominator = this.denominator * num.denominator;
        return new Rational(newNumerator, newDenominator);
    }

    public Rational sub(Rational num) {
        int newNumerator = this.numerator * num.denominator - num.numerator * this.denominator;
        int newDenominator = this.denominator * num.denominator;
        return new Rational(newNumerator, newDenominator);
    }

    public Rational mul(Rational num) {
        int newNumerator = this.numerator * num.numerator;
        int newDenominator = this.denominator * num.denominator;
        return new Rational(newNumerator, newDenominator);
    }

    public Rational div(Rational num) {
        int newNumerator = this.numerator * num.denominator;
        int newDenominator = this.denominator * num.numerator;
        return new Rational(newNumerator, newDenominator);
    }

    public double toFloatingPoint() {
        return (double) this.numerator / this.denominator;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rational rational = (Rational) o;
        return numerator == rational.numerator && denominator == rational.denominator;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numerator, denominator);
    }

    @Override
    public String toString() {
        return numerator + " / " + denominator;
    }
}