package exercises;
import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many miles have you driven?:");

        float distance = input.nextFloat();
        System.out.println("How many gallons of gas were used?:");

        float gasUsed = input.nextFloat();
        System.out.println("Your average MPG is: " + (distance / gasUsed));
    }
}
