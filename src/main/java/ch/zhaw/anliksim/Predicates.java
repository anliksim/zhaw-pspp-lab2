package ch.zhaw.anliksim;

import java.util.function.IntPredicate;

class Predicates {

    private static final int C_0 = '0';
    private static final int C_9 = '9';
    private static final int C_A = 'A';
    private static final int C_Z = 'Z';
    private static final int C_DOT = '.';

    /**
     * Test if a character is in the range from 0 to 9.
     */
    static final IntPredicate RANGE_0_9 = c -> c >= C_0 && c <= C_9;

    /**
     * Test if a character is in the range from A to Z.
     */
    static final IntPredicate RANGE_A_Z = c -> c >= C_A && c <= C_Z;

    /**
     * Test if a character is a dot.
     */
    static final IntPredicate DOT = c -> c == C_DOT;
}
