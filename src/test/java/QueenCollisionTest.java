import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

class QueenCollisionTest {
    private static final Color LEGAL_MOVE_HIGHLIGHT = Color.YELLOW;
    private static final Color RED_TEAM_COLOR = Color.RED;
    Team redTeam = new Team("RED", Color.RED);
    Queen queenActualD1Red = new Queen("D1", redTeam);
    Pawn pawnActualD2Red = new Pawn("D2", redTeam);
    Rook rookActualA1Red = new Rook("A1", redTeam);
    Bishop bishopActualF1Red = new Bishop("F1", redTeam);

    ChessBoard chessBoardActual = new ChessBoard();
    ChessSquare chessSquareD1 = chessBoardActual.getChessSquare("D1");
    ChessSquare chessSquareD2 = chessBoardActual.getChessSquare("D2");
    ChessSquare chessSquareA1 = chessBoardActual.getChessSquare("A1");
    ChessSquare chessSquareF1 = chessBoardActual.getChessSquare("F1");

    GameFrame gameFrameActual = new GameFrame(chessBoardActual);

    @BeforeEach
    public void setUp() {
        chessBoardActual.addChessPieceToBoard(queenActualD1Red);
        chessBoardActual.addChessPieceToBoard(pawnActualD2Red);
        chessBoardActual.addChessPieceToBoard(rookActualA1Red);
        chessBoardActual.addChessPieceToBoard(bishopActualF1Red);

        chessSquareD1.doClick();
    }

    @Test
    void red_queen_D_1_is_blocked_by_red_pawn_on_D_2() {
        assertEquals(RED_TEAM_COLOR, chessSquareD1.getBackground());
        assertEquals("Q", chessSquareD1.getChessPieceSymbol());
        assertEquals(RED_TEAM_COLOR, chessSquareD2.getBackground());
        assertEquals("P", chessSquareD2.getChessPieceSymbol());
    }

    @Test
    void red_queen_D_1_is_blocked_by_red_rook_on_A_1() {
        assertEquals(RED_TEAM_COLOR, chessSquareD1.getBackground());
        assertEquals("Q", chessSquareD1.getChessPieceSymbol());
        assertEquals(RED_TEAM_COLOR, chessSquareA1.getBackground());
        assertEquals("R", chessSquareA1.getChessPieceSymbol());
    }

    @Test
    void red_queen_can_legally_move_to_C_1_and_B1_while_red_rook_is_blocking_A_1() {
        assertEquals(LEGAL_MOVE_HIGHLIGHT, chessBoardActual.getChessSquare("C1").getBackground());
        assertEquals(LEGAL_MOVE_HIGHLIGHT, chessBoardActual.getChessSquare("B1").getBackground());
    }

    @Test
    void red_queen_D_1_is_blocked_by_red_bishop_on_F_1() {
        assertEquals(RED_TEAM_COLOR, chessSquareD1.getBackground());
        assertEquals("Q", chessSquareD1.getChessPieceSymbol());
        assertEquals(RED_TEAM_COLOR, chessSquareF1.getBackground());
        assertEquals("B", chessSquareF1.getChessPieceSymbol());
    }

    @Test
    void red_queen_D_1_can_legally_move_to_C_2_while_red_pawn_is_blocking_D_2() {
        assertEquals(RED_TEAM_COLOR, chessSquareD1.getBackground());
        assertEquals("Q", chessSquareD1.getChessPieceSymbol());
        assertEquals(LEGAL_MOVE_HIGHLIGHT, chessBoardActual.getChessSquare("C2").getBackground());
    }

    @Test
    void red_queen_D_1_can_legally_move_to_E_2_while_red_pawn_is_blocking_D_2() {
        assertEquals(RED_TEAM_COLOR, chessSquareD1.getBackground());
        assertEquals("Q", chessSquareD1.getChessPieceSymbol());
        assertEquals(LEGAL_MOVE_HIGHLIGHT, chessBoardActual.getChessSquare("E2").getBackground());
    }


}
