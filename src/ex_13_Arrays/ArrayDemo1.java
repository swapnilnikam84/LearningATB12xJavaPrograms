package ex_13_Arrays;

public class ArrayDemo1 {
    public static void main(String[] args) {

        //int a=4;  or int a;
        //a=4;
//Array - A container which stores multiple values of same data type.

        //Declare array and allocate memory for the values.
        int a[] = new int[5];
        a[0]=2;  //initialized values into that array
        a[1]=6;
        a[2]=1;
        a[3]=9;
        a[4]=12;

        for(int i=0; i<a.length; i++)
        {
            System.out.println(a[i]);
        }

    }
}
