package chess.movementTest;

import chess.board.Board;
import chess.board.Location;
import chess.movement.concreteMovementValidator.EatMovement;
import chess.movement.concreteMovementValidator.HorizontalMovement;
import chess.movement.concreteMovementValidator.VerticalMovement;
import chess.piece.ChessPiece;
import chess.piece.PieceColor;
import chess.piece.PieceType;
import org.junit.jupiter.api.Test;


import static org.junit.Assert.*;


class ConcreteMovementTest extends MovementTest{


    //VERTICAL MOVEMENT
    @Test
    public void test001_MoveVertically(){
    board.getBoard().put(init, randomPiece);
    assertTrue(board.getBoard().containsKey(init));
    verticalMovement.moveVertically(init, goal, board);
    assertTrue(board.getBoard().containsKey(goal));
    assertEquals(board.getBoard().get(goal), randomPiece);
    }
    @Test
    public void test002_MoveVerticallyAddingNewLocation(){
        board.getBoard().put(init, randomPiece);
        assertTrue(board.getBoard().containsKey(init));
        verticalMovement.moveVertically(init, goal, board);
        assertTrue(board.getBoard().containsKey(goal));
        assertEquals(randomPiece, board.getBoard().get(goal));
    }
    //EATING MOVEMENT
    @Test
    public void test003_EatingMovement(){
        board.getBoard().put(init , randomPiece);
        board.getBoard().put(goal , randomPiece3);
        eatMovement.eatMovement(init , goal, board);
        assertTrue(board.getBoard().get(goal) == null);
    }
    @Test
    public void test003_EatingMovementToSameColorPieceThrowsException(){
        board.getBoard().put(init , randomPiece);
        board.getBoard().put(goal , randomPiece2);
        assertThrows(RuntimeException.class, () -> eatMovement.eatMovement(init , goal, board));
    }
    //HORIZONTAL MOVEMENT
    @Test
    public void test004_HorizontalMovement(){
        board.getBoard().put(init , randomPiece);
        horizontalMovement.moveHorizontally(init , goal2 , board);
        assertTrue(board.getBoard().containsKey(goal2));
        assertEquals(randomPiece ,board.getBoard().get(goal2));
        assertFalse(board.getBoard().containsKey(init));
    }
}