package ex_13_Arrays;

public class Arrays1 {
    public static void main(String[] args) {
    /*
        >> Array is a collection of data which is of similar type
        >> 10th Marks - 90,91,92,93,94 data -> int into arrays.
        >> name of students -> amit, lucky, pramod
        >> Array is also called as Homogeneous data structure.
        >> Elements of an array will be stored in contiguous memory locations.
        >> 1 > int [] marks = {51,100,91,87,90,91,92}
          total element -7  | index - 0 to 6
        >> 2 > int[] mat = new int[]
    */
        //Declaration
        int[] numbers;

        //Initialization
        numbers = new int[6]; //default values are 0

        //Declaration + numbers
        String[] browsers = {"Chrome", "Firefox", "Edge"};

        //Accessing arrays elements
         System.out.println(browsers[0]);  //Chrome

        //Iterating Through Arrays
        for(int i =0; i< browsers.length; i++)
        {
            System.out.println(browsers[i]); //
        }
            //Enhanced for loop
//        for(String browsers : browsers)
//        {
//            System.out.println(browsers);
//        }

    }
}