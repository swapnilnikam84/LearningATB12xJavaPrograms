package ex_01_Java_Basic;

public class Lab001_HelloWorldProgram
{
//in multiple methods JVM will recognize only main method.

    public static void main(String[] args)
    {
        System.out.println("Hello World.");
    }

    public void swap(String[] args)
    {
        System.out.println("Hello Swap.");
    }
}