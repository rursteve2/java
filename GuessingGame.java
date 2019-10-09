package GuessingGame;

import java.util.Random; //This is to in
import java.util.Scanner;

public class GuessingGame {
    
public static void main(Int[] args){

Scanner typednumber = new Scanner (System.in);
Random actualnumber = new Random();

String keyboard;
int number = actualnumber.nextInt(100) + 1;

System.out.println("I'm thinking of a number between 1 and 100! \n Can you guess what it is?");

keyboard = typednumber.nextLine(); 

System.out.println("The number I guessed was: " + number);

// System.out.println(typednumber);

// System.out.println("You were off by ");
} 
}