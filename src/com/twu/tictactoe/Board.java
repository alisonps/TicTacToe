package com.twu.tictactoe;

import java.io.PrintStream;
import java.util.ArrayList;

/**
 * Created by alisonpolton-simon on 10/1/14.
 */
public class Board {

    private PrintStream printStream;
    String boardState[] = new String[9];

    public Board(PrintStream printStream) {
        this.printStream = printStream;
        for(int i = 0; i < 9; i ++){
            boardState[i] = "   ";
        }
    }

    public void drawBoard() {
        String board = String.format(
                "%s|%s|%s\n" +
                "-----------\n" +
                "%s|%s|%s\n" +
                "-----------\n" +
                "%s|%s|%s",
                boardState[0], boardState[1], boardState[2],
                boardState[3], boardState[4], boardState[5],
                boardState[6], boardState[7], boardState[8]);

        printStream.println(board);
    }

    public void addMark(int squareToMark, String mark) {
        boardState[squareToMark - 1] = mark;
    }
}
