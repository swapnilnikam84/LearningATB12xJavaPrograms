package ex_12_Strings;

public class String1_Immutable {
    public static void main(String[] args) {

        /*String -
        ->> Sequence of characters or Bunch of Characters.
        ->> e.x : 'a' - char , "ab" -> Strings
        ->>Non Primitive data types(User Defines)
        ->> String is builtin in jaa.lang.String package-provided by java guys
        ->> String is final class(you cant have children)-inherited
        ****Interview---Immutable Vs Mutable--
        Mutable- can be change
        Immutable-That can be change
         */
        //Immutable - string can not be changes
        String name = "Swapnil";
        name.toUpperCase(); //Immutable - string can not be changes

        System.out.println(name); //Swapnil


    }

}
