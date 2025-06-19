package ex_03_Literals;

import java.util.Scanner;

public class TakingInputs {
    public static void main(String[] args) {

        System.out.println("Taking input from the user : ");
        Scanner sc = new Scanner(System.in);  //Scanner object created
        //System.in - take input from keyboard.
        System.out.println("Enter number 1: ");
      //  int a = sc.nextInt();
        float c = sc.nextFloat();
        System.out.println("Enter number 2: ");
       // int b = sc.nextInt();
        float d = sc.nextFloat();
       // int sum = a+b;
        float sum2 = c+d;
      //  System.out.println("Sum of these numbers is : ");
      //  System.out.println(sum);
        System.out.println("Sum of float is :" +sum2);

    }
}