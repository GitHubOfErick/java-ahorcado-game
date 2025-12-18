import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //* Greetings */
        System.out.println("This is my game called Ahorcado in Spanish!");
        //* Instantiate Scanner class to read whatever the user inputs */
        Scanner scanner = new Scanner(System.in);
        scanner.toString().toLowerCase();
        //* Declaring variables */
        String secretWord = "youhavewon";
        int maxAttempts = 10;
        int attempts = 0;
        boolean wasItGuessed = false;
        int i;
        int j;
        //* Arrays: char class */
        char[] guessedLetters = new char[secretWord.length()];
        guessedLetters.toString().toLowerCase();
        //* Cycles: for */
        for (i = 0; i < guessedLetters.length; i++) {
            guessedLetters[i] = '_';  
        }
        //* Cycles: while */
        while (!wasItGuessed && attempts < maxAttempts) {
            System.out.println("Word to be guessed: " + String.valueOf(guessedLetters) + " " + secretWord.length() + " left.");
            System.out.println("Please, enter a letter: ");
            char letter = Character.toLowerCase(scanner.next().charAt(0));
            boolean letterFits = false;
            //* Cycles: for */
            for (j=0; j < secretWord.length(); j++) {
                //* Conditional structure: if-else */
                if (letter == secretWord.charAt(j)) {
                    guessedLetters[j] = letter;
                    letterFits = true;
                }
            }
            //* Conditional structure: if-else */
            if (!letterFits) {
                attempts++;
                System.out.println("Wrong letter! You have " + (maxAttempts - attempts) + " attempts left.");
            }
            if (String.valueOf(guessedLetters).equals(secretWord)) {
                wasItGuessed = true;
                System.out.println("Congratulations! You've guessed the word: " + secretWord);
            }
        }
        //* Conditional structure: if-else */
        if (!wasItGuessed) {
            System.out.println("Sorry, you've run out of attempts. Game Over");
        }
        //* Close the scanner class to avoid user enters more letters than required */
        scanner.close();
    }
}
