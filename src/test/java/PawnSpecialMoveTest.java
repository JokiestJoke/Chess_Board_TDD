import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class PawnSpecialMoveTest {
    private static final Color LEGAL_MOVE_HIGHLIGHT = Color.YELLOW;
    Team redTeam = new Team("RED", Color.RED);
    Pawn pawnActualH2 = new Pawn("H2", redTeam);
    Pawn pawnActualF7 = new Pawn("F7", redTeam);
    Pawn pawnActualF2 = new Pawn("F2", redTeam);
    Pawn pawnActualB2 = new Pawn("B2", redTeam);
    Pawn pawnActualA7 = new Pawn("A7", redTeam);
    ChessBoard chessBoardActual = new ChessBoard();
    GameFrame gameFrameActual = new GameFrame(chessBoardActual);
    ChessSquare chessSquareActualA4 = chessBoardActual.getChessSquare("A4");
    ChessSquare chessSquareActualA5 = chessBoardActual.getChessSquare("A5");
    ChessSquare chessSquareActualA6 = chessBoardActual.getChessSquare("A6");
    ChessSquare chessSquareActualA7 = chessBoardActual.getChessSquare("A7");
    ChessSquare chessSquareActualB2 = chessBoardActual.getChessSquare("B2");
    ChessSquare chessSquareActualB3 = chessBoardActual.getChessSquare("B3");
    ChessSquare chessSquareActualB4 = chessBoardActual.getChessSquare("B4");
    ChessSquare chessSquareActualB5 = chessBoardActual.getChessSquare("B5");
    ChessSquare chessSquareActualF2 = chessBoardActual.getChessSquare("F2");
    ChessSquare chessSquareActualF3 = chessBoardActual.getChessSquare("F3");
    ChessSquare chessSquareActualF4 = chessBoardActual.getChessSquare("F4");
    ChessSquare chessSquareActualF5 = chessBoardActual.getChessSquare("F5");
    ChessSquare chessSquareActualF6 = chessBoardActual.getChessSquare("F6");
    ChessSquare chessSquareActualF7 = chessBoardActual.getChessSquare("F7");
    ChessSquare chessSquareActualH2 = chessBoardActual.getChessSquare("H2");
    ChessSquare chessSquareActualH3 = chessBoardActual.getChessSquare("H3");
    ChessSquare chessSquareActualH4 = chessBoardActual.getChessSquare("H4");
    ChessSquare chessSquareActualH5 = chessBoardActual.getChessSquare("H5");

    @Test
    void pawn_on_B_2_can_legally_perform_a_double_move_to_B4_with_no_blocking_chess_pieces() {
        chessBoardActual.addChessPieceToBoard(pawnActualB2);
        chessSquareActualB2.doClick();

        assertEquals(LEGAL_MOVE_HIGHLIGHT, chessSquareActualB3.getBackground());
        assertEquals(LEGAL_MOVE_HIGHLIGHT, chessSquareActualB4.getBackground());
        assertNotEquals(LEGAL_MOVE_HIGHLIGHT, chessSquareActualB5.getBackground());
    }


    @Test
    void pawn_on_F_7_can_legally_move_to_F_6_or_F_5_with_no_blocking_chess_pieces() {
        chessBoardActual.addChessPieceToBoard(pawnActualF7);
        chessSquareActualF7.doClick();

        assertEquals(LEGAL_MOVE_HIGHLIGHT, chessSquareActualF6.getBackground());
        assertEquals(LEGAL_MOVE_HIGHLIGHT, chessSquareActualF5.getBackground());
        assertNotEquals(LEGAL_MOVE_HIGHLIGHT, chessSquareActualF4.getBackground());
    }

    @Test
    void pawn_on_F_2_can_legally_move_to_F_3_or_F_4_with_no_blocking_chess_pieces() {
        chessBoardActual.addChessPieceToBoard(pawnActualF2);
        chessSquareActualF2.doClick();

        assertEquals(LEGAL_MOVE_HIGHLIGHT, chessSquareActualF3.getBackground());
        assertEquals(LEGAL_MOVE_HIGHLIGHT, chessSquareActualF4.getBackground());
        assertNotEquals(LEGAL_MOVE_HIGHLIGHT, chessSquareActualF5.getBackground());
    }

    @Test
    void pawn_on_G_7_can_legally_move_to_F_3_or_F_4_with_no_blocking_chess_pieces() {
        chessBoardActual.addChessPieceToBoard(pawnActualF2);
        chessSquareActualF2.doClick();

        assertEquals(LEGAL_MOVE_HIGHLIGHT, chessSquareActualF3.getBackground());
        assertEquals(LEGAL_MOVE_HIGHLIGHT, chessSquareActualF4.getBackground());
        assertNotEquals(LEGAL_MOVE_HIGHLIGHT, chessSquareActualF5.getBackground());
    }

    @Test
    void pawn_on_A_7_can_legally_move_to_A_6_or_A_5_with_no_blocking_chess_pieces() {
        chessBoardActual.addChessPieceToBoard(pawnActualA7);
        chessSquareActualA7.doClick();

        assertEquals(LEGAL_MOVE_HIGHLIGHT, chessSquareActualA6.getBackground());
        assertEquals(LEGAL_MOVE_HIGHLIGHT, chessSquareActualA5.getBackground());
        assertNotEquals(LEGAL_MOVE_HIGHLIGHT, chessSquareActualA4.getBackground());
    }

    @Test
    void pawn_on_H_2_can_legally_move_to_H_3_or_H_4_with_no_blocking_chess_pieces() {
        chessBoardActual.addChessPieceToBoard(pawnActualH2);
        chessSquareActualH2.doClick();

        assertEquals(LEGAL_MOVE_HIGHLIGHT, chessSquareActualH3.getBackground());
        assertEquals(LEGAL_MOVE_HIGHLIGHT, chessSquareActualH4.getBackground());
        assertNotEquals(LEGAL_MOVE_HIGHLIGHT, chessSquareActualH5.getBackground());
    }
}
