package ex_04_TypeCasting;

public class Lab015_TypeCasting {

    public static void main(String[] args) {
        byte b = 10;
        int a = b;   //valid syntax -smaller data into bigger data type
        //implicit- casting - widening


        byte c = 10;
        int d = (int)c;  // Explicit casting-widening(dosent require)

        int val = 200;
       // byte vb = val;   // invalid -narrowing-Implicit casting is not allowed

        byte b2 = (byte)val;  //Valid -Narrowing-Explict Casting-Allowed
        // data loss
        System.out.println(b2);







    }
}
