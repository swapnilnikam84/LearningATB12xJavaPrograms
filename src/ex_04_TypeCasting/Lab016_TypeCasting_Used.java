package ex_04_TypeCasting;

public class Lab016_TypeCasting_Used {
    public static void main(String[] args) {
        int course = 100;
        float GST = 18.45f;
        // int total = cours+GST; //Narrow -implicit
        int total1 = course+(int)GST; //narrow-Explicit
        System.out.println(total1);

        float total2 = course+GST; // widening- auto - implicit
        float total3 = (float)course+GST; // widening- explicit
        System.out.println(total2);
        System.out.println(total3);
    }
}
