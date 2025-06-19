package ex_12_Functions;

import java.util.Scanner;

public class Lab080_Function_Arithmetic {
    public static void main(String[] args) {

        //Create function od Sub, Sum, Mul, Div
        //with parameters a, b - take parameters from users
        //Step1 -> Input & output
        //step2 -> rough logic - create function
        //4 -> with parameters -with return type
        //step3 ->write the code and find -fix the edge cases

        Scanner scanner = new Scanner(System.in);
        int a = readInt(scanner, "Enter The Num1 :");
        int b = readInt(scanner, "Enter The Num1 :");

        int result_sum = sum(a, b);
        int result_sub = sub(a, b);
        int result_mul = mul(a,b);
        int result_div = div(a,b);
        int result_mod = mod(a,b);

        System.out.println("Sum is: " +result_sum);
        System.out.println("Sub is: " +result_sub);
        System.out.println("Mul is: " +result_mul);
        System.out.println("Div is: " +result_div);
        System.out.println("Mod is: " +result_mod);

    }
     static int readInt(Scanner scanner, String prompt)
     {
         System.out.println(prompt);
        if(scanner.hasNextInt())
        {
            return scanner.nextInt();
        }
        else
        {
            System.out.println("Enter an Int Only : ");
            System.exit(0);
            return -1;  //unreachable , but required for compilation
        }
    }
    static int sum(int a, int b)
    {
        return a+b;
    }
    static int sub(int a, int b)
    {
        return a-b;
    }
    static int mul(int a, int b)
    {
        return a*b;
    }
    static int mod(int a, int b)
    {
        return a%b;
    }
    static int div(int a, int b)
    {
        if(b == 0)
        {
            throw new ArithmeticException("Division by Zero is not allowed");
        }
        return a/b;
    }
}