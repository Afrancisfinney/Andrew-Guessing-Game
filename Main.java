import java.util.Scanner;
import java.util.Random;
public class Main{

    public static void main(String[]args){
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);

        int x = rand.nextInt(100);
        int guess;
        System.out.println("Enter your first guess:");
        guess = scan.nextInt();
        int count=0; //count the number of time user guesses

        while(guess!=x){
        if (guess<x) {
            System.out.println("Guess is too low,please try again");

        } else if (guess>x) {
            System.out.println("Guess is too high, please try again");
        } 
            
        System.out.println("Enter your next guess:");
        guess = scan.nextInt();
        if (guess==x){
            System.out.println("You got it");
        }

        


            
        }



    }
}
