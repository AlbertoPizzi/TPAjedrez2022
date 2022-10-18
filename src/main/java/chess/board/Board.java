package chess.board;

import chess.piece.ChessPiece;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Board {
    public Map<Location , ChessPiece> board;
    public Board(){
        board = new HashMap<>();
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

    public void fillBoard(){

    }


}
