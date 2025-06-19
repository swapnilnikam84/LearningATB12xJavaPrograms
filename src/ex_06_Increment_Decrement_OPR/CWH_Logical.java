package ex_06_Increment_Decrement_OPR;

public class CWH_Logical {
    public static void main(String[] args) {

        boolean a = true;
        boolean b = false;
        if(a && b)
        {
            System.out.println("Y");
        }
        else
        {
            System.out.println("N");
        }

        if(a || b)
        {
            System.out.println("Y");
        }
        else
        {
            System.out.println("N");
        }

        System.out.println(!a);
        System.out.println(!b);

    }
}