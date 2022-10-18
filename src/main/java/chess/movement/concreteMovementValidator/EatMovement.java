package chess.movement.concreteMovementValidator;

import chess.board.Location;

public class EatMovement extends ConcreteMovement{
    @Override
    public boolean isMovementValid(Location init, Location goal) {
        if(!board.getBoard().containsKey(goal) ||
                board.getBoard().get(init).getPieceColor().equals(board.getBoard().get(goal).getPieceColor())) return false;
        return true;
    }
    public void eatMovement(Location init, Location goal){
        if (!isMovementValid(init, goal)) throw new RuntimeException("Piece can not be eaten!");
        board.getBoard().remove(goal);
    }
}