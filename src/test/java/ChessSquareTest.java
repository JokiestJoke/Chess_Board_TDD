import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChessSquareTest {

    ChessBoard chessBoardActual = new ChessBoard();
    ChessSquare chessSquareActualA1 = chessBoardActual.getChessSquare("A1");
    ChessSquare chessSquareActualB1 = chessBoardActual.getChessSquare("B1");
    ChessSquare chessSquareActualH2 = chessBoardActual.getChessSquare("H2");
    ChessSquare chessSquareActualH8 = chessBoardActual.getChessSquare("H8");
    ChessSquare chessSquareActualB8 = chessBoardActual.getChessSquare("B8");

    @Test
    void chess_square_A_1_has_correct_row_location_on_creation() {
        String actual = chessSquareActualA1.getRowLocation();
        assertEquals("A", actual);
    }

    @Test
    void chess_square_A_1_has_correct_column_location_on_creation() {
        int actual = chessSquareActualA1.getColumnLocation();
        assertEquals(1, actual);
    }

    @Test
    void chess_square_A_1_is_not_a_special_starting_square() {
        assertFalse(chessSquareActualA1.isChessSquareAStartPosition());
    }

    @Test
    void chess_square_A_1_is_a_special_north_end_of_board_square() {
        assertTrue(chessSquareActualA1.isChessSquareNorthEndOfBoard());
    }

    @Test
    void chess_square_A_1_is_a_special_west_end_of_board_square() {
        assertTrue(chessSquareActualA1.isChessSquareWestEndOfBoard());
    }

    @Test
    void chess_square_G_8_is_not_a_special_starting_square() {
        ChessSquare G8 = chessBoardActual.getChessSquare("G8");
        assertFalse(G8.isChessSquareAStartPosition());
    }

    @Test
    void chess_square_A_2_is_a_special_starting_square() {
        ChessSquare A2 = chessBoardActual.getChessSquare("A2");
        assertTrue(A2.isChessSquareAStartPosition());
    }

    @Test
    void chess_square_G_7_is_a_special_starting_square() {
        ChessSquare G7 = chessBoardActual.getChessSquare("G7");
        assertTrue(G7.isChessSquareAStartPosition());
    }

    @Test
    void chess_square_B_1_is_a_special_north_end_of_board_square() {
        assertTrue(chessSquareActualB1.isChessSquareNorthEndOfBoard());
    }

    @Test
    void chess_square_B_8_is_a_special_south_end_of_board_square() {
        assertTrue(chessSquareActualB8.isChessSquareSouthEndOfBoard());
    }

    @Test
    void chess_square_H_8_is_a_special_east_end_of_board_square() {
        assertTrue(chessSquareActualH8.isChessSquareEastEndOfBoard());
    }

    @Test
    void chess_square_H_8_is_a_special_south_end_of_board_square() {
        assertTrue(chessSquareActualH8.isChessSquareSouthEndOfBoard());
    }

    @Test
    void chess_square_H_2_is_a_special_east_end_of_board_square() {
        assertTrue(chessSquareActualH2.isChessSquareEastEndOfBoard());
    }
}
