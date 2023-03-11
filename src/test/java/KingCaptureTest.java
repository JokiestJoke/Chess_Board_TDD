import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

class KingCaptureTest {
    private static final Color RED_TEAM_COLOR = Color.RED;
    private static final Color BLUE_TEAM_COLOR = Color.BLUE;
    private static final Color LEGAL_CAPTURE_HIGHLIGHT = Color.GREEN;
    Team redTeam = new Team("RED", RED_TEAM_COLOR);
    Team blueTeam = new Team("BLUE", BLUE_TEAM_COLOR);
    King kingActualD2 = new King("D2", redTeam);
    King kingActualE2 = new King("E2", blueTeam);
    Rook rookActualC1 = new Rook("C1", blueTeam);
    Rook rookActualC3 = new Rook("C3", blueTeam);
    Queen queenActualE1 = new Queen("E1", blueTeam);
    Bishop bishopActualD1 = new Bishop("D1", blueTeam);
    Pawn pawnActualC2 = new Pawn("C2", blueTeam);
    Pawn pawnActualD3 = new Pawn("D3", blueTeam);
    Pawn pawnActualE3 = new Pawn("E3", blueTeam);
    ChessBoard chessBoardActual = new ChessBoard();
    GameFrame gameFrameActual = new GameFrame(chessBoardActual);
    ChessSquare chessSquareC1 = chessBoardActual.getChessSquare("C1");
    ChessSquare chessSquareC2 = chessBoardActual.getChessSquare("C2");
    ChessSquare chessSquareC3 = chessBoardActual.getChessSquare("C3");
    ChessSquare chessSquareD1 = chessBoardActual.getChessSquare("D1");
    ChessSquare chessSquareD2 = chessBoardActual.getChessSquare("D2");
    ChessSquare chessSquareD3 = chessBoardActual.getChessSquare("D3");
    ChessSquare chessSquareE1 = chessBoardActual.getChessSquare("E1");
    ChessSquare chessSquareE2 = chessBoardActual.getChessSquare("E2");
    ChessSquare chessSquareE3 = chessBoardActual.getChessSquare("E3");


    @BeforeEach
    public void setUp() {
        chessBoardActual.addChessPieceToBoard(kingActualD2);

        chessBoardActual.addChessPieceToBoard(kingActualE2);
        chessBoardActual.addChessPieceToBoard(queenActualE1);
        chessBoardActual.addChessPieceToBoard(bishopActualD1);
        chessBoardActual.addChessPieceToBoard(rookActualC1);
        chessBoardActual.addChessPieceToBoard(rookActualC3);
        chessBoardActual.addChessPieceToBoard(pawnActualC2);
        chessBoardActual.addChessPieceToBoard(pawnActualD3);
        chessBoardActual.addChessPieceToBoard(pawnActualE3);

        chessSquareD2.doClick();
    }

    @Test
    void red_king_on_D2_can_capture_blue_queen_on_chess_square_E_1() {
        assertEquals(LEGAL_CAPTURE_HIGHLIGHT, chessSquareE1.getBackground());
    }

    @Test
    void red_king_on_D2_can_capture_blue_king_on_chess_square_E_2() {
        assertEquals(LEGAL_CAPTURE_HIGHLIGHT, chessSquareE2.getBackground());
    }

    @Test
    void red_king_on_D2_can_capture_blue_pawn_on_chess_square_E_3() {
        assertEquals(LEGAL_CAPTURE_HIGHLIGHT, chessSquareE3.getBackground());
    }

    @Test
    void red_king_on_D2_can_capture_blue_rook_on_chess_square_C_1() {
        assertEquals(LEGAL_CAPTURE_HIGHLIGHT, chessSquareC1.getBackground());
    }

    @Test
    void red_king_on_D2_can_capture_blue_pawn_on_chess_square_C_2() {
        assertEquals(LEGAL_CAPTURE_HIGHLIGHT, chessSquareC2.getBackground());
    }

    @Test
    void red_king_on_D2_can_capture_blue_rook_on_chess_square_C_3() {
        assertEquals(LEGAL_CAPTURE_HIGHLIGHT, chessSquareC3.getBackground());
    }

    @Test
    void red_king_on_D2_can_capture_blue_pawn_on_chess_square_D_3() {
        assertEquals(LEGAL_CAPTURE_HIGHLIGHT, chessSquareD3.getBackground());
    }

    @Test
    void red_king_on_D2_can_capture_blue_bishop_on_chess_square_D_1() {
        assertEquals(LEGAL_CAPTURE_HIGHLIGHT, chessSquareD1.getBackground());
    }


}
