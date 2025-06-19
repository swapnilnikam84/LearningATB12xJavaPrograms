package ex_07_IfElse_Condition;

public class CWH_conditionals {
    public static void main(String[] args) {

        int age = 19;
        boolean cond = (age>18);
        if(cond)
        //if(age>18)
        {
            System.out.println("Yes you can Drive");
        }
        else
        {
            System.out.println("You can not Drive");
        }
    }
}