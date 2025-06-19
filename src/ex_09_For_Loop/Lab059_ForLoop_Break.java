package ex_09_For_Loop;

public class Lab059_ForLoop_Break {
    public static void main(String[] args) {
        for(int i = 0; i < 50; i++)   //0 to 49 , 50 time loop run
        {
            if(i == 50)
            //if(i == 5)
            {
                //System.out.println(i);
                break;
            }
           System.out.println(i);
        }
    }
}
