package ex_09_For_Loop;

public class Lab058_ForLoop_Top50_Odd_Even {
    public static void main(String[] args) {
        //To find even numbers from 1 to 10
        //even -> i%2==0

        for (int i = 1; i < 50; i++) {
            if(i%2==0)
            {
                System.out.println("Even No is : " +i);
            }
        }
    }
}
