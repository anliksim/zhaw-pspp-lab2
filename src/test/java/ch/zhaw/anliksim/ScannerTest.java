package ch.zhaw.anliksim;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ScannerTest {

    @Test
    void scanIntegers() {
        Scanner.init("45 + (32)*78+45-56");
        assertTokenEquals(45, "number", Scanner.next());
        assertTokenEquals(0, "+", Scanner.next());
        assertTokenEquals(0, "(", Scanner.next());
        assertTokenEquals(32, "number", Scanner.next());
        assertTokenEquals(0, ")", Scanner.next());
        assertTokenEquals(0, "*", Scanner.next());
        assertTokenEquals(78, "number", Scanner.next());
        assertTokenEquals(0, "+", Scanner.next());
        assertTokenEquals(45, "number", Scanner.next());
        assertTokenEquals(0, "-", Scanner.next());
        assertTokenEquals(56, "number", Scanner.next());
    }

    @Test
    void scanDoubles() {
        Scanner.init("(45.56+0.01)*78.9945");
        assertTokenEquals(0, "(", Scanner.next());
        assertTokenEquals(45.56, "number", Scanner.next());
        assertTokenEquals(0, "+", Scanner.next());
        assertTokenEquals(0.01, "number", Scanner.next());
        assertTokenEquals(0, ")", Scanner.next());
        assertTokenEquals(0, "*", Scanner.next());
        assertTokenEquals(78.9945, "number", Scanner.next());
    }

    void assertTokenEquals(double expectedValue, String expectedKind, Token actualToken) {
        assertEquals(actualToken.val, expectedValue);
        assertEquals(actualToken.getKind(), expectedKind);
    }
}