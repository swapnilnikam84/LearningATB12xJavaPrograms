package ex_12_Functions;

import java.util.Scanner;

public class Lab078_UserDefined_Func2 {
    public static void main(String[] args) {

        //User defined function types
        //1 -> without parameters -without return type
        //2 -> without parameters -with return type
        //3 -> with parameters -without return type
        //4 -> with parameters -with return type

        wip_wir(); // without parameters -without return type
//-----------------------------------
        wip_wr();  // without parameters -with return type
        String msg = wip_wr();
        System.out.println(msg);

//-----------------------------------
        wp_wir("Swapnil", 40, 200000);
        wp_wir("Ravi", 37, 200000);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Name: ");
        String name = scanner.next();
        System.out.println("Enter Age: ");
        int age = scanner.nextInt();
        System.out.println("Enter Salary: ");
        double salary = scanner.nextDouble();
        wp_wir(name, age, salary);
//---------------------------------
        int sum = wp_wr_Sumint(10, 20 );
        float sumf = wp_wr_Sumfloat(15, 30 );
        System.out.println(sum);
        System.out.println(sumf);

    }
   // 1 -> without parameters -without return type
      static void wip_wir()
      {
          System.out.println("Type1-UserDefined");
      }
    //2 -> without parameters -with return type
    static String wip_wr()
    {
        System.out.println("Type2-UserDefined");
        return "wip_wr";
    }
    //3 -> with parameters -without return type  (90% we will use realtime)
    static void wp_wir(String name, int age, double salary)
    {
        System.out.println("Your name : "+name+"\nYour age : "+age+"\nYour Salary : " +salary);
    }
    //4 -> with parameters -with return type
    static int wp_wr_Sumint(int a, int b)
    {
        return a+b;
    }

    static float wp_wr_Sumfloat(float a, float b)
    {
        return a+b;
    }
}
