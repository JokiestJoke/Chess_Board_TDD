import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RookCaptureTest {
    private static final Color RED_TEAM_COLOR = Color.RED;
    private static final Color BLUE_TEAM_COLOR = Color.BLUE;
    private static final Color LEGAL_CAPTURE_HIGHLIGHT = Color.GREEN;
    Team redTeam = new Team("RED", RED_TEAM_COLOR);
    Team blueTeam = new Team("BLUE", BLUE_TEAM_COLOR);
    Rook rookActualD4Red = new Rook("D4", redTeam);
    Rook rookActualD2Blue = new Rook("D2", blueTeam);
    Pawn pawnActualB4Blue = new Pawn("B4", blueTeam);
    Pawn pawnActualF4Blue = new Pawn("F4", blueTeam);
    Pawn pawnActualD6Blue = new Pawn("D6", blueTeam);
    ChessBoard chessBoardActual = new ChessBoard();
    GameFrame gameFrameActual = new GameFrame(chessBoardActual);
    ChessSquare chessSquareActualD4 = chessBoardActual.getChessSquare("D4");
    ChessSquare chessSquareActualF4 = chessBoardActual.getChessSquare("F4");
    ChessSquare chessSquareActualB4 = chessBoardActual.getChessSquare("B4");
    ChessSquare chessSquareActualD6 = chessBoardActual.getChessSquare("D6");
    ChessSquare chessSquareActualD2 = chessBoardActual.getChessSquare("D2");

    @BeforeEach
    public void setUp() {
        chessBoardActual.addChessPieceToBoard(rookActualD4Red);
        chessBoardActual.addChessPieceToBoard(rookActualD2Blue);

        chessBoardActual.addChessPieceToBoard(pawnActualB4Blue);
        chessBoardActual.addChessPieceToBoard(pawnActualF4Blue);
        chessBoardActual.addChessPieceToBoard(pawnActualD6Blue);

        chessSquareActualD4.doClick();
    }

    @Test
    void red_rook_D_4_can_capture_blue_pawn_on_chess_square_F_4() {
        assertEquals(LEGAL_CAPTURE_HIGHLIGHT, chessSquareActualF4.getBackground());
    }

    @Test
    void red_rook_D_4_can_capture_blue_pawn_on_chess_square_B_4() {
        assertEquals(LEGAL_CAPTURE_HIGHLIGHT, chessSquareActualB4.getBackground());
    }

    @Test
    void red_rook_D_4_can_capture_blue_pawn_on_chess_square_D_6() {
        assertEquals(LEGAL_CAPTURE_HIGHLIGHT, chessSquareActualD6.getBackground());
    }

    @Test
    void red_rook_D_4_can_capture_blue_rook_on_chess_square_D_2() {
        assertEquals(LEGAL_CAPTURE_HIGHLIGHT, chessSquareActualD2.getBackground());
    }
}
