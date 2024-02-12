package snakesandladders;

import java.util.List;

public class Board {
    private final List<Ladder> ladders;
    private final List<Snake> snakes;
    private int currentPosition;
    private final int INIIAL_POSITION = 0;
    public static final int BOARD_SIZE = 100;

    public Board(List<Ladder> ladders, List<Snake> snakes) {
        this.currentPosition = INIIAL_POSITION;
        this.ladders = ladders;
        this.snakes = snakes;
    }

    public int movePiece(int diceValue) {
        if(currentPosition + diceValue <= BOARD_SIZE)
            currentPosition = currentPosition + diceValue;

        currentPosition = getNewPositionIfLaddderPresent();

        currentPosition = getNewPostionIfSnakeIsPresent();

        return currentPosition;
    }

    private int getNewPostionIfSnakeIsPresent() {
        snakes.forEach(snake -> {
            if(snake.getHead() == currentPosition) {
                currentPosition = snake.getTail();
            }
        });

        return currentPosition;
    }

    private int getNewPositionIfLaddderPresent() {
        ladders.forEach(ladder -> {
            if(ladder.getFoot() == currentPosition) {
                currentPosition = ladder.getTop();
            }
        });
        return currentPosition;
    }

    public void setCurrentPosition(int position) {
        currentPosition = position;
    }
}
