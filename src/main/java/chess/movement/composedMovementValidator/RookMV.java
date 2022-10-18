package chess.movement.composedMovementValidator;

import chess.board.Location;

public class RookMV extends ComposedMovement{
    @Override
    public boolean isMovementValid(Location init, Location goal) {
        return false;
    }
}
