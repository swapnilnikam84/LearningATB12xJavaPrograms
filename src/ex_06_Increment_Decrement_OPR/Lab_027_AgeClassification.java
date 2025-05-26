package ex_06_Increment_Decrement_OPR;

import org.w3c.dom.ls.LSOutput;

public class Lab_027_AgeClassification {
    public static void main(String[] args) {

        //age = 23 -> Adult (age>18), Minor (age<18), Senior (age > 65)
        //Take input
        String age_string = args[0];
        String a1 = args[1];
        String a2 = args[2];
        String a3 = args[3];
        //String a4 = args[4];
        int age = Integer.parseInt(age_string);
        System.out.println(age);
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);

        String result = (age < 18) ? "Minor" : (age <= 65) ? "Adult" : "Senior Citizen";
        System.out.println(result);

        float f1 = Float.parseFloat(a1);
        System.out.println(f1);
    }
}