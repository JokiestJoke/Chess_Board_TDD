import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ChessSquareUITest {

    Team redTeam = new Team("RED", Color.RED);
    Pawn pawnActual = new Pawn("A1", redTeam);
    ChessBoard chessBoardActual = new ChessBoard();
    GameFrame gameFrameActual = new GameFrame(chessBoardActual);
    ChessSquare chessSquareActualA1 = chessBoardActual.getChessSquare("A1");

    @BeforeEach
    public void setUp() {
        chessBoardActual.addChessPieceToBoard(pawnActual);
    }

    @Test
    void adding_pawn_to_chess_square_A_1_occupies_row() {
        assertTrue(chessSquareActualA1.isChessSquareOccupied());
    }


    @Test
    void adding_pawn_to_chess_square_A_1_has_correct_symbol() {
        assertEquals("P", chessSquareActualA1.getChessPieceSymbol());
    }

    @Test
    void adding_pawn_increases_occupancy_count_for_chess_square_A_1() {
        assertEquals(1, chessSquareActualA1.getOccupantsList().size());
    }

    @Test
    void adding_pawn_correctly_assigns_team_ownership_of_A_1() {
        assertEquals("RED", chessSquareActualA1.getOwner().getTeamName());
    }

    @Test
    void adding_pawn_to_chess_square_A_1_updates_team_pawn_total() {
        assertEquals(1, redTeam.getTotalNumberOfPawns());
    }

    @Test
    void adding_pawn_to_chess_square_A_1_updates_color_of_chess_square() {
        assertEquals(Color.RED, chessSquareActualA1.getBackground());
    }

    @Test
    void adding_pawn_to_chess_square_A_1_sets_text_color_of_square_to_white() {
        assertEquals(Color.WHITE, chessSquareActualA1.getForeground());
    }

    @Test
    void adding_pawn_to_chess_square_A_1_applies_the_correct_text_settings() {
        Font actual = chessSquareActualA1.getFont();
        assertEquals("Arial", actual.getFamily());
        assertEquals(1, actual.getStyle());
        assertEquals(12, actual.getSize());
    }
}
