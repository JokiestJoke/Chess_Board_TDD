import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

class QueenTest {
    private static final Color LEGAL_MOVE_HIGHLIGHT = Color.YELLOW;
    private static final Color RED_TEAM_COLOR = Color.RED;
    Team redTeam = new Team("RED", RED_TEAM_COLOR);
    Queen queenActualE5 = new Queen("E5", redTeam);
    ChessBoard chessBoardActual = new ChessBoard();

    ChessSquare chessSquareActualA1 = chessBoardActual.getChessSquare("A1");
    ChessSquare chessSquareActualA5 = chessBoardActual.getChessSquare("A5");
    ChessSquare chessSquareActualB2 = chessBoardActual.getChessSquare("B2");
    ChessSquare chessSquareActualB5 = chessBoardActual.getChessSquare("B5");
    ChessSquare chessSquareActualB8 = chessBoardActual.getChessSquare("B8");
    ChessSquare chessSquareActualC3 = chessBoardActual.getChessSquare("C3");
    ChessSquare chessSquareActualC5 = chessBoardActual.getChessSquare("C5");
    ChessSquare chessSquareActualC7 = chessBoardActual.getChessSquare("C7");
    ChessSquare chessSquareActualD4 = chessBoardActual.getChessSquare("D4");
    ChessSquare chessSquareActualD5 = chessBoardActual.getChessSquare("D5");
    ChessSquare chessSquareActualD6 = chessBoardActual.getChessSquare("D6");
    ChessSquare chessSquareActualE1 = chessBoardActual.getChessSquare("E1");
    ChessSquare chessSquareActualE2 = chessBoardActual.getChessSquare("E2");
    ChessSquare chessSquareActualE3 = chessBoardActual.getChessSquare("E3");
    ChessSquare chessSquareActualE4 = chessBoardActual.getChessSquare("E4");
    ChessSquare chessSquareActualE5 = chessBoardActual.getChessSquare("E5");
    ChessSquare chessSquareActualE6 = chessBoardActual.getChessSquare("E6");
    ChessSquare chessSquareActualE7 = chessBoardActual.getChessSquare("E7");
    ChessSquare chessSquareActualE8 = chessBoardActual.getChessSquare("E8");
    ChessSquare chessSquareActualF4 = chessBoardActual.getChessSquare("F4");
    ChessSquare chessSquareActualF5 = chessBoardActual.getChessSquare("F5");
    ChessSquare chessSquareActualF6 = chessBoardActual.getChessSquare("F6");
    ChessSquare chessSquareActualG3 = chessBoardActual.getChessSquare("G3");
    ChessSquare chessSquareActualG5 = chessBoardActual.getChessSquare("G5");
    ChessSquare chessSquareActualG7 = chessBoardActual.getChessSquare("G7");
    ChessSquare chessSquareActualH2 = chessBoardActual.getChessSquare("H2");
    ChessSquare chessSquareActualH5 = chessBoardActual.getChessSquare("H5");
    ChessSquare chessSquareActualH8 = chessBoardActual.getChessSquare("H8");
    GameFrame gameFrameActual = new GameFrame(chessBoardActual);

    @BeforeEach
    public void setUp() {
        chessBoardActual.addChessPieceToBoard(queenActualE5);
        chessSquareActualE5.doClick();
    }

    @Test
    void queen_on_E_5_can_legally_move_to_F_5_with_no_blocking_chess_pieces() {
        assertEquals(LEGAL_MOVE_HIGHLIGHT, chessSquareActualF5.getBackground());
    }

    @Test
    void queen_on_E_5_can_legally_move_to_G_5_with_no_blocking_chess_pieces() {
        assertEquals(LEGAL_MOVE_HIGHLIGHT, chessSquareActualG5.getBackground());
    }

    @Test
    void queen_on_E_5_can_legally_move_to_H_5_with_no_blocking_chess_pieces() {
        assertEquals(LEGAL_MOVE_HIGHLIGHT, chessSquareActualH5.getBackground());
    }

    @Test
    void queen_on_E_5_can_legally_move_to_D_5_with_no_blocking_chess_pieces() {
        assertEquals(LEGAL_MOVE_HIGHLIGHT, chessSquareActualD5.getBackground());
    }

    @Test
    void queen_on_E_5_can_legally_move_to_C_5_with_no_blocking_chess_pieces() {
        assertEquals(LEGAL_MOVE_HIGHLIGHT, chessSquareActualC5.getBackground());
    }

    @Test
    void queen_on_E_5_can_legally_move_to_B_5_with_no_blocking_chess_pieces() {
        assertEquals(LEGAL_MOVE_HIGHLIGHT, chessSquareActualB5.getBackground());
    }

