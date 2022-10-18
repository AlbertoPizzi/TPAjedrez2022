package java.chess.movementTest;

import chess.board.Board;
import chess.board.Location;
import chess.movement.concreteMovementValidator.ConcreteMovement;
import chess.movement.concreteMovementValidator.VerticalMovement;
import chess.piece.ChessPiece;
import chess.piece.PieceColor;
import chess.piece.PieceType;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


class ConcreteMovementTest {
    ConcreteMovement concreteMovement;
    VerticalMovement verticalMovement = new VerticalMovement();
    public Board board = new Board();
    public ChessPiece randomPiece = new ChessPiece(PieceColor.WHITE , PieceType.KING);
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
}