package snakesandladders;

public class Ladder {
    private final int foot;
    private final int top;

    public Ladder(int foot, int top) {
        this.foot = foot;
        this.top = top;
    }

    public int getFoot() {
        return foot;
    }

    public int getTop() {
        return top;
    }
}
