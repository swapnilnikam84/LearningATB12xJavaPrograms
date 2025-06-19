package ex_12_Strings;

public class Interview3_Strings {
    public static void main(String[] args) {

        String s1 = "Hello";
        String s2 = "Hello";

        String s3 = new String("Hello");
        String s4 = new String("Hello");
        String s5 = new String("hello");

        // ==  > comparison String - this check the ref location
        System.out.println(s1 == s3); //false
        System.out.println(s1 == s4); //false
        System.out.println(s3 == s4); //false

        System.out.println(s1 == s2); //true

        //equals (content check)  -> value check
        System.out.println(s1.equals(s3)); //true
        System.out.println(s1.equals(s4)); //true
        System.out.println(s1.equals(s5)); //false
        System.out.println(s1.equalsIgnoreCase(s5)); //true


    }
}
