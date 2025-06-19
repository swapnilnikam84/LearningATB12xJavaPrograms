package ex_13_Arrays;

public class Multidimentional_Array {
    public static void main(String[] args) {
        //Multidimentional Array
        //Declare array and Initialize values into that array

        int a[][] = new int[2][3];  //2 by 3
        int b[][] = {{2,4,5},{8,3,4},{6,2,9}}; //3 by 3
        a[0][0]=2;
        a[0][1]=4;
        a[0][2]=5;
        a[1][0]=8;
        a[1][1]=3;
        a[1][2]=4;

        System.out.println(a[1][0]);
        System.out.println(b[2][1]);

    }
}