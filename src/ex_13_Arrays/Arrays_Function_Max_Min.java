package ex_13_Arrays;

public class Arrays_Function_Max_Min {
    public static void main(String[] args) {

        int[] array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        int max_num = give_max(array);
        System.out.println("Max num is : " +max_num);
        //to find max and min

    }
    static int give_max(int[] array)
    {
        int max = array[0];
        //logic
        for(int i=0; i<array.length; i++)
        {
          if(array[i] > max)
          {
              max = array[i];
          }
        }
        return max;
    }
}