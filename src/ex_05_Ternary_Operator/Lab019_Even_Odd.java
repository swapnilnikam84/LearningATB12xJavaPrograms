package ex_05_Ternary_Operator;

public class Lab019_Even_Odd {
    public static void main(String[] args) {
        int num = 10;  //even
        //int num2 = 11;  //odd
        //input - > int
        //output -> String -> even or odd

        //step-2
        //num%2 == 0  ->* even else it is odd

        String result = (num%2==0) ? "Even"  : "Odd";
        System.out.println(result);

        // Edge cases
        // -negative, float...., 0
    }
}