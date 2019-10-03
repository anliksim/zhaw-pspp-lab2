package ch.zhaw.anliksim;

class Token {

    static final int NONE = 0;
    static final int NUMBER = 1;
    static final int PLUS = 2;
    static final int MINUS = 3;
    static final int TIMES = 4;
    static final int SLASH = 5;
    static final int LBRACK = 6;
    static final int RBRACK = 7;
    static final int IDENT = 8;
    static final int EOF = 9;

    static String[] names = {"none", "number", "+", "-", "*", "/", "(", ")", "ident", "eof"};

    int kind; // token code
    int pos;  // position
    int line; // line for error
    int col;  // position for error
    double val;  // for numbers

    String getKind() {
        return names[kind];
    }
}
