import java.util.Random;
import java.util.Scanner;

public class guessNumber {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    Random random = new Random();

    int attempts = 7;
    boolean won = false;

    System.out.println("=====Welcome to the Guessing Game!=====");
    
    while (true) { 
        

    System.out.println("ENter your guess between 1 to 100: ");
    int userGuess = scanner.nextInt();

    int randomGuess = random.nextInt(100+1);

    if(userGuess == randomGuess){
      System.out.println("Congratulations! You guessed the number correctly.");
    } else if(userGuess <= randomGuess){
      System.out.println("Your guess is too low.");
    } else {
      System.out.println("Your guess is too high.");
    }    
   attempts--;
      if(attempts == 0){
        System.out.println("You have used all your attempts. The correct number was: " + randomGuess);
        break;
      } else {
        System.out.println("You have " + attempts + " attempts left.");
      }
  }
       

}
}