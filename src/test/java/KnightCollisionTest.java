import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class KnightCollisionTest {
    private static final Color LEGAL_MOVE_HIGHLIGHT = Color.YELLOW;
    private static final Color RED_TEAM_COLOR = Color.RED;
    Team redTeam = new Team("RED", RED_TEAM_COLOR);
    Knight knightActualB1 = new Knight("B1", redTeam);
    Pawn pawnActualA2 = new Pawn("A2", redTeam);
    Pawn pawnActualB2 = new Pawn("B2", redTeam);
    Pawn pawnActualC3 = new Pawn("C3", redTeam);

    ChessBoard chessBoardActual = new ChessBoard();
    ChessSquare chessSquareA3 = chessBoardActual.getChessSquare("A3");
    ChessSquare chessSquareC3 = chessBoardActual.getChessSquare("C3");
    ChessSquare chessSquareB1 = chessBoardActual.getChessSquare("B1");
    ChessSquare chessSquareD2 = chessBoardActual.getChessSquare("D2");
    GameFrame gameFrameActual = new GameFrame(chessBoardActual);

    @BeforeEach
    public void setUp() {
        chessBoardActual.addChessPieceToBoard(knightActualB1);
        chessBoardActual.addChessPieceToBoard(pawnActualA2);
        chessBoardActual.addChessPieceToBoard(pawnActualB2);
        chessBoardActual.addChessPieceToBoard(pawnActualC3);

        chessSquareB1.doClick();
    }

    @Test
    void red_knight_B_1_is_blocked_by_red_pawn_C_3() {
        assertEquals(RED_TEAM_COLOR, chessSquareB1.getBackground());
        assertEquals("N", chessSquareB1.getChessPieceSymbol());
        assertEquals(RED_TEAM_COLOR, chessSquareC3.getBackground());
        assertEquals("P", chessSquareC3.getChessPieceSymbol());
        assertNotEquals(LEGAL_MOVE_HIGHLIGHT, chessBoardActual.getChessSquare("C2").getBackground());
    }

    @Test
    void red_knight_B_1_can_hop_over_red_pawn_B_2_and_legally_move_to_A_3() {
        assertEquals(RED_TEAM_COLOR, chessSquareB1.getBackground());
        assertEquals("N", chessSquareB1.getChessPieceSymbol());
        assertEquals(LEGAL_MOVE_HIGHLIGHT, chessSquareA3.getBackground());
        assertNotEquals(LEGAL_MOVE_HIGHLIGHT, chessBoardActual.getChessSquare("B3").getBackground());
    }

    @Test
    void red_knight_B_1_can_hop_over_red_pawn_B_2_and_legally_move_to_D_2() {
        assertEquals(RED_TEAM_COLOR, chessSquareB1.getBackground());
        assertEquals("N", chessSquareB1.getChessPieceSymbol());
        assertEquals(LEGAL_MOVE_HIGHLIGHT, chessSquareD2.getBackground());
        assertNotEquals(LEGAL_MOVE_HIGHLIGHT, chessBoardActual.getChessSquare("C2").getBackground());
    }

}
