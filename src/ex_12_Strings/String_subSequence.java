package ex_12_Strings;

public class String_subSequence {
    public static void main(String[] args) {

       /* str.subSequence(begin, end)
         //Params:
         beginIndex – the begin index, inclusive.
         endIndex – the end index, exclusive.
        */

        String s = (String) "Java".subSequence(1,3);
        System.out.println("subSequence of 'Java' for 1,3 is : " +s);   //av

        String s1 = (String) "Swapnil".subSequence(0,4);
        System.out.println("subSequence of 'Swapnil' for 0,4 is : " +s1);   //Swap

    }
}