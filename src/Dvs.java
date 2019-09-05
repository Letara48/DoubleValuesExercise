import java.util.Scanner;


public class Dvs
{
    public static void main( String[] args )
    {
        Scanner keyboard = new Scanner(System.in);
     //initialize at zero
        double num1, num2;

        double sum = 0;

        double average;

        //test
        //System.out.println(average);

//        for(double i=0; i<args.length; i++){
//            sum += Double.valueOf( args[i] );
        // calculate the average
//            double average = sum/args.length;
//        }

        // ask for numbers from user
        System.out.print( "Number 1: " );
        num1 = keyboard.nextDouble();

        System.out.print( "Number 2: " );
        num2 = keyboard.nextDouble();

        //calculate the average

        average = (num1 + num2) / 2;

        System.out.println("The average of the numbers is : " + average);
    }
}

