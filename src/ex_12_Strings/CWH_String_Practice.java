package ex_12_Strings;

public class CWH_String_Practice {
    public static void main(String[] args) {
        // Problem-1 - Program to convert a string to lower
        String name = "Jack Parker";
        name =  name.toLowerCase();
        System.out.println(name);

        // Problem-2 - A java Program to replace spaces with underscores
        String text = "To Lower Case";
        text = text.replace(" ","_");
        System.out.println(text);

        //Problem-3 - Program to fill a letter template
        String letter = "Dear <|name|>, \nThanks a lot!";
        letter = letter.replace("<|name|>", "Swapnil");
        System.out.println(letter);

        //Problem-4 - Program to detect double & triple spaces in a string
        String myString = "This string contains  double and    triple spaces";
        System.out.println(myString.indexOf("  "));
        System.out.println(myString.indexOf("   "));

        //Problem - 5 - Program to format the following letter
        // using escape sequence characters
        String myLetter = "Dear Swapnil,\n\tThis is the Best Java Course. \nThanks & Regards";
        System.out.println(myLetter);
    }
}