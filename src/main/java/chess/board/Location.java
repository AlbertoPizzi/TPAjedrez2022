package chess.board;

public class Location {
    private int column;
    private int line;

    public Location(int column, int line) {
        this.column = column;
        this.line = line;
    }

    public int getColumn() {
        return column;
    }

    public int getLine() {
        return line;
    }
}
