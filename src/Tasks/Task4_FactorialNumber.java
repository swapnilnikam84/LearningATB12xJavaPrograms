package Tasks;

import java.util.Scanner;

public class Task4_FactorialNumber {
    public static void main(String[] args) {

       // factorial no - 5 -> 1*2*3*4*5=120
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int fact = 1;
        if(n == 0)
        {
            System.out.println("Enter The No : " +fact);
        }

        for(int i = 1; i <= n; i++)
        {
            fact = fact*i;
        }
        System.out.println("Factorial is : " +fact);
    }
}