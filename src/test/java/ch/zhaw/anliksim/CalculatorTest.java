package ch.zhaw.anliksim;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void add() throws Exception {
        calculate("3+2");
        assertEquals(5, Calculator.pop());
    }

    @Test
    void subtract() throws Exception {
        calculate("3-2");
        assertEquals(1, Calculator.pop());
    }

    @Test
    void addAndSubtract() throws Exception {
        calculate("4+5-2");
        assertEquals(7, Calculator.pop());
    }

    @Test
    void multiply() throws Exception {
        calculate("5*2");
        assertEquals(10, Calculator.pop());
    }

    @Test
    void divide() throws Exception {
        calculate("6/2");
        assertEquals(3, Calculator.pop());
    }

    @Test
    void multiplyAndDivide() throws Exception {
        calculate("5*6/2");
        assertEquals(15, Calculator.pop());
    }

    @Test
    void mixExprAndTerms() throws Exception {
        calculate("5*6+10/2-20");
        assertEquals(15, Calculator.pop());
    }

    @Test
    void mixWithConstants() throws Exception {
        calculate("4*PI+E");
        assertEquals(4 * Math.PI + Math.E, Calculator.pop());
    }

    private static void calculate(String s) throws Exception {
        Scanner.init(s);
        Scanner.scan();
        Calculator.expr();
    }
}