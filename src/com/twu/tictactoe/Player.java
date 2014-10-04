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
        promptPlayerOne();
        board.redrawBoard(parseInput(), 1);
        promptPlayerTwo();
        board.redrawBoard(parseInput(), 2);
    }

    public void promptPlayerOne() {
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

    public void promptPlayerTwo() {
        printStream.println("Player Two please enter a location between 1 and 9");
    }
}
