package chess.movement;

import chess.board.Board;
import chess.board.Location;

public interface MovementValidator {

     Board board = new Board();
     boolean isMovementValid(Location init , Location goal);
}
