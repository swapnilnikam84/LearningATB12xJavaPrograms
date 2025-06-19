package ex_12_Strings;

public class String_subString {
    public static void main(String[] args) {

        /*
          The substring begins with the character at the
          specified index and extends to the end of this string.
          beginIndex – the beginning index, inclusive
         */

        String s = "Java".substring(2);
        System.out.println("substring of 'Java' for 2 is : " + s);    //va

        String s1 = "Swapnil".substring(3);
        System.out.println("substring of 'Swapnil' for 3 is : " + s1);   //pnil

        char[] arr = "Java".toCharArray();
        System.out.println(arr);

        String trm = " Java ".trim(); //will remove extra head and tail spaces
        System.out.println("Trim : " + trm);

        boolean b = "  ".isBlank();
        System.out.println("isBlank : " + b);

        String s2 = "ab".repeat(3);
        System.out.println("Repeat ab : " + s2);

        boolean b1 = "Java".equalsIgnoreCase("java");
        System.out.println(b1);

        String s3 = String.format("%s = %d", "age", 25); //age = 25
        System.out.println(s3);

        long count = "a\nb\nc".lines().count();  //line count - 3
        System.out.println(count);
    }
}