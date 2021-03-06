package com.twu.tictactoe;

/**
 * Created by alisonpolton-simon on 10/4/14.
 */
public class TicTacToeGame {
    private Board board;
    private Player player1;
    private Player player2;

    public TicTacToeGame(Board board, Player player1, Player player2) {
        this.board = board;
        this.player1 = player1;
        this.player2 = player2;
    }

    public void startGame() {
        board.drawBoard();

        player1.markBoard();
        player2.markBoard();
    }
}
