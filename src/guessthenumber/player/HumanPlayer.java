package guessthenumber.player;

import java.util.Scanner;

public class HumanPlayer extends Player {

    public HumanPlayer(String name) {
        super(name);
    }

    @Override
    public int makeGuess() {
        System.out.printf("--- Round: %s ---%n", this.getName());
        System.out.printf("%s, enter your guess: ", this.getName());

        Scanner scanner = new Scanner(System.in);

        int guess = scanner.nextInt();
        this.getGuesses().add(guess);

        return guess;
    }
}
