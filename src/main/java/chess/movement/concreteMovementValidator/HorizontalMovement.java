package chess.movement.concreteMovementValidator;

import chess.board.Location;

public class HorizontalMovement extends ConcreteMovement{

    @Override
    public boolean isMovementValid(Location init, Location end) {
        return false;
    }
}
