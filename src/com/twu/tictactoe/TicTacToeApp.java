package com.twu.tictactoe;

import java.io.PrintStream;

/**
 * Created by alisonpolton-simon on 10/1/14.
 */
public class TicTacToeApp {

    public static void main(String[] args) {
        PrintStream printStream = new PrintStream(System.out);
        Board board = new Board(printStream);
        board.drawBlankBoard();
    }
}
