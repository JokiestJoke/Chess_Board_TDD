import org.junit.jupiter.api.Test;

import javax.swing.*;
import java.awt.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ChessBoardTest {

    private final ChessBoard chessboard = new ChessBoard();
    private final JComponent chessBoardGUI = chessboard.getGameBoardGraphicalUserInterface();
    Insets insetActual = chessBoardGUI.getInsets();


    @Test
    void game_board_GUI_top_inset_is_five() {
        assertEquals(5, insetActual.top);
    }

    @Test
    void game_board_GUI_right_inset_is_five() {
        assertEquals(5, insetActual.right);
    }

    @Test
    void game_board_GUI_bottom_inset_is_five() {
        assertEquals(5, insetActual.bottom);
    }

    @Test
    void game_board_GUI_left_inset_is_five() {
        assertEquals(5, insetActual.left);
    }

    @Test
    void game_board_has_sixty_four_JButton_Squares() {
        JButton[][] buttonSquares = chessboard.getJButtonSquares();
        int rowLength = buttonSquares.length;
        int columnLength = buttonSquares[0].length;
        int actual = rowLength * columnLength;
        assertEquals(64, actual);
    }
}
