package ex_13_Arrays;

public class Arrays_ForLoop_Max_Min {
    public static void main(String[] args) {
        int[] array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        int max = array[0];
        int min = array[0];   //for minimum number

        //logic
        for(int i=0; i< array.length; i++)
        {
            if (array[i] > max)        //if(array[i] < min)
            {
                max = array[i];       //min = array[i]
            }
        }
        for(int i=0; i<array.length; i++)
        {
            if (array[i] < min)
            {
              min = array[i];
            }

        }

        System.out.println("Max Number is : " +max);
        System.out.println("Min Number is : " +min);
    }
}