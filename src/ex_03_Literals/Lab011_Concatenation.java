package ex_03_Literals;

public class Lab011_Concatenation {

    public static void main(String[] args) {
        System.out.println("Swapnil"+"Nikam"); //SwapnilNikam

        int a= 10;
        int b = 20;
        System.out.println(a+b);  //30

        String name1 = "Swapnil";
        String name2 = "Nikam";
        System.out.println(name1+name2);   //SwapnilNikam

        //SwapnilNikam1020-first 2 operator(string) + performed as Concatenation
        System.out.println(name1 + name2 + a + b);  //SwapnilNikam1020

        //first 2 operator integers +    ->
        System.out.println(a + b + name1 + name2);  //30SwapnilNikam

        // mathematical operations with concatenation
        //**BODMAS - bracket of Div, Mul, Add, Sub
        System.out.println(name1 + name2 + (a+b));  //SwapnilNikam30

        System.out.println((9 * 3 / 9 + 1) * 3);  //12
        // 9*3  -> 27
        // 27/9 -> 3
        // 3+1  -> 4
        // 4 *3 -> 12

    }


}
