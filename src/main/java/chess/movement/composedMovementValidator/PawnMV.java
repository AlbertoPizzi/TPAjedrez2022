package chess.movement.composedMovementValidator;

import chess.board.Location;
import chess.movement.MovementValidator;
import chess.movement.concreteMovementValidator.EatMovement;
import chess.movement.concreteMovementValidator.VerticalMovement;

public class PawnMV  {

    public VerticalMovement verticalMovement = new VerticalMovement();
    public EatMovement eat = new EatMovement();
    public boolean isFirstMove = true;

    public void pawnMovement(){

    }
}
