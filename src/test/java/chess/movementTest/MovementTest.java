package chess.movementTest;

import chess.board.Board;
import chess.board.Location;
import chess.movement.PieceMovementValidator;
import chess.movement.composedMovementValidator.PawnMV;
import chess.movement.concreteMovementValidator.EatMovement;
import chess.movement.concreteMovementValidator.HorizontalMovement;
import chess.movement.concreteMovementValidator.VerticalMovement;
import chess.piece.ChessPiece;
import chess.piece.PieceColor;
import chess.piece.PieceType;

public class MovementTest {
    VerticalMovement verticalMovement = new VerticalMovement();
    EatMovement eatMovement = new EatMovement();
    HorizontalMovement horizontalMovement = new HorizontalMovement();

    PieceMovementValidator pieceMovementValidator = new PieceMovementValidator();
    PawnMV pawnMV = new PawnMV();

    public ChessPiece randomPiece = new ChessPiece(PieceColor.WHITE , PieceType.PAWN , "randomChessPiece" );
    public ChessPiece randomPiece2 = new ChessPiece(PieceColor.WHITE , PieceType.KING , "randomChessPiece2" );
    public ChessPiece randomPiece3 = new ChessPiece(PieceColor.BLACK , PieceType.KING , "randomChessPiece3" );
    public Location init = new Location(1 , 1);
    public Location goal = new Location(1 , 3);
    public Location goal2 = new Location(2 , 1);
    public Location goal3 = new Location(1 , 5);
    public Board board = new Board(8 , 8 );
    public Board board2 = new Board(8 , 8 );


}
