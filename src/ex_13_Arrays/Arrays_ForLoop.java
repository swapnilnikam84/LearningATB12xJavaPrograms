package ex_13_Arrays;

public class Arrays_ForLoop {
    public static void main(String[] args) {
        int[] marks = {51, 100, 91, 87, 90};
        System.out.println(marks.length);
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);

        System.out.println("-------");
        for (int i=0; i<marks.length; i++)
        {
            System.out.println(marks[i]);
        }

        System.out.println("-------");
        for (int mark : marks)          //enhanced for loop
        {
            System.out.println(mark);
        }

    }
}