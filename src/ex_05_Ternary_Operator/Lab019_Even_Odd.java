package ex_05_Ternary_Operator;

public class Lab019_Even_Odd {
    public static void main(String[] args) {
        int num = 10;  //even
        //int num2 = 11;  //odd

        String result = (num%2==0) ? "Even"  : "Odd";
        System.out.println(result);
    }

}
