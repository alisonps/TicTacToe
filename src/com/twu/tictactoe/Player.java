package com.twu.tictactoe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;

/**
 * Created by alisonpolton-simon on 10/1/14.
 */
public class Player {

    private PrintStream printStream;
    private BufferedReader bufferedReader;
    private Board board;

    public Player(PrintStream printStream, BufferedReader bufferedReader, Board board) {
        this.printStream = printStream;
        this.bufferedReader = bufferedReader;
        this.board = board;
    }

    public void markBoard(){
        promptPlayer();
        board.redrawBoard(parseInput());
    }

    public void promptPlayer() {
        printStream.println("Player One please enter a location between 1 and 9");
    }

    public int parseInput() {
        String readLine = null;
        try {
            readLine = bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Integer input = Integer.parseInt(readLine);
        return input;
    }
}
