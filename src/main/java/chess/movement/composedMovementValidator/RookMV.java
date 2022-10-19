package chess.movement.composedMovementValidator;

import chess.board.Location;
import chess.movement.MovementValidator;

public class RookMV implements MovementValidator {
    @Override
    public boolean isMovementValid(Location init, Location goal) {
        return false;
    }
}
