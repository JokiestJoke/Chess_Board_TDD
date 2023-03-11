import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

class KnightTest {
    private static final Color LEGAL_MOVE_HIGHLIGHT = Color.YELLOW;
    Team redTeam = new Team("RED", Color.RED);
    Knight knightActualD5 = new Knight("D5", redTeam);
    ChessBoard chessBoardActual = new ChessBoard();
    GameFrame gameFrameActual = new GameFrame(chessBoardActual);

    ChessSquare chessSquareActualB4 = chessBoardActual.getChessSquare("B4");
    ChessSquare chessSquareActualB6 = chessBoardActual.getChessSquare("B6");
    ChessSquare chessSquareActualC3 = chessBoardActual.getChessSquare("C3");
    ChessSquare chessSquareActualC7 = chessBoardActual.getChessSquare("C7");
    ChessSquare chessSquareActualD5 = chessBoardActual.getChessSquare("D5");
    ChessSquare chessSquareActualE3 = chessBoardActual.getChessSquare("E3");
    ChessSquare chessSquareActualE7 = chessBoardActual.getChessSquare("E7");
    ChessSquare chessSquareActualF4 = chessBoardActual.getChessSquare("F4");
    ChessSquare chessSquareActualF6 = chessBoardActual.getChessSquare("F6");


    @BeforeEach
    public void setUp() {
        chessBoardActual.addChessPieceToBoard(knightActualD5);
        chessSquareActualD5.doClick();
    }

    @Test
    void knight_on_D_5_can_legally_move_to_C_3_with_no_blocking_chess_pieces() {
        assertEquals(LEGAL_MOVE_HIGHLIGHT, chessSquareActualC3.getBackground());
    }

    @Test
    void knight_on_D_5_can_legally_move_to_E_3_with_no_blocking_chess_pieces() {
        assertEquals(LEGAL_MOVE_HIGHLIGHT, chessSquareActualE3.getBackground());
    }

    @Test
    void knight_on_D_5_can_legally_move_to_C_7_with_no_blocking_chess_pieces() {
        assertEquals(LEGAL_MOVE_HIGHLIGHT, chessSquareActualC7.getBackground());
    }

    @Test
    void knight_on_D_5_can_legally_move_to_E_7_with_no_blocking_chess_pieces() {
        assertEquals(LEGAL_MOVE_HIGHLIGHT, chessSquareActualE7.getBackground());
    }

    @Test
    void knight_on_D_5_can_legally_move_to_B_4_with_no_blocking_chess_pieces() {
        assertEquals(LEGAL_MOVE_HIGHLIGHT, chessSquareActualB4.getBackground());
    }

    @Test
    void knight_on_D_5_can_legally_move_to_B_6_with_no_blocking_chess_pieces() {
        assertEquals(LEGAL_MOVE_HIGHLIGHT, chessSquareActualB6.getBackground());
    }

    @Test
    void knight_on_D_5_can_legally_move_to_F_4_with_no_blocking_chess_pieces() {
        assertEquals(LEGAL_MOVE_HIGHLIGHT, chessSquareActualF4.getBackground());
    }

    @Test
    void knight_on_D_5_can_legally_move_to_F_6_with_no_blocking_chess_pieces() {
        assertEquals(LEGAL_MOVE_HIGHLIGHT, chessSquareActualF6.getBackground());
    }


}
