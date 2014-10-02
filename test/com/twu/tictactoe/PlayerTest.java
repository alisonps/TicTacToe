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
    Player player;
    BufferedReader bufferedReader;
    Board board;

    @Before
    public void setUp() {
        printStream = mock(PrintStream.class);
        bufferedReader = mock(BufferedReader.class);
        player = new Player(printStream, bufferedReader, board);
    }

    @Test
    public void shouldPromptPlayerOneToMove(){
        player.promptPlayerOne();

        verify(printStream).println("Player 1 please enter a location between 1 and 9");
    }

    @Test
    public void shouldParseInputStringtoInteger() throws IOException {
        when(bufferedReader.readLine()).thenReturn("1");

        int input = player.parseInput();

        assertEquals(1, input);
    }


}