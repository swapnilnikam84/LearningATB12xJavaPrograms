package ex_12_Strings;

public class String_Example {
    public static void main(String[] args) {

        String s = "JAVA";
        char c = s.charAt(2);
        char c1 = s.charAt(3);
        //Index = 0;  ->will print index number 0,1,2,3,4.....
        System.out.println(c);
        System.out.println(c1);

        //it will print unicode characters
        System.out.println(s.codePointAt(0));

        //compareToIgnore(String sr)
        int result = "abc".compareTo("ABC");//if matching give ASCAI value else 0
        int result1 = "abc".compareToIgnoreCase("ABC");
        System.out.println(result);
        System.out.println(result1);

        int indx = "JAVA".indexOf("A");  //A-1 , if java-> a= 1
        int indx1 = "JAVA".lastIndexOf("A");
        System.out.println(indx);    // -1
        System.out.println(indx1);    // -1


        boolean b = "".isEmpty();
        System.out.println(b);  //true

        String s11 = String.join("-","Java", "Python");
        System.out.println(s11); //Java-Python



    }
}