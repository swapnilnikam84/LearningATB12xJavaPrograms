package ex_05_Ternary_Operator;

public class Oper_Precedence {
    public static void main(String[] args) {
// BODMAS-BODMAS rule(Bracket,Order,Division,Multiplication,Addition,Subtraction)

        int a = 6*5-34/2;   //Precedence - *&/ then +&-
        /*
           * -> 6*5=30
           / -> 34/2=17
           - -> 30-17=13

         */
        int b = 60/5-34*2;   //Associativity - L to R
        /*
            L to R
            60/5=12
            34*2=68
            12-68 = -56
         */
        System.out.println(a);  //op -> 13
        System.out.println(b);  //op -> -56

        int x = 6;
        int y = 1;
        int k = x * y/2;  //L to R
        System.out.println(k);  //op -> 3

        int d = 1;
        int e = 4;
        int f = 5;
        int g = d*d-(4*e*f)/(2*f);  //* then *&* then / then -
        System.out.println(g); //op -> -7

    }
}