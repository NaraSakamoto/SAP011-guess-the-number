package guessthenumber.player;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ComputerPlayerTest {

    ComputerPlayer computerPlayer = new ComputerPlayer("Computer");

    @Test
    @DisplayName("Should return a guess number sorted by Random")
    public void shouldReturnAGuess(){
        int guess = computerPlayer.makeGuess();
        assertEquals(50, guess);
    }
}