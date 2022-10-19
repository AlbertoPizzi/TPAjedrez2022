package chess.movement;

import chess.board.Board;
import chess.board.Location;

public interface MovementValidator {

     boolean isMovementValid(Location init , Location goal , Board board);
}
