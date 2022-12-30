import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

  public static void main(String[] args) {
 
  Random rand = new Random();
  Scanner scanner = new Scanner(System.in);

  int randomNumber = rand.nextInt(100) + 1;

  System.out.println(randomNumber);
  int tryCount = 0;

  while(true) {
  System.out.println("Guess a number betweeen 0-100");

  int playerGuess = scanner.nextInt();
  tryCount++;

  if (playerGuess == randomNumber) {
    System.out.println("You did it!");
    System.out.println("It only took you " + tryCount + " tries!");
    break;
  }
  else if (playerGuess > randomNumber) {
    System.out.println("Too high bruh!");
  }
  else {
    System.out.println("Too low bruh!");
  }
}

scanner.close();

  }
}
