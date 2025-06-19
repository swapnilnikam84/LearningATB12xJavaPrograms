package ex_06_Increment_Decrement_OPR;

public class Incr_Decr_Operators {
    public static void main(String[] args) {

        //Increment & Decrement operators
        int i = 56;
        System.out.println(i++); //use i then increment - 56
        System.out.println(i);  // 57
        System.out.println(++i); //first increment then
        System.out.println(i);

       // *********************

        int y = 7;
        int x = ++y*8;
        System.out.println("Value of x is : " +x); // ++ , *, 8+56 = 64

       //************************
       char ch = 'A';
        System.out.println(++ch); // o/p -> b
    }
}