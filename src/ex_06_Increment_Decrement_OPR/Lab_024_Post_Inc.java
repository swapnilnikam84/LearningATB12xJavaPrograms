package ex_06_Increment_Decrement_OPR;

public class Lab_024_Post_Inc {
    public static void main(String[] args) {

       //Pre-increment
        int a = 10;             //increase first & then print.
        System.out.println(++a);
        System.out.println(a);

        //post-increment        //print first & then increase.
        int a_post = 20;
        System.out.println(a_post++);
        System.out.println(a_post);

    }

}
