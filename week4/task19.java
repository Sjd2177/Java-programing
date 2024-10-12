import java.util.Random;
import java.util.Scanner;

public class task19 {
    public static void main(String[] args) {
        Random random = new Random();
        int number1 = random.nextInt(10);
        int number2 = random.nextInt(10);
        Scanner input = new Scanner(System.in);
        System.out.println("What is " + number1 + " + " + number2 + "?");
        int answer = input.nextInt();
        if (answer == (number1 + number2)) {
            System.out.println("Correct! Well done.");
        } 
        else {
            System.out.println("Incorrect. The correct answer is " + (number1 + number2) + ".");
        }

    }
}
