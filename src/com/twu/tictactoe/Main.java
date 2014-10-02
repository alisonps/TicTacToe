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
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));;


        Board board = new Board(printStream);
        //TODO remove from main
        board.drawBlankBoard();

        Player player = new Player(printStream, bufferedReader, board);
        player.markBoard();

    }
}
