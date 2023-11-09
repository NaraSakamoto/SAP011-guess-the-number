package guessthenumber;

import guessthenumber.player.ComputerPlayer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;


import java.util.Random;


public class GuessTheNumberGameTest {

    @Test
    @DisplayName("Deve retornar Too High porque o palpite da jogadora é mais alto que o alvo")
    void shouldReturnTooHigh() {
        Random targetNumber = Mockito.mock(Random.class);
        Mockito.when(targetNumber.nextInt(100)).thenReturn(20);
        GuessTheNumberGame game = new GuessTheNumberGame(targetNumber);

        ComputerPlayer computerPlayer = new ComputerPlayer("Computer");
        Random computerGuess = Mockito.mock(Random.class);
        Mockito.when(computerGuess.nextInt(100)).thenReturn(50);
        computerPlayer.setRandom(computerGuess);

        String result = game.checkGuess(computerPlayer);

        Assertions.assertEquals("Too high!", result);
    }
}
