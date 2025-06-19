package ex_12_Strings;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class CWH_String1 {
    public static void main(String[] args) {

       // String name = new String("Swapnil");
        String name = "Swapnil";
        System.out.print("The Name is:"); //print
        System.out.println(name);        //println

        int a = 6;
        float b = 5.542f;
        System.out.printf("The value of a is %d and value of b is %f", a,b);

        Scanner sc = new Scanner(System.in);
        //String st = sc.next();  //next- it prints first word only
        String st1 = sc.nextLine(); //for next word/next line data
        System.out.println(st1);

    }
}