package chess.movement.concreteMovementValidator;

import chess.board.Board;
import chess.board.Location;
import chess.movement.MovementValidator;

public  class ConcreteMovement implements MovementValidator {

    Board board;

    public ConcreteMovement() {
        this.board = new Board();
    }

    @Override
    public boolean isMovementValid(Location init, Location goal) {
        return false;
    }
}
