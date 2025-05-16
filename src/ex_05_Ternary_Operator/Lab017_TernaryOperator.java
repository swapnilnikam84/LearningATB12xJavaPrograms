package ex_05_Ternary_Operator;

public class Lab017_TernaryOperator {
    public static void main(String[] args) {
        // ? :
        int age = 10;
        String canIvote = age >= 18 ? "You can Vote":"No you cant vote";
        System.out.println(canIvote);

        int number = -5;
        String result = number > 0 ? "Positive" : "Negative";
        System.out.println(result);
    }
}
