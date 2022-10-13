package chess.movement.concreteMovementValidator;

import chess.board.Location;

public class MoveForward extends ConcreteMovement{


    @Override
    public boolean isMovementValid(Location init, Location end) {
        return false;
    }
}
