package ex_08_Switch_Statements;

public class Lab044_JDK13Above {
    public static void main(String[] args) {

        int itemCode = 006;
        switch (itemCode)
        {
            case 001, 002, 003:        //we can reduce code using like this
                System.out.println("All are Electronic Gadget");
                break;
            case 004, 005, 006:
                System.out.println("This is Mechanical");
                break;
            default:
                System.out.println("None");
        }

    }
}
