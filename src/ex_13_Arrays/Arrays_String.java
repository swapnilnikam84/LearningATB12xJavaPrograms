package ex_13_Arrays;

import java.util.Arrays;

public class Arrays_String {
    public static void main(String[] args) {

        String[] names = {"swapnil", "amol", "samir" ,"ashish"};
        System.out.println(names.length);
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[3]);
        System.out.println(Arrays.toString(names));

        String[] new_names = new String[3];
        new_names[0]="Vinayak";
        new_names[1]="Sam";
        new_names[2]="Peter";
        System.out.println(Arrays.toString(new_names));

    }
}