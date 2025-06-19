package ex_11_Do_While_Loop;

public class Lab072_DoWhile_2 {
    public static void main(String[] args) {

        int a = 0;
//        while(a<0)      //no o/p
//        {
//            System.out.println(a);
//            a++;
//        }
        do
        {
            System.out.println(a);
            a++;
        }
        while(a<0);       // 0 will print 1 time
    }
}