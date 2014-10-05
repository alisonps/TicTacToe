package com.twu.tictactoe;

import sun.awt.Symbol;

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
    private String symbol;
    private Integer playerNumber;

    public Player(PrintStream printStream, BufferedReader bufferedReader, Board board, String symbol, int playerNumber) {
        this.printStream = printStream;
        this.bufferedReader = bufferedReader;
        this.board = board;
        this.symbol = symbol;
        this.playerNumber = playerNumber;
    }

    public void markBoard(){
        promptPlayer();
        board.addMark(parseInput(), symbol);
        board.drawBoard();
    }

    public void promptPlayer() {
        printStream.println("Player " + playerNumber + " please enter a location between 1 and 9");
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