    @Test
    void queen_on_E_5_can_legally_move_to_A_5_with_no_blocking_chess_pieces() {
        assertEquals(LEGAL_MOVE_HIGHLIGHT, chessSquareActualA5.getBackground());
    }

    @Test
    void queen_on_E_5_can_legally_move_to_E_4_with_no_blocking_chess_pieces() {
        assertEquals(LEGAL_MOVE_HIGHLIGHT, chessSquareActualE4.getBackground());
    }

    @Test
    void queen_on_E_5_can_legally_move_to_E_3_with_no_blocking_chess_pieces() {
        assertEquals(LEGAL_MOVE_HIGHLIGHT, chessSquareActualE3.getBackground());
    }

    @Test
    void queen_on_E_5_can_legally_move_to_E_2_with_no_blocking_chess_pieces() {
        assertEquals(LEGAL_MOVE_HIGHLIGHT, chessSquareActualE2.getBackground());
    }

    @Test
    void queen_on_E_5_can_legally_move_to_E_1_with_no_blocking_chess_pieces() {
        assertEquals(LEGAL_MOVE_HIGHLIGHT, chessSquareActualE1.getBackground());
    }

    @Test
    void queen_on_E_5_can_legally_move_to_E_6_with_no_blocking_chess_pieces() {
        assertEquals(LEGAL_MOVE_HIGHLIGHT, chessSquareActualE6.getBackground());
    }

    @Test
    void queen_on_E_5_can_legally_move_to_E_7_with_no_blocking_chess_pieces() {
        assertEquals(LEGAL_MOVE_HIGHLIGHT, chessSquareActualE7.getBackground());
    }

    @Test
    void queen_on_E_5_can_legally_move_to_E_8_with_no_blocking_chess_pieces() {
        assertEquals(LEGAL_MOVE_HIGHLIGHT, chessSquareActualE8.getBackground());
    }

    @Test
    void queen_on_E_5_can_legally_move_to_D_4_with_no_blocking_chess_pieces() {
        assertEquals(LEGAL_MOVE_HIGHLIGHT, chessSquareActualD4.getBackground());
    }

    @Test
    void queen_on_E_5_can_legally_move_to_C_3_with_no_blocking_chess_pieces() {
        assertEquals(LEGAL_MOVE_HIGHLIGHT, chessSquareActualC3.getBackground());
    }

    @Test
    void queen_on_E_5_can_legally_move_to_B_2_with_no_blocking_chess_pieces() {
        assertEquals(LEGAL_MOVE_HIGHLIGHT, chessSquareActualB2.getBackground());
    }

    @Test
    void queen_on_E_5_can_legally_move_to_A_1_with_no_blocking_chess_pieces() {
        assertEquals(LEGAL_MOVE_HIGHLIGHT, chessSquareActualA1.getBackground());
    }

    @Test
    void queen_on_E_5_can_legally_move_to_F_6_with_no_blocking_chess_pieces() {
        assertEquals(LEGAL_MOVE_HIGHLIGHT, chessSquareActualF6.getBackground());
    }

    @Test
    void queen_on_E_5_can_legally_move_to_G_7_with_no_blocking_chess_pieces() {
        assertEquals(LEGAL_MOVE_HIGHLIGHT, chessSquareActualG7.getBackground());
    }

    @Test
    void queen_on_E_5_can_legally_move_to_H_8_with_no_blocking_chess_pieces() {
        assertEquals(LEGAL_MOVE_HIGHLIGHT, chessSquareActualH8.getBackground());
    }

    @Test
    void queen_on_E_5_can_legally_move_to_F_4_with_no_blocking_chess_pieces() {
        assertEquals(LEGAL_MOVE_HIGHLIGHT, chessSquareActualF4.getBackground());
    }

    @Test
    void queen_on_E_5_can_legally_move_to_G_3_with_no_blocking_chess_pieces() {
        assertEquals(LEGAL_MOVE_HIGHLIGHT, chessSquareActualG3.getBackground());
    }

    @Test
    void queen_on_E_5_can_legally_move_to_H_2_with_no_blocking_chess_pieces() {
        assertEquals(LEGAL_MOVE_HIGHLIGHT, chessSquareActualH2.getBackground());
    }

    @Test
    void queen_on_E_5_can_legally_move_to_D_6_with_no_blocking_chess_pieces() {
        assertEquals(LEGAL_MOVE_HIGHLIGHT, chessSquareActualD6.getBackground());
    }

    @Test
    void queen_on_E_5_can_legally_move_to_C_7_with_no_blocking_chess_pieces() {
        assertEquals(LEGAL_MOVE_HIGHLIGHT, chessSquareActualC7.getBackground());
    }

    @Test
    void queen_on_E_5_can_legally_move_to_B_8_with_no_blocking_chess_pieces() {
        assertEquals(LEGAL_MOVE_HIGHLIGHT, chessSquareActualB8.getBackground());
    }
}
