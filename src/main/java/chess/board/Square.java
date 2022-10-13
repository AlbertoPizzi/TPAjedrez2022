package chess.board;

public class Square {
    private int number;
    private Letter stack;

    public Square(int number, Letter stack) {
        this.number = number;
        this.stack = stack;
    }

    public int getNumber() {
        return number;
    }

    public Letter getStack() {
        return stack;
    }
}
