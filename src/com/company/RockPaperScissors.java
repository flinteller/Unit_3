// Flint Eller
// 11/1/19
// This program simulates rock, paper scissors

package com.company;
import java.util.Scanner;

public class RockPaperScissors {

    public static String getUserChoice(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please choose either rock, paper, or scissors");
        String choice = scan.next();
        return choice.toLowerCase();
    }

    public static String computerChoice(){
        int random_num = (int)((Math.random() * 3) + 1);
        if(random_num == 1)
            return "rock";
        else if(random_num == 2)
            return "paper";
        else
            return "scissors";

    }

    public static String whoWins(String computer, String person){
        String who_wins;
        String player_wins = "You win!";
        String comp_wins = "The computer wins!";
        if(person.equals(computer))
            who_wins = "You tied!";
        else if(person.equals("rock") && computer.equals("paper"))
            who_wins = comp_wins;
        else if(person.equals("paper") && computer.equals("rock"))
            who_wins = player_wins;
        else if(person.equals("rock") && computer.equals("scissors"))
            who_wins = player_wins;
        else if(person.equals("scissors") && computer.equals("rock"))
            who_wins = comp_wins;
        else if(person.equals("scissors") && computer.equals("paper"))
            who_wins = player_wins;
        else if(person.equals("paper") && computer.equals("scissors"))
            who_wins = comp_wins;
        else
            who_wins = "program failed";
        return "You chose " + person + ".\nThe computer chose " + computer + ".\n" + who_wins;
    }

    public static void main(String[] args){
        String user_choice = getUserChoice();
        String comp_choice = computerChoice();
        System.out.println(whoWins(comp_choice, user_choice));

    }
}
