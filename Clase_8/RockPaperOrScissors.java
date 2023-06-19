package Clase_8;

import java.util.*;

public class RockPaperOrScissors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose rock, paper, scissors");
        String select = sc.nextLine().toLowerCase();
        System.out.println(choiceComputer(select));
    }

    public static String choiceComputer(String user) {
        String[] options = {"rock", "paper", "scissors"};
        String select = options[new Random().nextInt(options.length)];
        System.out.println("Computer select " + select);
        return determineWinner(user, select, options);

    }

    public static String determineWinner(String user, String computer, String[] options) {
        return user.equals(computer) ? "It's a tie!" :
                Arrays.stream(options)
                        .filter(pc -> (user.equals("rock") && pc.equals("scissors")) ||
                                (user.equals("paper") && pc.equals("rock")) ||
                                (user.equals("scissors") && pc.equals("paper")))
                        .findFirst()
                        .map(send -> "You win!")
                        .orElse("You lose!");
    }
}
