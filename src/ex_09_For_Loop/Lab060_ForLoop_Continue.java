package ex_09_For_Loop;

public class Lab060_ForLoop_Continue {
    public static void main(String[] args) {
        for(int i = 0; i< 50; i++)    // 0 to 49 , loop run 50 times
        {
            if(i == 5)      //it will skip the 5 number
            {
                continue;
            }
            System.out.println(i);
        }

    }
}