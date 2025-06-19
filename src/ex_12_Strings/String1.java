package ex_12_Strings;

public class String1 {
    public static void main(String[] args) {
        //Payment $100 paid

        String str = "Payment $100 paid";
        //Single payment
        System.out.println(str.charAt(8));
        String str1 = "Payments $100 paid";
        System.out.println(str1.indexOf("$"));
        System.out.println(str.substring(8));

    }
}
