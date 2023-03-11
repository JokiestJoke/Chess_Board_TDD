import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BishopTest {
    private static final Color LEGAL_MOVE_HIGHLIGHT = Color.YELLOW;
    Team redTeam = new Team("RED", Color.RED);
    Bishop bishopActualD4 = new Bishop("D4", redTeam);
    ChessBoard chessBoardActual = new ChessBoard();
    GameFrame gameFrameActual = new GameFrame(chessBoardActual);
    ChessSquare chessSquareActualA1 = chessBoardActual.getChessSquare("A1");
    ChessSquare chessSquareActualA7 = chessBoardActual.getChessSquare("A7");
    ChessSquare chessSquareActualB2 = chessBoardActual.getChessSquare("B2");
    ChessSquare chessSquareActualB6 = chessBoardActual.getChessSquare("B6");
    ChessSquare chessSquareActualC3 = chessBoardActual.getChessSquare("C3");
    ChessSquare chessSquareActualC5 = chessBoardActual.getChessSquare("C5");
    ChessSquare chessSquareActualD4 = chessBoardActual.getChessSquare("D4");
    ChessSquare chessSquareActualE3 = chessBoardActual.getChessSquare("E3");
    ChessSquare chessSquareActualE5 = chessBoardActual.getChessSquare("E5");
    ChessSquare chessSquareActualF2 = chessBoardActual.getChessSquare("F2");
    ChessSquare chessSquareActualF6 = chessBoardActual.getChessSquare("F6");
    ChessSquare chessSquareActualG1 = chessBoardActual.getChessSquare("G1");
    ChessSquare chessSquareActualG7 = chessBoardActual.getChessSquare("G7");
    ChessSquare chessSquareActualH8 = chessBoardActual.getChessSquare("H8");

    @BeforeEach
    public void setUp() {
        chessBoardActual.addChessPieceToBoard(bishopActualD4);
        chessSquareActualD4.doClick();
    }

    @Test
    void bishop_on_D_4_can_legally_move_to_C_3_with_no_blocking_chess_pieces() {
        assertEquals(LEGAL_MOVE_HIGHLIGHT, chessSquareActualC3.getBackground());
    }


    @Test
    void bishop_on_D_4_can_legally_move_to_B_2_with_no_blocking_chess_pieces() {
        assertEquals(LEGAL_MOVE_HIGHLIGHT, chessSquareActualB2.getBackground());
    }

    @Test
    void bishop_on_D_4_can_legally_move_to_A_1_with_no_blocking_chess_pieces() {
        assertEquals(LEGAL_MOVE_HIGHLIGHT, chessSquareActualA1.getBackground());
    }

    @Test
    void bishop_on_D_4_can_legally_move_to_E_5_with_no_blocking_chess_pieces() {
        assertEquals(LEGAL_MOVE_HIGHLIGHT, chessSquareActualE5.getBackground());
    }

    @Test
    void bishop_on_D_4_can_legally_move_to_F_6_with_no_blocking_chess_pieces() {
        assertEquals(LEGAL_MOVE_HIGHLIGHT, chessSquareActualF6.getBackground());
    }

    @Test
    void bishop_on_D_4_can_legally_move_to_G_7_with_no_blocking_chess_pieces() {
        assertEquals(LEGAL_MOVE_HIGHLIGHT, chessSquareActualG7.getBackground());
    }

    @Test
    void bishop_on_D_4_can_legally_move_to_H_8_with_no_blocking_chess_pieces() {
        assertEquals(LEGAL_MOVE_HIGHLIGHT, chessSquareActualH8.getBackground());
    }


    @Test
    void bishop_on_D_4_can_legally_move_to_E_3_with_no_blocking_chess_pieces() {
        assertEquals(LEGAL_MOVE_HIGHLIGHT, chessSquareActualE3.getBackground());
    }

    @Test
    void bishop_on_D_4_can_legally_move_to_F_2_with_no_blocking_chess_pieces() {
        assertEquals(LEGAL_MOVE_HIGHLIGHT, chessSquareActualF2.getBackground());
    }

    @Test
    void bishop_on_D_4_can_legally_move_to_G_1_with_no_blocking_chess_pieces() {
        assertEquals(LEGAL_MOVE_HIGHLIGHT, chessSquareActualG1.getBackground());
    }

    @Test
    void bishop_on_D_4_can_legally_move_to_C_5_with_no_blocking_chess_pieces() {
        assertEquals(LEGAL_MOVE_HIGHLIGHT, chessSquareActualC5.getBackground());
    }

    @Test
    void bishop_on_D_4_can_legally_move_to_B_6_with_no_blocking_chess_pieces() {
        assertEquals(LEGAL_MOVE_HIGHLIGHT, chessSquareActualB6.getBackground());
    }

    @Test
    void bishop_on_D_4_can_legally_move_to_A_7_with_no_blocking_chess_pieces() {
        assertEquals(LEGAL_MOVE_HIGHLIGHT, chessSquareActualA7.getBackground());
    }
}
