package chess.piece;

public class ChessPiece {

    PieceType pieceType;
    PieceColor pieceColor;

    public ChessPiece(PieceColor color, PieceType type){
        this.pieceColor = color;
        this.pieceType = type;
    }

    public PieceType getPieceType() {
        return pieceType;
    }

    public void setPieceType(PieceType pieceType) {
        this.pieceType = pieceType;
    }

    public PieceColor getPieceColor() {
        return pieceColor;
    }

    public void setPieceColor(PieceColor pieceColor) {
        this.pieceColor = pieceColor;
    }
}
