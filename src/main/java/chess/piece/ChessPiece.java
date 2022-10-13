package chess.piece;

public class ChessPiece {

   private PieceType pieceType;
   private PieceColor pieceColor;

    public ChessPiece(PieceColor color, PieceType type){
        this.pieceColor = color;
        this.pieceType = type;
    }

    public PieceType getPieceType() {
        return pieceType;
    }

    public PieceColor getPieceColor() {
        return pieceColor;
    }

}
