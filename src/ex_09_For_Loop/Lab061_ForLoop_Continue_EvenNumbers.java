package ex_09_For_Loop;

public class Lab061_ForLoop_Continue_EvenNumbers {
    public static void main(String[] args) {

        for(int i = 0; i <= 50; i++)
        {
            if(i%2==0)      //for print Even numbers
           // if(i%2!=0)     //for Odd numbers
            {
                System.out.println("Even : " +i);   //we can skip if not writing sout
                continue;
            }
            else
            {
                System.out.println("Odd Number is : " +i);
            }
        }
    }
}