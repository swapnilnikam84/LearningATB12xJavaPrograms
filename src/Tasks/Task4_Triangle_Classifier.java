package Tasks;

public class Task4_Triangle_Classifier {
    public static void main(String[] args) {

        int side1 = 5;
        int side2 = 1;  //5
        int side3 = 3;  //5
        //Sum of any 2 sides should be greater than 3rd side
        //555 - Equilateral
        //544 - Iso-scale
        //543 - Scalene
        /*for user input can add scanner
        System.out.println("Enter side1: ");
        int side1 = scanner.nextInt();
         */

        if (side1 + side2 > side3 && side1 + side3 > side2 && side2+side3>side1)
        {
            if (side1 == side2 && side2 == side3) {
                System.out.println("It is a Equilateral Triangle");
            } else if (side1 == side2 || side1 == side3 || side2 == side3) {
                System.out.println("It is a Iso-scale Triangle");
            } else {
                System.out.println("It is a Scalene Triangle");
            }
        }
        else
        {
            System.out.println("Not a valid triangle");    //edge case
        }
    }
}