package ex_05_Ternary_Operator;

public class Operators1 {
    public static void main(String[] args) {

        //1. Arithmetic operators
        int a = 4;
        int b = 6%a; //modulo operator-reminder b=2
        //4.8%1.1 --> returns decimal reminder
        //2. Assignment operators
        // int b = 6;
         b *= 3;   //b=2*3=6
        System.out.println(b);
        //3. comparison operator
        System.out.println(6==7);
        //4. Logical Operators
        System.out.println(65>5 && 64>8);
        System.out.println(65>5 || 64>8);
        //5. Bitwise operators
        System.out.println(2&3);

    }
}