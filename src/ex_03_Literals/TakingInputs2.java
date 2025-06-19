package ex_03_Literals;

import java.util.Scanner;

public class TakingInputs2 {
    public static void main(String[] args) {

        System.out.println("What is your name: ");
        Scanner sc = new Scanner(System.in);
       // String name = sc.next(); //read only word not space if type full line/sentence.
        String name = sc.nextLine(); //to read whole line
        System.out.println("Hello "+name+" Have a good day!");

    }
}