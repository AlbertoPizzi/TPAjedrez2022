package chess.movementTest;

import chess.board.Board;
import chess.board.Location;
import chess.movement.composedMovementValidator.PawnMV;
import chess.movement.concreteMovementValidator.EatMovement;
import chess.movement.concreteMovementValidator.HorizontalMovement;
import chess.movement.concreteMovementValidator.VerticalMovement;
import chess.piece.ChessPiece;
import chess.piece.PieceColor;
import chess.piece.PieceType;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;

public class ComposedMovementTest extends MovementTest {

    //Pawn Movements

    @Test
    public void test001_PawnFirstMovementVertically(){
        pieceMovementValidator.addMovement(PieceType.PAWN , pawnMV);
        assertTrue(pieceMovementValidator.getPieceMovementV().containsKey(PieceType.PAWN));
        board.getBoard().put(init , randomPiece);
        pawnMV.pawnMovement(init, goal , board);
        assertEquals(randomPiece , board.getBoard().get(goal));
        assertFalse(pawnMV.isFirstMove);
    }
    @Test
    public void test002_PawnFirstMovementVerticallyTwiceShouldThrowException(){
        pieceMovementValidator.addMovement(PieceType.PAWN , pawnMV);
        assertTrue(pieceMovementValidator.getPieceMovementV().containsKey(PieceType.PAWN));
        board.getBoard().put(init , randomPiece);
        pawnMV.pawnMovement(init, goal , board);
        assertEquals(randomPiece , board.getBoard().get(goal));
//        assertThrows(RuntimeException.class, () -> pawnMV.pawnMovement(goal , goal3, board));
        pawnMV.pawnMovement(goal, goal3 , board);
        assertEquals(randomPiece , board.getBoard().get(goal3));
//TODO: check with Tomas.
    }
}
