
//program that generates a random number between 1 to 100 and asks the user to guess what the number is.
import java.util.Scanner;

public class GuessNo {
    public static void main(String[] args) {
        int number = (int) (Math.random() * 100) + 1;
        Scanner sc = new Scanner(System.in);
        int guess;
        do {
            System.out.print("Guess the number between 1 to 100: ");
            guess = sc.nextInt();
            if (guess > number) {
                System.out.println("Too high, try again.");
            } else if (guess < number) {
                System.out.println("Too low, try again.");
            }
        } while (guess != number);
        System.out.println("Congratulations! You guessed the number.");
        sc.close();
    }
}
