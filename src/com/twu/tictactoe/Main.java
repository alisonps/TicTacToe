package com.twu.tictactoe;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;

/**
 * Created by alisonpolton-simon on 10/1/14.
 */
public class Main {

    public static void main(String[] args) {
        PrintStream printStream = new PrintStream(System.out);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        Board board = new Board(printStream);
        Player player1 = new Player(printStream, bufferedReader, board, " X ", 1);
        Player player2 = new Player(printStream, bufferedReader, board, " O ", 2);
        TicTacToeGame game = new TicTacToeGame(board, player1, player2);

        game.startGame();

    }
}
