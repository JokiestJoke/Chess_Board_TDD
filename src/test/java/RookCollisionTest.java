import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RookCollisionTest {
    private static final Color RED_TEAM_COLOR = Color.RED;
    private static final Color LEGAL_MOVE_HIGHLIGHT = Color.YELLOW;
    Team redTeam = new Team("RED", RED_TEAM_COLOR);
    Rook rookActualA1Red = new Rook("A1", redTeam);
    Rook rookActualD1Red = new Rook("D1", redTeam);
    Pawn pawnActualA2Red = new Pawn("A2", redTeam);
    Knight knightActualB1Red = new Knight("B1", redTeam);
    ChessBoard chessBoardActual = new ChessBoard();
    GameFrame gameFrameActual = new GameFrame(chessBoardActual);

    ChessSquare chessSquareActualA1 = chessBoardActual.getChessSquare("A1");
    ChessSquare chessSquareActualA2 = chessBoardActual.getChessSquare("A2");
    ChessSquare chessSquareActualB1 = chessBoardActual.getChessSquare("B1");
    ChessSquare chessSquareActualD1 = chessBoardActual.getChessSquare("D1");
    ChessSquare chessSquareActualD2 = chessBoardActual.getChessSquare("D2");
    ChessSquare chessSquareActualC1 = chessBoardActual.getChessSquare("C1");
    ChessSquare chessSquareActualE1 = chessBoardActual.getChessSquare("E1");

    @Test
    void red_rook_A_1_is_blocked_vertically_by_red_pawn_on_A_2_but_can_move_horizontally() {
        createBoardCollisionScenarioOne();
        chessSquareActualA1.doClick();
        assertEquals(RED_TEAM_COLOR, chessSquareActualA1.getBackground());
        assertEquals(RED_TEAM_COLOR, chessSquareActualA2.getBackground());
        assertEquals(LEGAL_MOVE_HIGHLIGHT, chessSquareActualB1.getBackground());
    }

    @Test
    void red_rook_A_1_is_blocked_vertically_by_red_pawn_on_A_2_and_horizontally_by_red_knight_on_B_1() {
        createBoardCollisionScenarioTwo();
        chessSquareActualA1.doClick();
        assertEquals(RED_TEAM_COLOR, chessSquareActualA1.getBackground());
        assertEquals(RED_TEAM_COLOR, chessSquareActualA2.getBackground());
        assertEquals(RED_TEAM_COLOR, chessSquareActualB1.getBackground());
    }

    @Test
    void red_rook_D_1_is_blocked_vertically_by_a_full_board_of_red_pawns_but_can_move_horizontally() {
        createBoardCollisionScenarioThree();
        chessSquareActualD1.doClick();
        assertEquals(RED_TEAM_COLOR, chessSquareActualD2.getBackground());
        assertEquals(LEGAL_MOVE_HIGHLIGHT, chessSquareActualC1.getBackground());
        assertEquals(LEGAL_MOVE_HIGHLIGHT, chessSquareActualE1.getBackground());
    }

    private void createBoardCollisionScenarioOne() {
        chessBoardActual.addChessPieceToBoard(rookActualA1Red);
        chessBoardActual.addChessPieceToBoard(pawnActualA2Red);
    }

    private void createBoardCollisionScenarioTwo() {
        chessBoardActual.addChessPieceToBoard(rookActualA1Red);
        chessBoardActual.addChessPieceToBoard(pawnActualA2Red);
        chessBoardActual.addChessPieceToBoard(knightActualB1Red);
    }

    private void createBoardCollisionScenarioThree() {
        chessBoardActual.addChessPieceToBoard(rookActualD1Red);
        chessBoardActual.addChessPieceToBoard(new Pawn("A2", redTeam));
        chessBoardActual.addChessPieceToBoard(new Pawn("B2", redTeam));
        chessBoardActual.addChessPieceToBoard(new Pawn("C2", redTeam));
        chessBoardActual.addChessPieceToBoard(new Pawn("D2", redTeam));
        chessBoardActual.addChessPieceToBoard(new Pawn("E2", redTeam));
        chessBoardActual.addChessPieceToBoard(new Pawn("F2", redTeam));
        chessBoardActual.addChessPieceToBoard(new Pawn("G2", redTeam));
        chessBoardActual.addChessPieceToBoard(new Pawn("H2", redTeam));
    }


}
