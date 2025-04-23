package ex_03_Literals;

public class Lab014_InterviewQ {

    public static void main(String[] args) {

       //Q-1
        int a = 10;
        boolean b = (10 == 11);  //  ==  -> Comparison 2 values
        System.out.println(a);
        System.out.println(b);

        //Q-2
        long l = 10l;   // 8 byte - 64 bits
        String s = "name";

        //Q-3
        char a1 = 'A';  //ASCII -> 65
        char b1 = 'B';  // 66
        System.out.println(a1 + b1);

        //Q-4
        System.out.println('A' == 65);

        //Q-5
        short s1 = 10;
        char c1 = 'A';   //ASCII value - 65
        System.out.println(c1+s1);


    }
}
