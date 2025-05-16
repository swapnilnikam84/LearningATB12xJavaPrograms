package ex_03_Literals;

public class Lab010_Operators {

    public static void main(String[] args) {
        //***assignment operator***
                int age = 90;  //assignment operator =
        System.out.println(age);
        age+=5;  // age = age+3; // 90+5 = 95
        System.out.println(age);
        age-=5;  // age = age-10; // 95-10 = 85
        System.out.println(age);

        //***Arithmetic operators***
        // + addition
        //  - subtraction
        // * multiplication
        // /  division
        //  % modulus / reminder

        int a = 20;
        int b = 3;
        float c = 3.0f;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a/c);   //6.6666665

        System.out.println("a+b");
        System.out.println(a+b);

        //***Unary Operator***
        int d = +10;
        int e = -110;
        int result = d+e;
        System.out.println(d);
        System.out.println(e);
        System.out.println(result);

        //***Mod /modulus- -> reminder***
        int f = 13;
        int g = 7;
        System.out.println(f%g);

        //***Relational operators***
        // <   less than
        // <= less than & equal to
        // > greater
        // > =  greater or equal
        // ==  equal to
        //  !=  not equal

        int h = 10;
        int i = 30;
        boolean j = h>i;
        System.out.println(j);

        int age_father = 39;
        int age_daughter = 40;
        boolean result1 = age_father >= age_daughter;
        System.out.println(result1);

        boolean a1 = true;
        System.out.println(!a1);
        boolean b1 = true;
        System.out.println(!!b1);

        boolean c1 = true || false;
        System.out.println(c1);

    }

}
