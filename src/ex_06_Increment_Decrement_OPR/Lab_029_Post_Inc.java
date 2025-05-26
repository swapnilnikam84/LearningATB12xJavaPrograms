package ex_06_Increment_Decrement_OPR;

import com.sun.security.jgss.GSSUtil;

public class Lab_029_Post_Inc {
    public static void main(String[] args) {

       //Pre-increment
        int a = 10;             //increase first & then print immediately.
        System.out.println(++a);
        System.out.println(a);

        //post-increment        //print first & then increase.
        int a_post = 10;
        int b = a_post++;
        System.out.println(a_post++);
        System.out.println(a_post);
        System.out.println(b);

        // ERT-Expression and Result
        //Line no| a_post| Result a_post
        //12 | 20 | NA
        //13 | 20 | 20
        //14 | 20 | 21


    }

}
