package com.twu.tictactoe;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InOrder;
import org.mockito.Mockito;

import java.io.PrintStream;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

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

        inOrder.verify(printStream).println
                ("   |   |   \n" +
                "-----------\n" +
                "   |   |   \n" +
                "-----------\n" +
                "   |   |   ");
    }

    @Test
    public void shouldRedrawWithXInTopCornerWhenUserOneInputIsOne(){
        int input = 1;
        int player = 1;
        board.redrawBoard(input, player);

        InOrder inOrder = Mockito.inOrder(printStream);
        inOrder.verify(printStream).println(
                " X |   |   \n" +
                "-----------\n" +
                "   |   |   \n" +
                "-----------\n" +
                "   |   |   ");

    }

    @Test
    public void shouldRedrawWithXInMiddleWhenUserOneInputIsFive(){
        int input = 5;
        int player = 1;
        board.redrawBoard(input, player);

        InOrder inOrder = Mockito.inOrder(printStream);
        inOrder.verify(printStream).println(
                        "   |   |   \n" +
                        "-----------\n" +
                        "   | X |   \n" +
                        "-----------\n" +
                        "   |   |   ");

    }

    @Test
    public void shouldRedrawWithOInUpperLeftWhenUserTwoInputIsOne(){
        int input = 5;
        int player = 1;
        board.redrawBoard(input, player);

        input = 1;
        player = 2;
        board.redrawBoard(input, player);

        InOrder inOrder = Mockito.inOrder(printStream);
        inOrder.verify(printStream).println(
                " O |   |   \n" +
                        "-----------\n" +
                        "   | X |   \n" +
                        "-----------\n" +
                        "   |   |   ");

    }

}