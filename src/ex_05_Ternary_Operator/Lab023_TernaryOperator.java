package ex_05_Ternary_Operator;

public class Lab023_TernaryOperator {

    //Ternary Operator - It is a conditional operator
    //evaluate a condition and return one of two values based on the result.
    //it is similar to if-else condition in single line
    //***Syntax -> result = condition ? expression1 : expression2;

    public static void main(String[] args) {
        // ? :
       // int age = 10;
        int age  = 19;
        String canIvote = age >= 18 ? "You can Vote":"No you can't vote";
        System.out.println(canIvote);
    }
}
