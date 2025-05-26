package ex_07_IfElse_Condition;

public class Lab029_If {
    public static void main(String[] args) {

        //Integer.parseInt  - convert string to integer
        int age = Integer.parseInt(args[0]);
        if(age > 18)
        {
            System.out.println("You can vote");
        }
        else
        {
            System.out.println("You Can't Vote");
        }
    }
}
