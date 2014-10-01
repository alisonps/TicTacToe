package com.twu.tictactoe;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InOrder;
import org.mockito.Mockito;

import java.io.PrintStream;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class BoardTest {

    PrintStream printStream;
    Board board;

    @Before
    public void setUp() {
        printStream = mock(PrintStream.class);
        board = new Board(printStream);
    }

    @Test
    public void shouldPrintEmptyBoard(){
        board.drawBlankBoard();

        InOrder inOrder = Mockito.inOrder(printStream);
        inOrder.verify(printStream).println("  |   |  ");
        inOrder.verify(printStream).println("---------");
        inOrder.verify(printStream).println("  |   |  ");
        inOrder.verify(printStream).println("---------");
        inOrder.verify(printStream).println("  |   |  ");
    }

}