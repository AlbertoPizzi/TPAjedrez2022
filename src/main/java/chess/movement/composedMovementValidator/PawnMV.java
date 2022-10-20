package chess.movement.composedMovementValidator;

import chess.board.Board;
import chess.board.Location;
import chess.movement.MovementValidator;
import chess.movement.concreteMovementValidator.DiagonalMovement;
import chess.movement.concreteMovementValidator.EatMovement;
import chess.movement.concreteMovementValidator.VerticalMovement;

public class PawnMV implements MovementValidator {

    public VerticalMovement verticalMovement = new VerticalMovement();
    public EatMovement eat = new EatMovement();
    public DiagonalMovement diagonalMovement = new DiagonalMovement();
    public boolean isFirstMove = true;

    @Override
    public boolean isMovementValid(Location init, Location goal, Board board) {
        Location aux1 = new Location(goal.getColumn() , goal.getLine() + 1);
        Location aux2 = new Location(goal.getColumn() , goal.getLine() + 2);
        Location aux3 = new Location(goal.getColumn() + 1 , goal.getLine() + 1 );
        Location aux4 = new Location(goal.getColumn() - 1 , goal.getLine() - 1 );
        if(isFirstMove && !board.getBoard().containsKey(aux1) || !board.getBoard().containsKey(aux2)){
            return true;
        }
        else if(!isFirstMove && !board.getBoard().containsKey(aux1)) return true;
        else if(board.getBoard().containsKey(aux3) && !board.getBoard().get(aux3).getPieceColor().equals(board.getBoard().get(init).getPieceColor())
        || !board.getBoard().get(aux4).getPieceColor().equals(board.getBoard().get(init).getPieceColor())) return true;
        else return false;
    }

    public void pawnMovement(Location init , Location goal, Board board){
        Location aux3 = new Location(goal.getColumn() + 1 , goal.getLine() + 1 );
        Location aux4 = new Location(goal.getColumn() - 1 , goal.getLine() - 1 );
        if(!isMovementValid(init, goal, board)) throw new RuntimeException("Pawn can not move there!");
        else if (goal.equals(aux3) || goal.equals(aux4)
                && aux4.getColumn() <= board.getBoardLimitX()
                && aux4.getLine() <= board.getBoardLimitY()
                && aux3.getColumn() <= board.getBoardLimitX()
                && aux3.getLine() <= board.getBoardLimitY()) {
           eat.eatMovement(init , goal , board);
           diagonalMovement.moveDiagonally(init, goal , board);
        }
        else {verticalMovement.moveVertically(init, goal , board);}
        isFirstMove = false;
    }

}
