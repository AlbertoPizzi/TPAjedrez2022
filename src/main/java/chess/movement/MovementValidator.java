package chess.movement;

import chess.board.Location;

public interface MovementValidator {

    public boolean isMovementValid(Location init , Location end);
}
