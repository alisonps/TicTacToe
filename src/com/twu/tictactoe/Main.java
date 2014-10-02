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
        //TODO move out of main
        board.drawBlankBoard();

        //TODO move out of main
        Player player = new Player(printStream, bufferedReader);
        player.promptPlayer();

        //TODO move out of main
        int input = player.parseInput();
        board.redrawBoard(input);

    }
}
