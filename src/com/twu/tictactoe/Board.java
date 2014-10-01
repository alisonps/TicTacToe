package com.twu.tictactoe;

import java.io.PrintStream;

/**
 * Created by alisonpolton-simon on 10/1/14.
 */
public class Board {

    private PrintStream printStream;

    public Board(PrintStream printStream) {
        this.printStream = printStream;
    }

    public void drawBlankBoard() {
        printStream.println("  |   |  ");
        printStream.println("---------");
        printStream.println("  |   |  ");
        printStream.println("---------");
        printStream.println("  |   |  ");
    }
}
