package ex_03_Literals;

import java.util.Scanner;

public class TakingInputs3_IntergerORnot {
    public static void main(String[] args) {
        System.out.println("Taking input from the user : ");
        Scanner sc = new Scanner(System.in);
        boolean b1 = sc.hasNextInt();
        System.out.println("Entered Number is Integer: " +b1);


    }
}