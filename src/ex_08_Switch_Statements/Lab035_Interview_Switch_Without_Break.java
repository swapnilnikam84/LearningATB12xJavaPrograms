package ex_08_Switch_Statements;

import java.util.Scanner;

public class Lab035_Interview_Switch_Without_Break {
    public static void main(String[] args) {

        //Take user input and tell which day it is
        //1 to 7 -> ex: 1 is Mon & 5 is Fri
        //8 ? - Not allowed or error

        Scanner scanner = new Scanner(System.in);  //to take user input
        System.out.println("Enter the Day from 1 to 7 ");
        int day = scanner.nextInt();    //For next input

            switch (day)
            {
                case 1:
                    System.out.println("Monday");
                case 2:
                    System.out.println("Tuesday");
                case 3:
                    System.out.println("Wednesday");
                case 4:
                    System.out.println("Thursday");
                case 5:
                    System.out.println("Friday");
                case 6:
                    System.out.println("Saturday");
                case 7:
                    System.out.println("Sunday");
                default:
                    System.out.println("Wrong!!-Enter Numbers Only from 1 to 7");
            }
        }

    }
