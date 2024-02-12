package snakesandladders;

import java.util.Optional;

public class LadderFactory {
        public static Optional<Ladder> create(int foot, int top) {
            if(foot <= Board.BOARD_SIZE && top <= Board.BOARD_SIZE)
                return Optional.of(new Ladder(foot, top));

            return Optional.empty();
        }
}
