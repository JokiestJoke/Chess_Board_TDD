import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

class KingCollisionTest {
    private static final Color LEGAL_MOVE_HIGHLIGHT = Color.YELLOW;
    private static final Color RED_TEAM_COLOR = Color.RED;
    Team redTeam = new Team("RED", RED_TEAM_COLOR);
    King kingActualE1 = new King("E1", redTeam);
    Pawn pawnActualC2 = new Pawn("C2", redTeam);
    Pawn pawnActualD2 = new Pawn("D2", redTeam);
    Pawn pawnActualE2 = new Pawn("E2", redTeam);
    Pawn pawnActualF3 = new Pawn("F3", redTeam);
    Bishop bishopActualF1 = new Bishop("F1", redTeam);
    Bishop bishopActualC1 = new Bishop("C1", redTeam);
    ChessBoard chessBoardActual = new ChessBoard();
    ChessSquare chessSquareE1 = chessBoardActual.getChessSquare("E1");
    ChessSquare chessSquareE2 = chessBoardActual.getChessSquare("E2");
    ChessSquare chessSquareD1 = chessBoardActual.getChessSquare("D1");
    ChessSquare chessSquareD2 = chessBoardActual.getChessSquare("D2");
    ChessSquare chessSquareF2 = chessBoardActual.getChessSquare("F2");
    GameFrame gameFrameActual = new GameFrame(chessBoardActual);

    @BeforeEach
    public void setUp() {
        chessBoardActual.addChessPieceToBoard(kingActualE1);
        chessBoardActual.addChessPieceToBoard(pawnActualC2);
        chessBoardActual.addChessPieceToBoard(pawnActualD2);
        chessBoardActual.addChessPieceToBoard(pawnActualE2);
        chessBoardActual.addChessPieceToBoard(pawnActualF3);

        chessBoardActual.addChessPieceToBoard(bishopActualF1);
        chessBoardActual.addChessPieceToBoard(bishopActualC1);

        chessSquareE1.doClick();
    }

    @Test
    void red_king_on_E_1_is_blocked_by_red_pawn_E_2() {
        assertEquals(RED_TEAM_COLOR, chessSquareE1.getBackground());
        assertEquals("K", chessSquareE1.getChessPieceSymbol());
        assertEquals(RED_TEAM_COLOR, chessSquareE2.getBackground());
        assertEquals("P", chessSquareE2.getChessPieceSymbol());
    }

    @Test
    void red_king_on_E_1_is_blocked_by_red_pawn_D_2() {
        assertEquals(RED_TEAM_COLOR, chessSquareE1.getBackground());
        assertEquals("K", chessSquareE1.getChessPieceSymbol());
        assertEquals(RED_TEAM_COLOR, chessSquareD2.getBackground());
        assertEquals("P", chessSquareD2.getChessPieceSymbol());
    }

    @Test
    void red_king_on_E_1_can_legally_move_to_D_1() {
        assertEquals(RED_TEAM_COLOR, chessSquareE1.getBackground());
        assertEquals("K", chessSquareE1.getChessPieceSymbol());
        assertFalse(chessSquareD1.isChessSquareOccupied());
        assertEquals(LEGAL_MOVE_HIGHLIGHT, chessSquareD1.getBackground());
    }

    @Test
    void red_king_on_E_1_can_legally_move_to_F_2() {
        assertEquals(RED_TEAM_COLOR, chessSquareE1.getBackground());
        assertEquals("K", chessSquareE1.getChessPieceSymbol());
        assertFalse(chessSquareF2.isChessSquareOccupied());
        assertEquals(LEGAL_MOVE_HIGHLIGHT, chessSquareF2.getBackground());
    }


}
