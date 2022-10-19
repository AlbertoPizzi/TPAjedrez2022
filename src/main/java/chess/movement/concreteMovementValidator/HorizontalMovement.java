package chess.movement.concreteMovementValidator;

import chess.board.Board;
import chess.board.Location;
import chess.movement.MovementValidator;
import chess.piece.ChessPiece;

public class HorizontalMovement implements MovementValidator {

    @Override
    public boolean isMovementValid(Location init, Location goal , Board board) {
        if(!board.getBoard().containsKey(goal) && init.getLine() == goal.getLine()
        && goal.getLine() <= board.getBoardLimitY()) {
            return true;
        } else if (board.getBoard().get(goal).getPieceColor().equals(board.getBoard().get(init).getPieceColor())) {
            return false;
        }
        else return false;
    }
    public void moveHorizontally(Location init, Location goal, Board board){
        ChessPiece piece = board.getBoard().get(init);
        if(!isMovementValid(init , goal, board)) throw new RuntimeException("Not a valid movement!");
        board.getBoard().put(goal , board.getBoard().get(init));
        board.getBoard().remove(init);
    }
}
