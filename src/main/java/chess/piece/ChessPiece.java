package chess.piece;

public class ChessPiece {

   private PieceType pieceType;
   private PieceColor pieceColor;
   private String piece_ID;

    public ChessPiece(PieceColor color, PieceType type , String piece_ID){
        this.pieceColor = color;
        this.pieceType = type;
        this.piece_ID = piece_ID;
    }

    public PieceType getPieceType() {
        return pieceType;
    }

    public PieceColor getPieceColor() {
        return pieceColor;
    }

}
