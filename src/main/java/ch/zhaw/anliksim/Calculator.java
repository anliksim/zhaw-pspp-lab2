package ch.zhaw.anliksim;

import java.util.Stack;

class Calculator {

    private static final Stack<Double> STACK = new Stack<>();

    static double pop() {
        return STACK.pop();
    }

    static void expr() throws Exception {
        term();
        while (Scanner.la == Token.PLUS
                || Scanner.la == Token.MINUS) {
            Scanner.scan();
            int op = Scanner.token.kind;
            term();

            if (op == Token.PLUS) {
                STACK.push(pop() + pop());
            } else if (op == Token.MINUS) {
                double subtrahend = pop();
                double minuend = pop();
                STACK.push(minuend - subtrahend);
            }
        }
    }

    private static void term() throws Exception {
        factor();
        while (Scanner.la == Token.TIMES || Scanner.la == Token.SLASH) {
            Scanner.scan();
            int op = Scanner.token.kind;
            factor();

            if (op == Token.TIMES) {
                STACK.push(pop() * pop());
            } else if (op == Token.SLASH) {
                double divisor = pop();
                double dividend = pop();
                STACK.push(dividend / divisor);
            }
        }
    }

    private static void factor() throws Exception {
        if (Scanner.la == Token.LBRACK) {
            Scanner.scan();
            expr();
            Scanner.check(Token.RBRACK);
        } else if (Scanner.la == Token.NUMBER) {
            Scanner.scan();
            STACK.push(Scanner.token.val);
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner.init("3+2-4");
        Scanner.scan();
        expr();
        System.out.println("result=" + pop());
    }
}
