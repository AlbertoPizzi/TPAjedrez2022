package chess.player;

public class Player {

    private String name;
    int nmbrOfMatches;
    int nmbrOfWins;
    boolean isFirst;

    public Player(String name, int nmbrOfMatches, int nmbrOfWins) {
        this.name = name;
        this.nmbrOfMatches = nmbrOfMatches;
        this.nmbrOfWins = nmbrOfWins;
    }

    public int getNmbrOfMatches() {
        return nmbrOfMatches;
    }

    public void setNmbrOfMatches(int nmbrOfMatches) {
        this.nmbrOfMatches = nmbrOfMatches;
    }

    public int getNmbrOfWins() {
        return nmbrOfWins;
    }

    public void setNmbrOfWins(int nmbrOfWins) {
        this.nmbrOfWins = nmbrOfWins;
    }

    public boolean isFirst() {
        return isFirst;
    }

    public void setFirst(boolean first) {
        isFirst = first;
    }
}
