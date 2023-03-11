import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ChessPieceTest {
    Team redTeam = new Team("RED", Color.RED);
    ChessPiece pawnActual = new Pawn("A1", redTeam);

    @Test
    void chess_piece_has_correct_location_string_on_creation() {
        assertEquals("A1", pawnActual.getLocationString());
    }

    @Test
    void chess_piece_has_correct_row_location_on_creation() {
        assertEquals("A", pawnActual.getRowLocation());
    }

    @Test
    void chess_piece_has_correct_column_location_on_creation() {
        assertEquals(1, pawnActual.getColumnLocation());
    }

    @Test
    void chess_piece_has_correct_name_when_created() {
        assertEquals("PAWN", pawnActual.getChessPieceName());
    }

    @Test
    void chess_piece_has_correct_team_when_created() {
        assertEquals("RED", pawnActual.getTeam().getTeamName());
    }

}
