import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

class KnightCaptureTest {
    private static final Color RED_TEAM_COLOR = Color.RED;
    private static final Color BLUE_TEAM_COLOR = Color.BLUE;
    private static final Color LEGAL_CAPTURE_HIGHLIGHT = Color.GREEN;
    Team redTeam = new Team("RED", RED_TEAM_COLOR);
    Team blueTeam = new Team("BLUE", BLUE_TEAM_COLOR);
    Knight knightActualD4 = new Knight("D4", redTeam);
    Pawn pawnActualC2 = new Pawn("C2", blueTeam);
    Pawn pawnActualC6 = new Pawn("C6", blueTeam);
    Pawn pawnActualB3 = new Pawn("B3", blueTeam);
    Pawn pawnActualB5 = new Pawn("B5", blueTeam);
    Pawn pawnActualE2 = new Pawn("E2", blueTeam);
    Pawn pawnActualE6 = new Pawn("E6", blueTeam);
    Pawn pawnActualF3 = new Pawn("F3", blueTeam);
    Pawn pawnActualF5 = new Pawn("F5", blueTeam);
    ChessBoard chessBoardActual = new ChessBoard();
    GameFrame gameFrameActual = new GameFrame(chessBoardActual);
    ChessSquare chessSquareActualD4 = chessBoardActual.getChessSquare("D4");
    ChessSquare chessSquareActualC2 = chessBoardActual.getChessSquare("C2");
    ChessSquare chessSquareActualC6 = chessBoardActual.getChessSquare("C6");
    ChessSquare chessSquareActualB3 = chessBoardActual.getChessSquare("B3");
    ChessSquare chessSquareActualB5 = chessBoardActual.getChessSquare("B5");
    ChessSquare chessSquareActualE2 = chessBoardActual.getChessSquare("E2");
    ChessSquare chessSquareActualE6 = chessBoardActual.getChessSquare("E6");
    ChessSquare chessSquareActualF3 = chessBoardActual.getChessSquare("F3");
    ChessSquare chessSquareActualF5 = chessBoardActual.getChessSquare("F5");

    @BeforeEach
    public void setUp() {
        chessBoardActual.addChessPieceToBoard(knightActualD4);

        chessBoardActual.addChessPieceToBoard(pawnActualC2);
        chessBoardActual.addChessPieceToBoard(pawnActualC6);
        chessBoardActual.addChessPieceToBoard(pawnActualB3);
        chessBoardActual.addChessPieceToBoard(pawnActualB5);
        chessBoardActual.addChessPieceToBoard(pawnActualE2);
        chessBoardActual.addChessPieceToBoard(pawnActualE6);
        chessBoardActual.addChessPieceToBoard(pawnActualF3);
        chessBoardActual.addChessPieceToBoard(pawnActualF5);

        chessSquareActualD4.doClick();
    }

    @Test
    void red_knight_D_4_can_capture_blue_pawn_on_chess_square_C_2() {
        assertEquals(LEGAL_CAPTURE_HIGHLIGHT, chessSquareActualC2.getBackground());
    }

    @Test
    void red_knight_D_4_can_capture_blue_pawn_on_chess_square_C_6() {
        assertEquals(LEGAL_CAPTURE_HIGHLIGHT, chessSquareActualC6.getBackground());
    }

    @Test
    void red_knight_D_4_can_capture_blue_pawn_on_chess_square_B_3() {
        assertEquals(LEGAL_CAPTURE_HIGHLIGHT, chessSquareActualB3.getBackground());
    }

    @Test
    void red_knight_D_4_can_capture_blue_pawn_on_chess_square_B_5() {
        assertEquals(LEGAL_CAPTURE_HIGHLIGHT, chessSquareActualB5.getBackground());
    }

    @Test
    void red_knight_D_4_can_capture_blue_pawn_on_chess_square_E_2() {
        assertEquals(LEGAL_CAPTURE_HIGHLIGHT, chessSquareActualE2.getBackground());
    }

    @Test
    void red_knight_D_4_can_capture_blue_pawn_on_chess_square_E_6() {
        assertEquals(LEGAL_CAPTURE_HIGHLIGHT, chessSquareActualE6.getBackground());
    }

    @Test
    void red_knight_D_4_can_capture_blue_pawn_on_chess_square_F_3() {
        assertEquals(LEGAL_CAPTURE_HIGHLIGHT, chessSquareActualF3.getBackground());
    }

    @Test
    void red_knight_D_4_can_capture_blue_pawn_on_chess_square_F_5() {
        assertEquals(LEGAL_CAPTURE_HIGHLIGHT, chessSquareActualF5.getBackground());
    }
}
