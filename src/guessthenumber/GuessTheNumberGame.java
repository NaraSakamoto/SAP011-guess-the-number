package guessthenumber;

import guessthenumber.player.ComputerPlayer;
import guessthenumber.player.HumanPlayer;
import guessthenumber.player.Player;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class GuessTheNumberGame {

    private Random random;
    private int targetNumber;

    public GuessTheNumberGame(Random random) {
        this.random = random;
        this.targetNumber = random.nextInt(100) + 1;
    }

    public static void main(String[] args) {
        GuessTheNumberGame game = new GuessTheNumberGame(new Random());

        ArrayList<Player> players = new ArrayList<>();
        players.add(new ComputerPlayer("Computer"));
        players.add(new HumanPlayer("Naroka"));

        int attempts = 1;
        String result = "";
        Player player;
        while(true){
            player = players.get(attempts % 2);
            result = game.checkGuess(player);

            if(result.equalsIgnoreCase("Congratulations!")) {
                System.out.printf("Congratulations %s, you won!!%n", player.getName());
                System.out.printf("Attemps: %d%n", attempts);
                System.out.printf("Guesses: %s%n", player.getGuesses());
                break;
            } else {
                System.out.printf("%s%n", result);
            }

            attempts++;
        }
    }

    public String checkGuess(Player player) {
        int guess = player.makeGuess();

        if(guess > targetNumber){
            return "Too high!";
        } else if(guess < targetNumber){
            return "Too low!";
        } else {
            return "Congratulations!";
        }
    }
}
