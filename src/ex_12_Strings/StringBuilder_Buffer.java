package ex_12_Strings;

public class StringBuilder_Buffer {
    public static void main(String[] args) {

        //String - 90%
        String s1 = "Swapnil";
        String s2 = new String("Swapnil");

        //less than < 10% used
        StringBuffer stringBuffer = new StringBuffer("Swapnil");
        StringBuilder stringBuilder = new StringBuilder("Swapnil");

        System.out.println(stringBuffer);  //Swapnil
        System.out.println(stringBuilder);  //Swapnil
        System.out.println(stringBuffer.reverse()); //linpawS
        System.out.println(stringBuilder.reverse()); //linpawS

    }
}
