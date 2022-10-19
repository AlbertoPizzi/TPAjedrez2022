package chess.movementTest;

import chess.board.Board;
import chess.board.Location;
import chess.movement.concreteMovementValidator.EatMovement;
import chess.movement.concreteMovementValidator.VerticalMovement;
import chess.piece.ChessPiece;
import chess.piece.PieceColor;
import chess.piece.PieceType;
import org.junit.jupiter.api.Test;

import static chess.movement.MovementValidator.board;
import static org.junit.Assert.*;


class ConcreteMovementTest {

    VerticalMovement verticalMovement = new VerticalMovement();
    EatMovement eatMovement = new EatMovement();

    public ChessPiece randomPiece = new ChessPiece(PieceColor.WHITE , PieceType.KING , "randomChessPiece" );
    public ChessPiece randomPiece2 = new ChessPiece(PieceColor.WHITE , PieceType.KING , "randomChessPiece2" );
    public ChessPiece randomPiece3 = new ChessPiece(PieceColor.BLACK , PieceType.KING , "randomChessPiece3" );
    public Location init = new Location(1 , 1);
    public Location goal = new Location(1 , 3);


    @Test
    public void test001_MoveVertically(){
    board.getBoard().put(init, randomPiece);
    assertTrue(board.getBoard().containsKey(init));
    verticalMovement.moveVertically(init, goal);
    assertTrue(board.getBoard().containsKey(goal));
    assertEquals(board.getBoard().get(goal), randomPiece);
    }
    @Test
    public void test002_MoveVerticallyAddingNewLocation(){
        board.getBoard().put(init, randomPiece);
        assertTrue(board.getBoard().containsKey(init));
        verticalMovement.moveVertically(init, goal);
        assertTrue(board.getBoard().containsKey(goal));
        assertEquals(randomPiece, board.getBoard().get(goal));
    }

    @Test
    public void test003_EatingMovement(){
        board.getBoard().put(init , randomPiece);
        board.getBoard().put(goal , randomPiece3);
        eatMovement.eatMovement(init , goal);
        assertTrue(board.getBoard().get(goal) == null);
    }
    @Test
    public void test003_EatingMovementToSameColorPieceThrowsException(){
        board.getBoard().put(init , randomPiece);
        board.getBoard().put(goal , randomPiece2);
        assertThrows(RuntimeException.class, () -> eatMovement.eatMovement(init , goal));
    }
}