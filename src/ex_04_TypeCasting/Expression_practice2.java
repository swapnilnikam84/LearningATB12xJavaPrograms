package ex_04_TypeCasting;

public class Expression_practice2 {
    public static void main(String[] args) {

        /*encrypt a grade by adding 8 to it
         and decrypt it to show the correct grade.
         */
        char grade = 'B';
        grade = (char)(grade+8);  // type casting in other data type
        System.out.println(grade);

        //Decrypting the grade
        grade = (char)(grade-8);
        System.out.println(grade);


    }
}
