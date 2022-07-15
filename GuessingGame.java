import java.util.*;
public class GuessingGame {
    public static void main(String args[]){
     boolean running = true;
     // creating a while loop, useful so this can start
    System.out.println("Welcome to the Number Guessing Game!");
        while (running = true) {
        int attempts = 3;
        Random rand = new Random();
        int answer = 1 + rand.nextInt(9);
    //https://www.javatpoint.com/how-to-generate-random-number-in-java
    //generate a number from 1-10
            while (attempts > 0) {
            Scanner guess = new Scanner(System.in);
            System.out.println("Please guess a number between 1 and 10");
            int Guess = guess.nextInt(); // collecting the guess of the user
                if (Guess == answer) {
                System.out.println("Yes, You got it!");
                System.out.println("Would you like to play again? (y/n)");
                Scanner continueprompt = new Scanner(System.in);
                String prompt= continueprompt.nextLine();
                if (prompt.equals("n")) {
                    System.exit(0);} // if the user answers n, the program will exit, but if not, it will continue because of the while loop
                } else {
                System.out.println("Nope that's not it");
                attempts -= 1; // decreases attempt count to make sure user can only guess three times
        }
    }
    if (attempts < 1) {
        System.out.println("The answer was " + answer); // reveal answer by printing it
        System.out.println("Would you like to play again? (y/n)");
        Scanner continueprompt = new Scanner(System.in);
        String prompt= continueprompt.nextLine();
         if (prompt.equals("n")) {
                 System.exit(0); // https://www.geeksforgeeks.org/system-exit-in-java/
                } // again, unless the user types n the program will repeat
                }
    }
    }
}

       
        
        
        