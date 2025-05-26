package ex_03_Literals;

public class Lab008_Literals_P1 {

    public static void main(String[] args) {
       //literals
        int age = 65;  //65-is integer literal
       age = 66;

       //constant
        final int girl_age = 18; //18 is integer literal
        //girl_age = 19;

        float pi = 3.14f;  //3.14f is floating literal
        float pi2 = 3.14F;
        float x = 10.00f;

        boolean is_married = true;   //true/false - boolean literal
        boolean is_married1 = false;

        char c1 = 'A';   //character literals
        //char c2 = "A";   //not valid char, it is string
        char c3 = '@';
        char c4 = '_';
        char c5 = '9';
        char c6 = '(';
        char c7 = ' '; //blank space

        //escape char
        char  new_line = '\n';
        char tab_line = '\t';
        char back_space = '\b';
        char carriage_return = '\r';  //will delete first word
        System.out.println("SwapnilNikam");
        System.out.println("Swapnil"+new_line+"Nikam");
        System.out.println("Swapnil"+tab_line+"Nikam");
        System.out.println("Swapnil"+back_space+"Nikam");
        System.out.println("Swapnil"+carriage_return+"Nikam");

        char c10 = 'A';
    }
}
