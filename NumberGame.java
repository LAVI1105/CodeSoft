import java.util.Random;
import java.util.Scanner;
public class NumberGame {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
Random random = new Random();
int lowerBound = 1;
int upperBound = 100;
int numberToGuess = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
int attempts = 0;
System.out.println("Welcome to the Number Game!");
System.out.println("I have selected a random number between " + lowerBound + " and " + 
upperBound + ". Try to guess it.");
while (true) {
System.out.print("Enter your guess: ");
int playerGuess = scanner.nextInt();
attempts++;
if (playerGuess < lowerBound || playerGuess > upperBound) {
System.out.println("Please guess a number between " + lowerBound + " and " + upperBound + ".");
} else if (playerGuess < numberToGuess) {
System.out.println("Too low! Try again.");
} else if (playerGuess > numberToGuess) {
System.out.println("Too high! Try again.");
} else {
System.out.println("Congratulations! You guessed the number " + numberToGuess + " in " + attempts 
+ " attempts.");
break;
}
}
scanner.close();
}
}
