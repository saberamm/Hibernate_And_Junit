import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RationalTest {

    @Test
    public void add() {
        Rational r1 = new Rational(1, 2);
        Rational r2 = new Rational(1, 4);

        Rational result = r1.add(r2);

        assertEquals(new Rational(6, 8), result);
    }

    @Test
    public void sub() {
        Rational r1 = new Rational(3, 4);
        Rational r2 = new Rational(1, 4);

        Rational result = r1.sub(r2);

        assertEquals(new Rational(8, 16), result);
    }

    @Test
    public void mul() {
        Rational r1 = new Rational(2, 3);
        Rational r2 = new Rational(3, 4);

        Rational result = r1.mul(r2);

        assertEquals(new Rational(6, 12), result);
    }

    @Test
    public void div() {
        Rational r1 = new Rational(1, 2);
        Rational r2 = new Rational(3, 4);

        Rational result = r1.div(r2);

        assertEquals(new Rational(4, 6), result);
    }

    @Test
    public void toFloatingPoint() {
        Rational r1 = new Rational(1, 2);

        double result = r1.toFloatingPoint();

        assertEquals(0.5, result, 0.0001);
    }
}