package ex_08_Switch_Statements;

import java.util.Scanner;

public class Lab036_Interview_Switch {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); //to take user input
        System.out.println("Enter the number from 1 to 7 : ");
        int day = scanner.nextInt();    //For next input

        switch (day)
        {
            case 1:
                System.out.println("Mon");
                break;
            case 2:
                System.out.println("Tue");
                break;
        }
    }
}