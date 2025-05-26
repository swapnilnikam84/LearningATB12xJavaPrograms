package ex_08_Switch_Statements;

public class Lab039_Interview_Switch_characters {
    public static void main(String[] args) {

        char ch = 'A';
        switch (ch) //characters are also integers
        {
            case 65:
                 System.out.println("Match ASCII");
                 break;
            default:
                System.out.println("No Match");
        }
    }
}