import java.util.Random;
import java.util.Scanner;
public class NumberGuessingGame {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Random random=new Random();
        boolean playAgain=true;
        int score=0;

        System.out.println("Welcome to the Number Guessing Game!");

        while (playAgain){
            int numberToGuess=random.nextInt(100)+1;
            int attempts=0;
            boolean guessedCorrectly=false;
            final int maxAttempts=5;
            System.out.println("\n I'm thinking of a number between 1 and 100.Can you guess it?");
            while(attempts<maxAttempts&&!guessedCorrectly){
                System.out.print("Enter Your guess (Attemp"+(attempts+1)+"/"+maxAttempts+"):");
                int userGuess=sc.nextInt();
                attempts++;

                if(userGuess==numberToGuess){
                    System.out.println("Congratulations ! You guessed the correct number,which was "+numberToGuess+".");
                    guessedCorrectly=true;
                    score++;
                }
                else if(userGuess<numberToGuess){
                    System.out.println("Too low! Try a higher number.");

                }
                else{
                    System.out.println("Too high! Try a lower number.");
                }
            }
            if(!guessedCorrectly){
                System.out.println("Sorry,you've used all your attempts. The number was"+numberToGuess+".") ;
            }
            System.out.print("Do you want to play again? (yes/no):");
            String playChoice=sc.next().toLowerCase();
            if(!playChoice.equals("yes")){
                playAgain=false;
                System.out.println("Thanks for playing! Your total score is : "+score);
            }

        } 
            
        
    }
}