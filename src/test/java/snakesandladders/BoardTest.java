package snakesandladders;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BoardTest {
    @Test
    void shouldUpdateCurrentPositionWithDiceValue() {
        Board board = new Board(new ArrayList<>(), new ArrayList<>());
        int diceValue = 5;

        int newPosition = board.movePiece(diceValue);

        assertEquals(5, newPosition);
    }

    @Test
    void shouldNotUpdateCurrentPositionWithDiceValueIfCorsses100() {
        Board board = new Board(new ArrayList<>(), new ArrayList<>());
        board.setCurrentPosition(96);
        int diceValue = 5;

        int newPosition = board.movePiece(diceValue);

        assertEquals(96, newPosition);
    }

    @Test
    void shouldUpdateCurrentPositionWithTopValueWhenLadderIsPresent() {
        Ladder ladder = new Ladder(5, 22);
        Board board = new Board(Collections.singletonList(ladder), new ArrayList<>());
        int diceValue = 5;

        int newPosition = board.movePiece(diceValue);

        assertEquals(22, newPosition);
    }

    @Test
    void shouldUpdateCurrentPositionWithTailValueWhenSnakeIsPresent() {
        Snake snake = new Snake(22, 7);
        Board board = new Board(new ArrayList<>(), Collections.singletonList(snake));
        board.setCurrentPosition(17);
        int diceValue = 5;

        int newPosition = board.movePiece(diceValue);

        assertEquals(7, newPosition);
    }

    //TODO: NOT COMPLETED
    /*
    @Test
    void ShouldReturnValidLadderBasedUponBoardSize() {
        List ladders = Arrays.asList(
                LadderFactory.create(5, 22),
                LadderFactory.create(15, 42),
                LadderFactory.create(88, 101)
        );
        Board board = new Board(ladders, new ArrayList<>());

        int ladderCount = board.getLadders().size();

        assertEquals(2, ladderCount);
    }
    */
}
