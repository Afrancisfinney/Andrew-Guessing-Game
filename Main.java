import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);

        int x = rand.nextInt(101); 
        int guess;
        int count = 0; 

        System.out.println("Enter your first guess:");
        guess = scan.nextInt();
        count++;

        while (guess != x) {
            if (guess < x) {
                System.out.println("Too low!");
            } else {
                System.out.println("Too high!");
            }

            System.out.println("Enter your next guess:");
            guess = scan.nextInt();
            count++;
        }

        System.out.println("You got it!");

        if (count <= 7) {
            System.out.println("You got an impossibly good score!");
        } else if (count <= 10) {
            System.out.println("You did a good job!");
        } else {
            System.out.println("Try the divide and conquer strategy next time!");
        }
    }
}
