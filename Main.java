package homework;

import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//Make a guessing game


//Receive the user’s name
        Scanner scanner = new Scanner(System.in);
        Scanner game = new Scanner(System.in);
        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter your Name: ");
       String name = scanner.nextLine();

    while(Objects.equals(name, "")){
        System.out.println("Enter your Name: ");
         name = scanner.nextLine();
    }
//say greetings to the user

        System.out.println("Hello, Welcome "+name);
// ask the user to start the game

        System.out.println("Let the games begin, Press 1 to start: ");
        int football = game.nextInt();

        while(football != 1){
            System.out.println("Use your head press 1 please!!! ");
             football = game.nextInt();
        }



//make a random number and save it limit 20
        Random random = new Random();

       int randomNumber= random.nextInt(20)+1;



//ask the user to guess a number between 1 and 20

        System.out.println("Guess a number between 1 and 20.");
        int guessedNumber; //= userInput.nextInt();



        boolean win = false;
        int numberOfTries = 0;
        boolean gameOver = false;

        while(!gameOver){
            if( numberOfTries>=5){
                gameOver=true;
            }else {
                numberOfTries++;
                System.out.println("please try again: ");
                guessedNumber = userInput.nextInt();

                //if input is greater than x, tell the user to guess smaller
                if(guessedNumber==randomNumber){
                    win= true;
                    gameOver=true;


                    //if input is smaller than x, tell the user to guess higher
                }else if(guessedNumber<randomNumber){
                    System.out.println("Guess Higher");

                    //if input is larger than x, tell the user to guess lower
                }else {
                    System.out.println("Guess Lower");

                }

            }

        }


        if(win){
            System.out.println("Congratulations "+name+ " you have WON!!! the game "+numberOfTries+" trial");

        }else {
            System.out.println("it was nice knowing you!!!");
        }
        System.out.println("The random number was "+randomNumber);





// while (guessedNumber!=randomNumber) {
//
//     if (guessedNumber > randomNumber) {
//         System.out.println("guess smaller");
//
//
//     } else {
//         System.out.println("guess higher");
//
//     }
//
//
//         //if the input is equal to x, congratulate the user for his or her winning
//     break;
// }
//        System.out.println("Congratulation "+name+" you WON!!!");



//make a rule that the user be able to guess up to 5 times
// if its 5 or more time  then prompt the user with a game over message

    }
}