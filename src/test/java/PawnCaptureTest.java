import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PawnCaptureTest {

    private static final Color RED_TEAM_COLOR = Color.RED;
    private static final Color BLUE_TEAM_COLOR = Color.BLUE;
    private static final Color LEGAL_CAPTURE_HIGHLIGHT = Color.GREEN;
    Team redTeam = new Team("RED", RED_TEAM_COLOR);
    Team blueTeam = new Team("BLUE", BLUE_TEAM_COLOR);
    ChessBoard chessBoardActual = new ChessBoard();
    GameFrame gameFrameActual = new GameFrame(chessBoardActual);
    Pawn pawnActualB3 = new Pawn("B3", redTeam);
    Pawn pawnActualA4 = new Pawn("A4", blueTeam);
    Pawn pawnActualC4 = new Pawn("C4", blueTeam);
    Pawn pawnActualF7 = new Pawn("F7", blueTeam);
    Pawn pawnActualG6 = new Pawn("G6", redTeam);
    Pawn pawnActualE6 = new Pawn("E6", redTeam);
    ChessSquare chessSquareActualB3 = chessBoardActual.getChessSquare("B3");
    ChessSquare chessSquareActualA4 = chessBoardActual.getChessSquare("A4");
    ChessSquare chessSquareActualC4 = chessBoardActual.getChessSquare("C4");
    ChessSquare chessSquareActualF7 = chessBoardActual.getChessSquare("F7");
    ChessSquare chessSquareActualE6 = chessBoardActual.getChessSquare("E6");
    ChessSquare chessSquareActualG6 = chessBoardActual.getChessSquare("G6");

    @BeforeEach
    public void setUp() {
        chessBoardActual.addChessPieceToBoard(pawnActualB3);
        chessBoardActual.addChessPieceToBoard(pawnActualA4);
        chessBoardActual.addChessPieceToBoard(pawnActualC4);

        chessBoardActual.addChessPieceToBoard(pawnActualF7);
        chessBoardActual.addChessPieceToBoard(pawnActualG6);
        chessBoardActual.addChessPieceToBoard(pawnActualE6);
    }

    @Test
    void red_pawn_B_3_can_capture_blue_pawn_on_chess_square_A_4() {
        chessSquareActualB3.doClick();
        assertEquals(LEGAL_CAPTURE_HIGHLIGHT, chessSquareActualA4.getBackground());
    }

    @Test
    void red_pawn_B_3_can_capture_blue_pawn_on_chess_square_C_4() {
        chessSquareActualB3.doClick();
        assertEquals(LEGAL_CAPTURE_HIGHLIGHT, chessSquareActualC4.getBackground());
    }

    @Test
    void blue_pawn_F_7_can_capture_red_pawn_on_chess_square_E_6() {
        chessSquareActualF7.doClick();
        assertEquals(LEGAL_CAPTURE_HIGHLIGHT, chessSquareActualE6.getBackground());
    }

    @Test
    void blue_pawn_F_7_can_capture_red_pawn_on_chess_square_G_6() {
        chessSquareActualF7.doClick();
        assertEquals(LEGAL_CAPTURE_HIGHLIGHT, chessSquareActualG6.getBackground());
    }

}
