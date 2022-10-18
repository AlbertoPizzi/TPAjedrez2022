package chess.movement.composedMovementValidator;

import chess.board.Location;

public class KingMV extends ComposedMovement{
    @Override
    public boolean isMovementValid(Location init, Location goal) {
        return false;
    }
}
