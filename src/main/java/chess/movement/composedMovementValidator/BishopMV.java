package chess.movement.composedMovementValidator;

import chess.board.Board;
import chess.board.Location;
import chess.movement.MovementValidator;

public class BishopMV implements MovementValidator {
    @Override
    public boolean isMovementValid(Location init, Location goal , Board board) {
        return false;
    }
}
