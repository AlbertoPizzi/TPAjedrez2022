package chess.movement;

import chess.piece.PieceType;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PieceMovementValidator {

    public Map<PieceType , MovementValidator> pieceMovementMap;

    public PieceMovementValidator(){
        pieceMovementMap = new HashMap<>();
    }

    public void addMovement(PieceType pieceType , MovementValidator movementValidator){
       if(!pieceMovementMap.containsKey(pieceType)){
           pieceMovementMap.put(pieceType , movementValidator);
       }
    }
    public Map<PieceType , MovementValidator> getPieceMovementV(){
        return this.pieceMovementMap;
    }
    public void swapMovement(PieceType pieceType , MovementValidator oldMove , MovementValidator newMove){
        if (!pieceMovementMap.containsKey(pieceType)) throw new RuntimeException("There's no piece of that type!");
        pieceMovementMap.replace(pieceType , oldMove , newMove);
    }
    public List<PieceType> pieceTypes(){
        return (List<PieceType>) pieceMovementMap.keySet();
    }
    public List<MovementValidator> movements(){
        return (List<MovementValidator>) pieceMovementMap.values();
    }

}
