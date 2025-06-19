package ex_12_Strings;

public class InterView5_ReverseString_WithoutInBuilt {
    public static void main(String[] args) {

        String input = "Swapnil";
        //linpawS

               for(int i= input.length()-1; i>=0;i--)
               {
                   System.out.print(input.charAt(i)); //dont use ln new line
               }
    }
}