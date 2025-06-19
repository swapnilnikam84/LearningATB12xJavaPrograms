package ex_12_Strings;

public class Strings_Functions {
    public static void main(String[] args) {

        char c = 'A';
        System.out.println(c);   //A

        String s1 = "ABCD";   //SCP
        System.out.println(s1);  //ABCD
        System.out.println(s1.length());  //4
        System.out.println(s1.toLowerCase());  //SCP - abcd
        System.out.println(s1.concat("E"));   // ABCDE
    }
}
