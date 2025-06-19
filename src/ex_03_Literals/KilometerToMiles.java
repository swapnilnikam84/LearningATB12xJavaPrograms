package ex_03_Literals;

import java.util.Scanner;

public class KilometerToMiles {
    public static void main(String[] args) {

        Scanner kmm = new Scanner(System.in);
        System.out.println("Enter the km value : ");
        double km = kmm.nextDouble();
        double mile = km*0.621371;
        System.out.println("Conversion of km to miles is : " +mile);


    }
}