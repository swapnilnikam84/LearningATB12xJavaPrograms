package ex_03_Literals;

public class Lab013_ALL_Operators {

    public static void main(String[] args) {

        boolean b1 = true;
        int a = 10;
        int b = 20;
        System.out.println("a+b is: " +(a + b));
        System.out.println(a > b);
        System.out.println(a >= b);
        System.out.println("Compare Operator : " +(a == b));   //compare operator/value compare
        System.out.println(a != b);

        //Arithmetic Operators
        // + addition
        //  - subtraction
        // * multiplication
        // /  division
        //  % modulus / reminder

        int a1 = 20;
        int b2 = 3;
        float c1 = 3.0f;
        System.out.println(a1+b2);
        System.out.println(a1-b2);
        System.out.println(a1*b2);
        System.out.println(a1/b2);
        System.out.println(a1/c1);   //6.6666665

        System.out.println("a1+b1");
        System.out.println(a1+b2);

        //Compound assignment operators
        // +=, -=, /=, *=
        int age = 10;
        age += 10;  //----age = age+10;
//        age /= 10; // ----age = age/10
        System.out.println(age);

    }
}
