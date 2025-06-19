package ex_09_For_Loop;

public class Lab056_ForLoop3 {
    public static void main(String[] args) {
        //for(int i = -1; i < -10; i--) //will not print anything
        for(int i = -1; i > -10; i--)
        {
            System.out.println(i);
        }

        int i = 10;
        for(; i > 0; i--)
        {
            System.out.println(i);
        }
    }
}
