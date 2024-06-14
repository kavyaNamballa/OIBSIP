import java.util.Scanner;
import java.lang.Math;

public class NumberGuessing {
    public static void main(String[] args) {
        boolean play = true;
        Scanner sc = new Scanner(System.in);
        while (play) {
            int answer = (int) (Math.random() * 100) + 1;
            int k = 10;
            boolean correct = false;
            int chances=1;
            System.out.println("A number is choosen between 1 to 100. \nGuess the number within 10 chances.");
            while (k > 0) {
                System.out.print("Trial "+chances+" : Guess the number: ");
                int guess = sc.nextInt();
                if (guess == answer) {
                    System.out.println("Correct!! You Win!.");
                    correct = true;
                    break;
                } else if (guess > answer) {
                    System.out.println("The number is less than " + guess + " sorry, you have still " + (k - 1) + " chances left.");
                    k--;
                } else if (guess < answer) {
                    System.out.println("The number is greater than " + guess + " sorry, you have still " + (k - 1) + " chances left.");
                    k--;
                }
                chances++;
            }
            if (correct == false) {
                System.out.println("The number was " + answer);
                System.out.println("Play again ...");
            }
            System.out.print("want to play again? (yes/no): ");
            String playAgain = sc.next();
            if (!playAgain.equalsIgnoreCase("yes")) {
                play = false;
                System.out.println("Thank you for playing!");
            }
        }
        sc.close();
    }
}