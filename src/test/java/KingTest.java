import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

class KingTest {
    private static final Color LEGAL_MOVE_HIGHLIGHT = Color.YELLOW;
    Team redTeam = new Team("RED", Color.RED);
    King kingActualC3 = new King("C3", redTeam);
    ChessBoard chessBoardActual = new ChessBoard();
    GameFrame gameFrameActual = new GameFrame(chessBoardActual);

    ChessSquare chessSquareActualB2 = chessBoardActual.getChessSquare("B2");
    ChessSquare chessSquareActualB3 = chessBoardActual.getChessSquare("B3");
    ChessSquare chessSquareActualB4 = chessBoardActual.getChessSquare("B4");
    ChessSquare chessSquareActualC2 = chessBoardActual.getChessSquare("C2");
    ChessSquare chessSquareActualC3 = chessBoardActual.getChessSquare("C3");
    ChessSquare chessSquareActualC4 = chessBoardActual.getChessSquare("C4");
    ChessSquare chessSquareActualD2 = chessBoardActual.getChessSquare("D2");
    ChessSquare chessSquareActualD3 = chessBoardActual.getChessSquare("D3");
    ChessSquare chessSquareActualD4 = chessBoardActual.getChessSquare("D4");


    @BeforeEach
    public void setUp() {
        chessBoardActual.addChessPieceToBoard(kingActualC3);
        chessSquareActualC3.doClick();
    }

    @Test
    void king_on_C_3_can_legally_move_to_C_2_with_no_blocking_chess_pieces() {
        assertEquals(LEGAL_MOVE_HIGHLIGHT, chessSquareActualC2.getBackground());
    }

    @Test
    void king_on_C_3_can_legally_move_to_C_4_with_no_blocking_chess_pieces() {
        assertEquals(LEGAL_MOVE_HIGHLIGHT, chessSquareActualC4.getBackground());
    }

    @Test
    void king_on_C_3_can_legally_move_to_B_3_with_no_blocking_chess_pieces() {
        assertEquals(LEGAL_MOVE_HIGHLIGHT, chessSquareActualB3.getBackground());
    }

    @Test
    void king_on_C_3_can_legally_move_to_D_3_with_no_blocking_chess_pieces() {
        assertEquals(LEGAL_MOVE_HIGHLIGHT, chessSquareActualD3.getBackground());
    }

    @Test
    void king_on_C_3_can_legally_move_to_B_2_with_no_blocking_chess_pieces() {
        assertEquals(LEGAL_MOVE_HIGHLIGHT, chessSquareActualB2.getBackground());
    }

    @Test
    void king_on_C_3_can_legally_move_to_D_2_with_no_blocking_chess_pieces() {
        assertEquals(LEGAL_MOVE_HIGHLIGHT, chessSquareActualD2.getBackground());
    }

    @Test
    void king_on_C_3_can_legally_move_to_D_4_with_no_blocking_chess_pieces() {
        assertEquals(LEGAL_MOVE_HIGHLIGHT, chessSquareActualD4.getBackground());
    }

    @Test
    void king_on_C_3_can_legally_move_to_B_4_with_no_blocking_chess_pieces() {
        assertEquals(LEGAL_MOVE_HIGHLIGHT, chessSquareActualB4.getBackground());
    }
}
