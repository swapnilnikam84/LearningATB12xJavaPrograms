package Inheritance;

public class childClass extends parentClass{

    public void engineC()
    {
        System.out.println("New Engine");
    }

    public void colour()
    {
        System.out.println("New Colour is: " + colour);  //from Parent class
    }

    public static void main(String[] args) {

        childClass cC = new childClass();
        cC.colour();
        cC.Gear();
        cC.audioSystem();
    }
}
