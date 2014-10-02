package com.twu.tictactoe;

import java.io.PrintStream;
import java.util.ArrayList;

/**
 * Created by alisonpolton-simon on 10/1/14.
 */
public class Board {

    private PrintStream printStream;
    char boardState[] = new char[9];

    public Board(PrintStream printStream) {
        this.printStream = printStream;
        for(int i = 0; i < 9; i ++){
            boardState[i] = ' ';
        }
    }

    public void drawBlankBoard() {
        printStream.println("   |   |   \n" +
                            "-----------\n" +
                            "   |   |   \n" +
                            "-----------\n" +
                            "   |   |   ");
    }

    public void redrawBoard(int squareToMark) {
        boardState[squareToMark - 1] = 'X';

        String board = String.format(
                " %c | %c | %c \n" +
                "-----------\n" +
                " %c | %c | %c \n" +
                "-----------\n" +
                " %c | %c | %c ",
                boardState[0], boardState[1], boardState[2],
                boardState[3], boardState[4], boardState[5],
                boardState[6], boardState[7], boardState[8]);

        printStream.println(board);
    }
}
