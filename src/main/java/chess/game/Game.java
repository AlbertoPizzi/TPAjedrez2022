package chess.game;

import chess.board.Board;
import chess.player.Player;
import chess.rules.GameRules;

public class Game {

    public Player player1;
    public Player player2;
    public Board board;
    public GameRules gameRules;

    public void Game(Player player1, Player player2 , GameRules gameRules){
        this.player1 = player1;
        this.player2 = player2;
        this.gameRules = gameRules;
        this.board = gameRules.getBoard();
    }

}
