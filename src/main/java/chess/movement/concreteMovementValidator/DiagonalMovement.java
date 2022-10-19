package chess.movement.concreteMovementValidator;

import chess.board.Location;
import chess.movement.MovementValidator;

public class DiagonalMovement implements MovementValidator {

    @Override
    public boolean isMovementValid(Location init, Location goal) {
        if(!board.getBoard().containsKey(goal) && init.getColumn() != goal.getColumn() && init.getLine() != goal.getLine()) {
            return true;
        } else if (board.getBoard().get(goal).getPieceColor().equals(board.getBoard().get(init).getPieceColor())) {
            return false;
        }
        else return false;
    }

    public void moveDiagonally(Location init, Location goal){
        if(!isMovementValid(init, goal)) throw new RuntimeException("Movement not valid");
        board.getBoard().put(goal, board.getBoard().get(init));
        board.getBoard().remove(init);
    }

}
