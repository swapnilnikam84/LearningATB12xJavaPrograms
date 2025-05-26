package ex_05_Ternary_Operator;

import static java.lang.Math.max;

public class Lab020_Three_Max_Num {
    public static void main(String[] args) {
        int n1 = 2;
        int n2 = 5;
        int n3 = -10;
//nested ternary
        // result = condition1 ? expression1 : (condition2 ? expression2 : expression3)

        //logic building formula
// step 1- : find input and / outputs data type
    // I/P - n1, n2, n3 - int
    // O/P - String -> max number

// step 2- : Rough logic, think about it.
   // n1 > n2 and n1 > n3 ----> n1
   // n2 > n3 and n2 > n1 ----> n2
   // n3
int max = (n1 > n2) ? (n1 > n3) ? n1 : n3 : ((n2 > n3) ? n2 : n3);
   // max(2,5,-10);

        System.out.println("Max is  " + max);

        // A -> (n1 > n3) ? n1 : n3
        // B -> ()

    }
}
