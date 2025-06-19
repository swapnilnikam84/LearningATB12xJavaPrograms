package ex_12_Strings;

public class StringReverse_Q {

    public static void main(String[] args) {

        String s= "madam";
        String t= "";
        for(int i=s.length()-1; i>=0; i--)
        {
            t=t+s.charAt(i);
        }
        System.out.println(t);

        if(s.equals(t))
        {
            System.out.println("String " + s +" is a Palindrome.");
        }
    }
}