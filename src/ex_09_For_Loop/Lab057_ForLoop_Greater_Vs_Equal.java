package ex_09_For_Loop;

import java.io.PrintStream;

public class Lab057_ForLoop_Greater_Vs_Equal {
    public static void main(String[] args) {

        for(int i=0; i<=10; i++)    //0 to 10 , 11 times loop will run
        {
            System.out.println(i);
        }

        for(int i=1; i<=10; i++)    // 1 to 10 , 10 times loop will run
        {
            System.out.println(i);
        }

        for(int i=0; i<10; i++)       //0 to 9 , 10 times loop will run
        {
            System.out.println(i);
        }
    }
}
