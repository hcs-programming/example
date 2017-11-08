/******************************************************************************
 CLASS INFORMATION                                    * Score: ______________ *
 -----------------                                    *************************
   Programmer: Your name
   Date Due:   MM/DD/2017
 ******************************************************************************/

import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        String tryAgain;
        String userChoice;
        String computerChoice;
        
        printInstructions();
        
        // Keep playing the game as many times as the user wants
        do
        {
            userChoice = getUsersChoice();
            computerChoice = getComputersChoice();
            
            System.out.printf("%s vs. %s\n", userChoice, computerChoice);
            System.out.printf("Outcome: %s\n\n", getOutcome(userChoice, computerChoice));            
            
            System.out.print("Do you want to play again? (Yes/No): ");
            tryAgain = keyboard.next();
        } while (tryAgain.equals("Yes"));
    }
    
    
    // Prints the instructions for the program
    static void printInstructions()
    {
        
    }
    
    // Forces the user to pick either Rock, Paper, or Scissors
    static String getUsersChoice()
    {
        
    }
    
    // Picks either Rock, Paper, or Scissors for the computer
    static String getComputersChoice()
    {
        
    }
    
    // Figures out if the user won, lost, or tied a round of rock/paper/scissors
    static String getOutcome(String user, String computer)
    {
       
    }
}