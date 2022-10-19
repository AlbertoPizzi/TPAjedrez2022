package chess.movement.composedMovementValidator;

import chess.board.Board;
import chess.board.Location;
import chess.movement.MovementValidator;
import chess.movement.concreteMovementValidator.EatMovement;
import chess.movement.concreteMovementValidator.VerticalMovement;

public class PawnMV implements MovementValidator {

    public VerticalMovement verticalMovement = new VerticalMovement();
    public EatMovement eat = new EatMovement();
    public boolean isFirstMove = true;

    @Override
    public boolean isMovementValid(Location init, Location goal, Board board) {
        return false;
    }

    public void pawnMovement(){

    }

}
