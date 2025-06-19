package ex_03_Literals;

import java.util.Scanner;

public class CBSCMarks {
    public static void main(String[] args) {
///write a program that calculates the percentage of a student's marks
        //int sub;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Maths marks : ");
        int maths = sc.nextInt();
      //  float maths = sc.nextFloat();
        System.out.println("Enter Science marks : ");
        int sci = sc.nextInt();
        System.out.println("Enter History marks : ");
        int his = sc.nextInt();
        System.out.println("Enter English marks : ");
        int eng = sc.nextInt();
        System.out.println("Enter Drawing marks : ");
        int dra = sc.nextInt();

        float total = maths+sci+his+eng+dra;
        System.out.println("Total marks are : " + total);
        float pMarks = (total * 100)/500.0f;
        System.out.println("Percentage of CBSC marks are: "+pMarks+"%");
    }
}