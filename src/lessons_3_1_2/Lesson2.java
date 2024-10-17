package lessons_3_1_2;
import java.util.Scanner;

public class Lesson2 {
    public static void main(String[] args) {
        // we only printed true/false before, but let's use those outputs
        // to change the flow of the program

        // Ask a user for their favorite number
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        // if it is above 12, print "That's a large number!"
        if (number > 12) System.out.println("That's a large number!");
        // if it is 12 or lower, print "That's a small number"
        else System.out.println("That's a small number");

        // Go to the rectangle class and implement the isSquare method
        Rectangle rect = new Rectangle(number, number);
        System.out.println(rect.isSquare());
        // following the JavaDoc specs


    }
}
