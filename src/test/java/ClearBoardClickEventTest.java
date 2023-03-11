import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.swing.*;
import java.awt.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClearBoardClickEventTest {

    private static final Color WHITE = Color.WHITE;
    private static final Color BLACK = Color.BLACK;
    private static final Color RED_TEAM_COLOR = Color.RED;

    Team redTeam = new Team("RED", RED_TEAM_COLOR);
    King kingActualE1 = new King("E1", redTeam);
    Pawn pawnActualC2 = new Pawn("C2", redTeam);
    Pawn pawnActualD2 = new Pawn("D2", redTeam);
    Pawn pawnActualE2 = new Pawn("E2", redTeam);

    ChessBoard chessBoardActual = new ChessBoard();
    ChessSquare chessSquareActualE1 = chessBoardActual.getChessSquare("E1");
    ChessSquare chessSquareActualE2 = chessBoardActual.getChessSquare("E2");
    ChessSquare chessSquareActualC2 = chessBoardActual.getChessSquare("C2");
    ChessSquare chessSquareActualD2 = chessBoardActual.getChessSquare("D2");

    GameFrame gameFrameActual = new GameFrame(chessBoardActual);

    JButton clearBoardButton = chessBoardActual.getGraphicalUserInterfaceButton(1);

    @BeforeEach
    public void setUp() {
        chessBoardActual.addChessPieceToBoard(kingActualE1);
        chessBoardActual.addChessPieceToBoard(pawnActualE2);
        chessBoardActual.addChessPieceToBoard(pawnActualC2);
        chessBoardActual.addChessPieceToBoard(pawnActualD2);

        clearBoardButton.doClick();

    }

    @Test
    void clear_board_click_event_clears_board_of_red_king_on_chess_square_E_1() {
        assertEquals(WHITE, chessSquareActualE1.getBackground());
        assertEquals(0, chessSquareActualE1.getOccupantsList().size());
    }

    @Test
    void clear_board_click_event_clears_board_of_red_pawn_on_chess_square_E_2() {
        assertEquals(BLACK, chessSquareActualE2.getBackground());
        assertEquals(0, chessSquareActualE2.getOccupantsList().size());
    }

    @Test
    void clear_board_click_event_clears_board_of_red_pawn_on_chess_square_C_2() {
        assertEquals(BLACK, chessSquareActualC2.getBackground());
        assertEquals(0, chessSquareActualC2.getOccupantsList().size());
    }

    @Test
    void clear_board_click_event_clears_board_of_red_pawn_on_chess_square_D_2() {
        assertEquals(WHITE, chessSquareActualD2.getBackground());
        assertEquals(0, chessSquareActualD2.getOccupantsList().size());
    }


}
