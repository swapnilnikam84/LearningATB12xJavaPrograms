package ex_13_Arrays;

import java.util.Scanner;

public class Arrays_User_Input {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the Array : ");
        int size = scanner.nextInt();

        String[] number_marks = new String[size];
        //float[] number_marks =  new float[size];
        //int[] number_marks = new int[size];

        for (int i = 0; i < number_marks.length; i++) {
            System.out.println("Enter the elements : " +i);
            number_marks[i] = scanner.next();
        }

        System.out.println("----Print the values");

        for (String marks : number_marks) {
            System.out.println(marks);
        }

        scanner.close();
    }
}