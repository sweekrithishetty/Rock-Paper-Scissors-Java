package com.company;
import java.util.Scanner;


public class CWH_Rockps {
    public static void main(String[] args) {
        //Get User Input
        System.out.println("Enter your Choice: Rock,Paper,Scissors");
        Scanner sc= new Scanner(System.in);
        String move = sc.nextLine();
        //Check if User input is valid
        if(!move.equals("Rock")&& !move.equals("Scissors")&& !move.equals("Paper")){
            System.out.println("Your move isn't valid!");
        }
        //Get a random number between 0-3 and convert it to an integer
        else{
            int rand = (int)(Math.random()*3);
            //Convert the random number to a string by using conditionals
            String computer ="";
            if(rand == 0) {
                computer = "Rock";
            } else if(rand == 1) {
                computer= "Paper";
            } else {
                computer = "Scissors";
            }
            //Print results accordingly
            System.out.println("Opponent move: " + computer);
            if(move.equals(computer)) {
                System.out.println("It's a tie!");
            } else if((move.equals("rock") && computer.equals("scissors")) || (move.equals("scissors") && computer.equals("paper")) || (move.equals("paper") && computer.equals("rock"))) {
                System.out.println("You won!");
            } else {
                System.out.println("You lost!");
            }

        }

    }
}
