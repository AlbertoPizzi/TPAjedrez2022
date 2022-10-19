package chess.movement.concreteMovementValidator;

import chess.board.Board;
import chess.board.Location;
import chess.movement.MovementValidator;
import chess.piece.ChessPiece;

public class VerticalMovement implements MovementValidator {


    @Override
    public boolean isMovementValid(Location init, Location goal) {
        if(!board.getBoard().containsKey(goal) && init.getColumn() == goal.getColumn()) {
            return true;
        } else if (board.getBoard().get(goal).getPieceColor().equals(board.getBoard().get(init).getPieceColor())) {
            return false;
        }
        else return false;
    }

    public void moveVertically(Location init , Location goal){
        ChessPiece piece = board.getBoard().get(init);
        if(!isMovementValid(init, goal)) throw new RuntimeException("Movement not valid");
        board.getBoard().put(goal, piece);
        board.getBoard().remove(init);
    }
}
