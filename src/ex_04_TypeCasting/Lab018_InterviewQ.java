package ex_04_TypeCasting;

public class Lab018_InterviewQ {
    public static void main(String[] args) {
        //nested ternary
        // result = condition1 ? expression1 : (condition2 ? expression2 : expression3)

        int number = 25;
        String result = (number > 10) ? (number > 20 ? "N>20" : "N<20") : "B";
        System.out.println(result);

        int x = 10;
        int y = 20;

        System.out.println(Math.max(x,y));

        String max = x > y ? "x is max" : "y is max";
       // int max = x > y ? x : y ;
        System.out.println(max);
    }
}
