package chess.movement.composedMovementValidator;

import chess.board.Board;
import chess.board.Location;
import chess.movement.MovementValidator;
import chess.movement.concreteMovementValidator.EatMovement;
import chess.movement.concreteMovementValidator.HorizontalMovement;
import chess.movement.concreteMovementValidator.VerticalMovement;

public class RookMV implements MovementValidator {
    HorizontalMovement horizontalMovement = new HorizontalMovement();
    VerticalMovement verticalMovement = new VerticalMovement();
    EatMovement eatMovement = new EatMovement();
    @Override
    public boolean isMovementValid(Location init, Location goal , Board board) {
        if(init.getLine() != goal.getLine() || init.getColumn() != goal.getColumn()) return false;
//        for (int position = init.getColumn(); position < board.getBoardLimitX(); position) {
//
//        }
        return false;//TODO: ask about how to implement the "There's a piece in the middle"
    }
    public void rookMovement(Location init, Location goal, Board board){
        if(!isMovementValid(init , goal , board)) throw new RuntimeException("Rook can not move there!");
    }
    //wololo
}
