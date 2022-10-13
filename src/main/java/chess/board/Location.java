package chess.board;

public class Location {
    private int column;
    private int line;

    public Location(int number, int line) {
        this.column = number;
        this.line = line;
    }

    public int getColumn() {
        return column;
    }

    public int getLine() {
        return line;
    }
}
