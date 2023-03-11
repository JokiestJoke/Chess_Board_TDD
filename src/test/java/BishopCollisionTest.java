import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BishopCollisionTest {
    private static final Color LEGAL_MOVE_HIGHLIGHT = Color.YELLOW;
    private static final Color RED_TEAM_COLOR = Color.RED;
    Team redTeam = new Team("RED", RED_TEAM_COLOR);
    Bishop bishopActualC1 = new Bishop("C1", redTeam);
    Pawn pawnActualB2 = new Pawn("B2", redTeam);
    Pawn pawnActualF4 = new Pawn("F4", redTeam);
    ChessBoard chessBoardActual = new ChessBoard();
    ChessSquare chessSquareC1 = chessBoardActual.getChessSquare("C1");
    ChessSquare chessSquareB2 = chessBoardActual.getChessSquare("B2");
    ChessSquare chessSquareF4 = chessBoardActual.getChessSquare("F4");
    GameFrame gameFrameActual = new GameFrame(chessBoardActual);

    @BeforeEach
    public void setUp() {
        chessBoardActual.addChessPieceToBoard(bishopActualC1);
        chessBoardActual.addChessPieceToBoard(pawnActualB2);
        chessBoardActual.addChessPieceToBoard(pawnActualF4);

        chessSquareC1.doClick();
    }

    @Test
    void red_bishop_C_1_is_blocked_by_red_pawn_on_B_2() {
        assertEquals(RED_TEAM_COLOR, chessSquareC1.getBackground());
        assertEquals("B", chessSquareC1.getChessPieceSymbol());
        assertEquals(RED_TEAM_COLOR, chessSquareB2.getBackground());
        assertEquals("P", chessSquareB2.getChessPieceSymbol());
    }

    @Test
    void red_bishop_C_1_is_blocked_by_red_pawn_on_F_4() {
        assertEquals(RED_TEAM_COLOR, chessSquareC1.getBackground());
        assertEquals("B", chessSquareC1.getChessPieceSymbol());
        assertEquals(RED_TEAM_COLOR, chessSquareF4.getBackground());
        assertEquals("P", chessSquareF4.getChessPieceSymbol());
    }

    @Test
    void red_bishop_C_1_can_legally_move_to_D_2_while_red_pawn_is_blocking_F_4() {
        assertEquals(RED_TEAM_COLOR, chessSquareC1.getBackground());
        assertEquals("B", chessSquareC1.getChessPieceSymbol());
        assertEquals(LEGAL_MOVE_HIGHLIGHT, chessBoardActual.getChessSquare("D2").getBackground());
    }

    @Test
    void red_bishop_C_1_can_legally_move_to_E_3_while_red_pawn_is_blocking_F_4() {
        assertEquals(RED_TEAM_COLOR, chessSquareC1.getBackground());
        assertEquals("B", chessSquareC1.getChessPieceSymbol());
        assertEquals(LEGAL_MOVE_HIGHLIGHT, chessBoardActual.getChessSquare("E3").getBackground());
    }
}
