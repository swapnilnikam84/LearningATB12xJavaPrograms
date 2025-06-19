package ex_10_While_Loop;

import java.util.Scanner;

public class Lab069_Factorial_with_WhileLoop {
    public static void main(String[] args) {
        //Factorial Program

        //step1 - figure out data type -input and output
        //step2 - write rough logic
        //step3 - write proper logic
        //step4 - optimize
        //step5 - find out edge cases

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Factorial");
        System.out.println("Enter The Number : ");

        if(scanner.hasNextInt())
        {
            System.out.println("Enter Int :, rerun program");
        }

        int number = scanner.nextInt();
        int factorial = 1;

        if(number <= 0)
        {
            System.out.println("Factorial is : " +factorial);
        }
        if(number == 0)
        {
            System.out.println("Factorial is : " +factorial);
        }
        if(number > Integer.MAX_VALUE)
        {
            System.out.println("Can't get the factorial" +factorial);
        }

        int i = 1;
        while(i <= number)
        {
            factorial = factorial*i;
            i++;
        }
        System.out.println("Factorial is : " +factorial);
    }
}
