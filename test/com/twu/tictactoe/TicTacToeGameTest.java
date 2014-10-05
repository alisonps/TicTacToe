package com.twu.tictactoe;

import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class TicTacToeGameTest {
    private TicTacToeGame game;
    private Board board;
    private Player player1;
    private Player player2;

    @Before
    public void setUp(){
        board = mock(Board.class);
        player1 = mock(Player.class);
        player2 = mock(Player.class);
        game = new TicTacToeGame(board, player1, player2);
    }

    @Test
    public void shouldDrawBoardWhenGameStarts(){
        game.startGame();

        verify(board).drawBoard();
    }

    @Test
    public void shouldTakePlayerOneTurnWhenGameStarts(){
        game.startGame();

        verify(player1).markBoard();
    }

    @Test
    public void shouldTakePlayerTwoTurnWhenGameStarts(){
        game.startGame();

        verify(player2).markBoard();
    }

}