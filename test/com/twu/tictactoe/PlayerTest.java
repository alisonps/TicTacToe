package com.twu.tictactoe;

import org.junit.Before;
import org.junit.Test;

import java.io.*;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class PlayerTest {
    PrintStream printStream;
    Player player1;
    Player player2;
    BufferedReader bufferedReader;
    Board board;

    @Before
    public void setUp() {
        printStream = mock(PrintStream.class);
        bufferedReader = mock(BufferedReader.class);
        board = mock(Board.class);
        player1 = new Player(printStream, bufferedReader, board, " X ", 1);
        player2 = new Player(printStream, bufferedReader, board, " O ", 2);
    }

    @Test
    public void shouldPromptPlayerOneToMove(){
        player1.promptPlayer();

        verify(printStream).println("Player 1 please enter a location between 1 and 9");
    }

    @Test
    public void shouldPromptPlayerTwoToMove(){
        player2.promptPlayer();

        verify(printStream).println("Player 2 please enter a location between 1 and 9");
    }

    @Test
    public void shouldParseInputStringToInteger() throws IOException {
        when(bufferedReader.readLine()).thenReturn("1");

        int input = player1.parseInput();

        assertEquals(1, input);
    }

    @Test
    public void shouldPromptPlayerToMoveAgainIfSquareIsFull() throws IOException {
        when(board.addMark(1, " X ")).thenReturn(false, true);
        when(bufferedReader.readLine()).thenReturn("1");

        player1.markBoard();

        verify(printStream).println("That square was already occupied");


    }
}