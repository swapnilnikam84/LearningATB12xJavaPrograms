package ex_05_Ternary_Operator;

public class Lab025_IntQ_NestedTernary {
    public static void main(String[] args) {

        //Nested Ternary
//result = condition1 ? expression1 : (condition2 ? expression2 : expression3);
        //int num = 17;   //o/p -> You Can't Go GOA
       //int num = 21;     //o/p  -> You Can't Drink
        int num = 26;      //o/p  ->  You Can Drink
        String result = (num > 18) ? (num > 25  ? "You Can Drink" : "You Can't Drink"): "You Can't Go GOA";
        System.out.println(result);

    }
}
