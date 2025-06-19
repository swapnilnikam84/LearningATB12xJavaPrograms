package ex_12_Strings;

public class CWH_String_Methods {
    public static void main(String[] args) {

        String name = "Swapnil";
        System.out.println(name);

        int value = name.length();
        //System.out.println(value);

//        String lString = name.toLowerCase();
//        System.out.println(lString);
//
//        String uString = name.toUpperCase();
//        System.out.println(uString);
//
//        String nonTrimString = "       Swapnil";
//        System.out.println(nonTrimString);
//        System.out.println(nonTrimString.trim());
//        String TrimString = nonTrimString.trim();
//        System.out.println(TrimString);

      //  System.out.println(name.substring(1));
       // System.out.println(name.substring(1,3));

       // System.out.println(name.replace('p','a')); //replace
      //  System.out.println(name.replace("Swapn","Rashm"));

      //  System.out.println(name.startsWith("S"));
      //  System.out.println(name.endsWith("l"));

       // System.out.println(name.charAt(0));  //charAT-char on given index

       // System.out.println(name.indexOf("p")); //index of given string
        String modname = "Swaappnnil";

//      System.out.println(name.lastIndexOf("i")); //last index-5
//      System.out.println(name.lastIndexOf("ni",3)); //
        //0 1 2 3 4 5 6
        //s w a p n i l
        System.out.println(name.equals("swapnil"));  //equals
        System.out.println(name.equalsIgnoreCase("SWAPNIL"));

        System.out.println("I am escape sequence \nHello All" );
        // \n , \t , \' , \\

    }
}