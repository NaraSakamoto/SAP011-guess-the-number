package guessthenumber.player;

import java.util.ArrayList;
import java.util.List;

public abstract class Player {

    private String name;
    private final List<Integer> guesses = new ArrayList<>();

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Integer> getGuesses() {
        return guesses;
    }

    public abstract int makeGuess();
}
