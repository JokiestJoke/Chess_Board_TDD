import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BishopCaptureTest {
    private static final Color RED_TEAM_COLOR = Color.RED;
    private static final Color BLUE_TEAM_COLOR = Color.BLUE;
    private static final Color LEGAL_CAPTURE_HIGHLIGHT = Color.GREEN;
    Team redTeam = new Team("RED", RED_TEAM_COLOR);
    Team blueTeam = new Team("BLUE", BLUE_TEAM_COLOR);
    Bishop bishopActualD4 = new Bishop("D4", redTeam);
    Pawn pawnActualB2 = new Pawn("B2", blueTeam);
    Pawn pawnActualB6 = new Pawn("B6", blueTeam);
    Pawn pawnActualF2 = new Pawn("F2", blueTeam);
    Pawn pawnActualF6 = new Pawn("F6", blueTeam);
    ChessBoard chessBoardActual = new ChessBoard();
    GameFrame gameFrameActual = new GameFrame(chessBoardActual);
    ChessSquare chessSquareD4Actual = chessBoardActual.getChessSquare("D4");
    ChessSquare chessSquareB2Actual = chessBoardActual.getChessSquare("B2");
    ChessSquare chessSquareB6Actual = chessBoardActual.getChessSquare("B6");
    ChessSquare chessSquareF2Actual = chessBoardActual.getChessSquare("F2");
    ChessSquare chessSquareF6Actual = chessBoardActual.getChessSquare("F6");

    @BeforeEach
    public void setUp() {
        chessBoardActual.addChessPieceToBoard(bishopActualD4);

        chessBoardActual.addChessPieceToBoard(pawnActualB2);
        chessBoardActual.addChessPieceToBoard(pawnActualB6);
        chessBoardActual.addChessPieceToBoard(pawnActualF2);
        chessBoardActual.addChessPieceToBoard(pawnActualF6);

        chessSquareD4Actual.doClick();
    }

    @Test
    void red_bishop_D_4_can_capture_blue_pawn_on_chess_square_B_2() {
        assertEquals(LEGAL_CAPTURE_HIGHLIGHT, chessSquareB2Actual.getBackground());
    }

    @Test
    void red_bishop_D_4_can_capture_blue_pawn_on_chess_square_B_6() {
        assertEquals(LEGAL_CAPTURE_HIGHLIGHT, chessSquareB6Actual.getBackground());
    }

    @Test
    void red_bishop_D_4_can_capture_blue_pawn_on_chess_square_F_2() {
        assertEquals(LEGAL_CAPTURE_HIGHLIGHT, chessSquareF2Actual.getBackground());
    }

    @Test
    void red_bishop_D_4_can_capture_blue_pawn_on_chess_square_F_6() {
        assertEquals(LEGAL_CAPTURE_HIGHLIGHT, chessSquareF6Actual.getBackground());
    }


}
