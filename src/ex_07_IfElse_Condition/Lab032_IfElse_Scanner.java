package ex_07_IfElse_Condition;

import java.util.Scanner;

public class Lab032_IfElse_Scanner {
    public static void main(String[] args) {

        //Scanner class
        System.out.println("Enter Your Age : ");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();

        if(age>18)
        {
            System.out.println("Allowed To Vote");
        }
        else
        {
            System.out.println("Not Allowed to vote");
        }
    }
}
