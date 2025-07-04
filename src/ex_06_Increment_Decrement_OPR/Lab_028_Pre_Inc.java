package ex_06_Increment_Decrement_OPR;

public class Lab_028_Pre_Inc {
    public static void main(String[] args) {
        // pre-increment ->  ++operand
        // value is incremented first and then stored in result
        // value increased by 1

        int a = 10;
        int b = ++a;    //10+1 -> b - 11
        System.out.println(a);    // 11
        System.out.println(b);    // 11

        // ERT-Expression and Result
        //Line no|a|Result b
        //9 | 10 | NA
        //10 | 11 | 11
        //11 | 11 -print | 11
        //12 | 11 | 11 - print
    }
}
