package ex_12_Strings;

public class String_Builder2 {
    public static void main(String[] args) {

        StringBuffer SB = new StringBuffer("Java");
        SB.append(" Programming");
        System.out.println(SB);
        SB.delete(5,16);  //Delete the substring
        System.out.println(SB);
        SB.replace(0,4,"C++"); //Replace the substring
        System.out.println(SB);

    }
}
