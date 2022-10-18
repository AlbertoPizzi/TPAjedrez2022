package chess.movement.concreteMovementValidator;

import chess.board.Location;

public class HorizontalMovement extends ConcreteMovement{

    @Override
    public boolean isMovementValid(Location init, Location goal) {
        if(!board.getBoard().containsKey(goal) && init.getLine() == goal.getLine()) {
            return true;
        } else if (board.getBoard().get(goal).getPieceColor().equals(board.getBoard().get(init).getPieceColor())) {
            return false;
        }
        else return false;
    }
    public void moveHorizontally(Location init, Location goal){
        if(!isMovementValid(init , goal)) throw new RuntimeException("Not a valid movement!");
        board.getBoard().put(goal , board.getBoard().get(init));
        board.getBoard().remove(init);
    }
}