package ex_12_Functions;

public class Lab077_UserDefined_Func1 {
    public static void main(String[] args) {

        int r1 =sum_of_two(4,5);
        int r2 =sum_of_two(15,20);
        System.out.println(r1);
        System.out.println(r2);
    }

    static int sum_of_two(int first, int second)
    {
        return first+second;
    }

}