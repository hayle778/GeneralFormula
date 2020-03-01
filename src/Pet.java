import java.util.Scanner;

public class Pet {
public static void main(String[]args){

    Scanner  input = new Scanner(System.in);


    System.out.println( "Enter a digit" );
    double a = input.nextInt ();
    System.out.println( "Enter a digit2" );
    double e = input.nextInt ();
    System.out.println( "Enter a digit3" );
    double i = input.nextInt ();
    System.out.println( "Enter a digit 4" );
    double o = input.nextInt ();
    System.out.println( "Enter a digit  5" );
    double u = input.nextInt();
    System.out.println( "Enter a digit 6" );
    double k = input.nextInt();


    // Create a general formula that can add an input digit by the user and calculate
    //following the formula

    double formula = (a * e - i * o)/(u - k);

    System.out.println( "The final result is: "+ formula );




}
}
