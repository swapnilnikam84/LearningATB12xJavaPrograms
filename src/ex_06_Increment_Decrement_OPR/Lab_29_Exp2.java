package ex_06_Increment_Decrement_OPR;

public class Lab_29_Exp2 {
    public static void main(String[] args) {
        int a = 10;

        System.out.println(a++);    //10
        System.out.println(a);        //11
        System.out.println("--------------------------------------");
        System.out.println(++a);    //12
        System.out.println(a);      //12
        System.out.println("--------------------------------------");
        System.out.println(++a + ++a);  //13+14 = 27
        System.out.println(a);   //14
        
    }
}
