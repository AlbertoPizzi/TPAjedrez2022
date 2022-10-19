package chess.board;

import chess.piece.ChessPiece;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Board {

    public Map<Location , ChessPiece> board;
    int boardLimitX;
    int boardLimitY;
    public Board(int columnLimit, int lineLimit){
        board = new HashMap<>();
        this.boardLimitX = columnLimit;
        this.boardLimitY = lineLimit;
    }

    public Map<Location, ChessPiece> getBoard() {
        return board;
    }

    public void setBoard(Location nlocation) {
        this.board.put(nlocation, null);
    }
    public List<ChessPiece> getPieces(){
        return (List<ChessPiece>) board.values();
    }
    public int getBoardLimitX() {
        return boardLimitX;
    }

    public int getBoardLimitY() {
        return boardLimitY;
    }
}
