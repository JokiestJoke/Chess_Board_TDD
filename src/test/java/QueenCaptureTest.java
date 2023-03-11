import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

class QueenCaptureTest {
    private static final Color RED_TEAM_COLOR = Color.RED;
    private static final Color BLUE_TEAM_COLOR = Color.BLUE;
    private static final Color LEGAL_CAPTURE_HIGHLIGHT = Color.GREEN;
    Team redTeam = new Team("RED", RED_TEAM_COLOR);
    Team blueTeam = new Team("BLUE", BLUE_TEAM_COLOR);
    King kingActualG8 = new King("G8", blueTeam);
    Queen queenActualD5Red = new Queen("D5", redTeam);
    Queen queenActualB7Blue = new Queen("B7", blueTeam);
    Bishop bishopActualF4Blue = new Bishop("F3", blueTeam);
    Rook rookActualD2Blue = new Rook("D2", blueTeam);
    Pawn pawnActualB3Blue = new Pawn("B3", blueTeam);
    Pawn pawnActualF5Blue = new Pawn("F5", blueTeam);
    Pawn pawnActualD6Blue = new Pawn("D6", blueTeam);
    ChessBoard chessBoardActual = new ChessBoard();
    GameFrame gameFrameActual = new GameFrame(chessBoardActual);
    ChessSquare chessSquareActualG8 = chessBoardActual.getChessSquare("G8");
    ChessSquare chessSquareActualF3 = chessBoardActual.getChessSquare("F3");
    ChessSquare chessSquareActualF5 = chessBoardActual.getChessSquare("F5");
    ChessSquare chessSquareActualB3 = chessBoardActual.getChessSquare("B3");
    ChessSquare chessSquareActualB7 = chessBoardActual.getChessSquare("B7");
    ChessSquare chessSquareActualD6 = chessBoardActual.getChessSquare("D6");
    ChessSquare chessSquareActualD5 = chessBoardActual.getChessSquare("D5");
    ChessSquare chessSquareActualD2 = chessBoardActual.getChessSquare("D2");

    @BeforeEach
    public void setUp() {
        chessBoardActual.addChessPieceToBoard(queenActualD5Red);
        chessBoardActual.addChessPieceToBoard(queenActualB7Blue);

        chessBoardActual.addChessPieceToBoard(kingActualG8);

        chessBoardActual.addChessPieceToBoard(bishopActualF4Blue);

        chessBoardActual.addChessPieceToBoard(rookActualD2Blue);

        chessBoardActual.addChessPieceToBoard(pawnActualB3Blue);
        chessBoardActual.addChessPieceToBoard(pawnActualF5Blue);
        chessBoardActual.addChessPieceToBoard(pawnActualD6Blue);

        chessSquareActualD5.doClick();
    }

    @Test
    void red_Queen_D_5_can_capture_blue_pawn_on_chess_square_F_5() {
        assertEquals(LEGAL_CAPTURE_HIGHLIGHT, chessSquareActualF5.getBackground());
    }

    @Test
    void red_queen_D_5_can_capture_blue_pawn_on_chess_square_D_6() {
        assertEquals(LEGAL_CAPTURE_HIGHLIGHT, chessSquareActualD6.getBackground());
    }

    @Test
    void red_queen_D_4_can_capture_blue_rook_on_chess_square_D_2() {
        assertEquals(LEGAL_CAPTURE_HIGHLIGHT, chessSquareActualD2.getBackground());
    }

    @Test
    void red_queen_D_4_can_capture_blue_pawn_on_chess_square_B_3() {
        assertEquals(LEGAL_CAPTURE_HIGHLIGHT, chessSquareActualB3.getBackground());
    }

    @Test
    void red_queen_D_4_can_capture_blue_queen_on_chess_square_B_7() {
        assertEquals(LEGAL_CAPTURE_HIGHLIGHT, chessSquareActualB7.getBackground());
    }

    @Test
    void red_queen_D_4_can_capture_blue_bishop_on_chess_square_F_3() {
        assertEquals(LEGAL_CAPTURE_HIGHLIGHT, chessSquareActualF3.getBackground());
    }

    @Test
    void red_queen_D_4_can_capture_blue_king_on_chess_square_G_8() {
        assertEquals(LEGAL_CAPTURE_HIGHLIGHT, chessSquareActualG8.getBackground());
    }

}
