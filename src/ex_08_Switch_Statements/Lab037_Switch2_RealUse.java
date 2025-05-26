package ex_08_Switch_Statements;

import java.util.Scanner;

public class Lab037_Switch2_RealUse {
    public static void main(String[] args) {

        //String browser = args[0]; -we can use directly argument 0
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Browser");
        String browser = scanner.next();
        browser = browser.toLowerCase(); //**lower(Chrome. CHROME, CHrome)==chrome

        switch (browser)
        {
            case "chrome":
                System.out.println("Starting the Chrome");
                System.out.println("...........");
                System.out.println("TC1");
                System.out.println("TC2");
                break;
            case "Firefox":
                System.out.println("Starting the Firefox");
                break;
            case "Edge":
                System.out.println("Execute the Edge Code");
            default:
                System.out.println("No Idea : Which browser is this");
                break;
        }

    }
}
