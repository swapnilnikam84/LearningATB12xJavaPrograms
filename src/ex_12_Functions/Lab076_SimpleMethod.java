package ex_12_Functions;

public class Lab076_SimpleMethod {
    public static void main(String[] args) {   //main - function

        non_return_function();
        return_function();

        int a = return_function();
        System.out.println(a);

    }

    static void non_return_function()
    {
        System.out.println("Non Return Type Function");
    }

    static int return_function()
    {
        System.out.println("Return Type Function");
        return 10;
    }

    static boolean return_boolean()
    {
        return true;
    }

    static float return_float_piValue()
    {
        return 3.14f;
    }

    static long return_long()
    {
        return 10l;
    }

    static byte return_byte()
    {
        return 100;
    }
}