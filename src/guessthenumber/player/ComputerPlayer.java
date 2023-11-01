package guessthenumber.player;

import java.util.Random;

public class ComputerPlayer extends Player {

    public ComputerPlayer(String name) {
        super(name);
    }

    private static final Random random = new Random();

    @Override
    public int makeGuess() {
        System.out.printf("--- Round: %s ---%n", this.getName());
        System.out.printf("%s, enter your guess: ", this.getName());

        int guess = random.nextInt(100) + 1;
        System.out.printf("%s%n", guess);

        this.getGuesses().add(guess);

        return guess;
    }

//    private int generateRandomNumber(){
//        return
//    }
}
