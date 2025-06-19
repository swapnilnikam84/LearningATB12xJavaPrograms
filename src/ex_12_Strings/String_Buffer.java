package ex_12_Strings;

public class String_Buffer {
    public static void main(String[] args) {

        StringBuffer stringBuffer = new StringBuffer("Swapnil");
        stringBuffer.append("Nikam");
        System.out.println(stringBuffer);
        //SwapnilNikam //OA-only 1 string will create due to mutability

        String s1 = "Swapnil";
        s1 = s1 + "Nikam";
        System.out.println(s1);
        //SwapnilNikam -SCP- 2 strings gets created


    }
}
