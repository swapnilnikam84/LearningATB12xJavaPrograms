package ex_04_TypeCasting;

public class Lab021_Narrowing {
    public static void main(String[] args) {

        int val = 300;
        //byte b = val;     //Narrowing -Implicit- JVM to do it
                          // (Data loss will be there)

        byte b1 = (byte) val; //Narrowing-EXPLICIT JVM to do it
                            //
        System.out.println(b1);  //o/p -> 44
    }

}
