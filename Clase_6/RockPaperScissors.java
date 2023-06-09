package Clase_6;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please choose rock , paper or scissors.");
        String choiceUser = sc.next().toLowerCase();
        String[] options = {"rock", "paper", "scissors"};
        String choiceCom = options[new Random().nextInt(options.length)];
        System.out.println("The computer chooses: " + choiceCom);

        if (choiceUser.equals(choiceCom)) {
            System.out.println("IT'S A TIE!");
        } else if ((choiceUser.equals("rock") && choiceCom.equals("scissors")) ||
                (choiceUser.equals("paper") && choiceCom.equals("rock")) ||
                (choiceUser.equals("scissors") && choiceCom.equals("paper"))) {
            System.out.println("YOU WIN!");
        } else {
            System.out.println("COMPUTER WINS!");
        }
    }
}

