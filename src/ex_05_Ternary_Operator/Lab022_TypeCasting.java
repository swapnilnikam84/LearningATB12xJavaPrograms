package ex_05_Ternary_Operator;

public class Lab022_TypeCasting {
    public static void main(String[] args) {

        long phone_no = 9890062589l;
        //short s = phone_no; // Narrowing - implicit - not possible
        short s = (short) phone_no; // Narrowing - Explicit
        System.out.println(s);  // o/p -> 24829



    }
}
