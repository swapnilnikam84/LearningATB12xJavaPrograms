package ex_08_Switch_Statements;

import java.util.Scanner;

public class Lab034_Switch1 {
    public static void main(String[] args) {

        //Take user input and ask for integer -1 to 7 for Days
        //you will tell which day it is
                //logic building
        //Step1 - Use scanner class
        //Step2 - figure out expression and the day
        //Step3 - add step 3 as a rough logic
        //Step4 - write and fix the logic and optimize
        //Step5 - figure out the edge cases

        Scanner scanner = new Scanner(System.in);  //to take user input
        System.out.println("Enter the Day from 1 to 7 ");
       // int day = 1;
        if(scanner.hasNextInt())      //it will return true
        {
           int day = scanner.nextInt();    //For next input

            switch (day)
            {
                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.println("Wednesday");
                    break;
                case 4:
                    System.out.println("Thursday");
                    break;
                case 5:
                    System.out.println("Friday");
                    break;
                case 6:
                    System.out.println("Saturday");
                    break;
                case 7:
                    System.out.println("Sunday");
                    break;
                default:
                    System.out.println("Wrong!!-Enter Numbers Only from 1 to 7");
            }
        }
        else
        {
            System.out.println("You are WRONG!!, do not enter non-int value");
        }
    }
}
