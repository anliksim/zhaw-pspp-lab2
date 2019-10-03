package ch.zhaw.anliksim;

public class Token {
   public static final int NONE = 0;
   public static final int NUMBER = 1;
   public static final int PLUS = 2;
   public static final int MINUS = 3;
   public static final int TIMES = 4;
   public static final int SLASH = 5;
   public static final int LBRACK = 6;
   public static final int RBRACK = 7;
   public static final int IDENT = 8;
   public static final int EOF = 9;
   
   public static String[] names = {"none","number","+","-","*","/","(",")","ident","eof"};

   public int kind; // token code
   public int pos;  // position
   public int line; // line for error
   public int col;  // position for error
   public int val;  // for numbers
   public String str;  // for numbers and identifiers
}
