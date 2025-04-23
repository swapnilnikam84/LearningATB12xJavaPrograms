package ex_03_Literals;

import org.w3c.dom.ls.LSOutput;

public class Lab012_Equal {

    public static void main(String[] args) {
        // == ? Compare the values
        System.out.println(10 == 10);
        System.out.println(10 < 10);
        System.out.println(10 == 20);
        System.out.println(10 >= 10);

        System.out.println(!(10 > 20));

        //  -|| OR
        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || true);
        System.out.println(false || false);

        // && AND
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(false && false);

        int salary = 12;
        boolean b = !(salary > 10 || salary < 5);
        System.out.println(b);
        // A- salary  > 10 -> 12 > 10 -> true
        // B- salary < 5 -> 12 < 5 -> false
        //!(A || B ) -> !(true || false) -> !true -false

    }
}
