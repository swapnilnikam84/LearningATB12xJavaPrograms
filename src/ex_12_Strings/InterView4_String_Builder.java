package ex_12_Strings;

public class InterView4_String_Builder {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Swapnil");
        sb.append(" Nikam"); //joins the string
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);
    }
}