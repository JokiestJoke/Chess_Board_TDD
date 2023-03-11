import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PawnCollisionTest {
    private static final Color RED_TEAM_COLOR = Color.RED;
    private static final Color BLUE_TEAM_COLOR = Color.BLUE;
    Team redTeam = new Team("RED", RED_TEAM_COLOR);
    Team blueTeam = new Team("BLUE", BLUE_TEAM_COLOR);
    ChessBoard chessBoardActual = new ChessBoard();
    GameFrame gameFrameActual = new GameFrame(chessBoardActual);
    Pawn pawnActualC3Red = new Pawn("C3", redTeam);
    Pawn pawnActualH3Red = new Pawn("H3", redTeam);
    Pawn pawnActualA6Red = new Pawn("A6", redTeam);
    Pawn pawnActualA7Blue = new Pawn("A7", blueTeam);
    Pawn pawnActualH4Blue = new Pawn("H4", blueTeam);
    Pawn pawnActualC4Blue = new Pawn("C4", blueTeam);
    Rook rookActualC4Red = new Rook("C4", redTeam);
    Rook rookActualC4Blue = new Rook("C4", blueTeam);
    Bishop bishopActualC4Red = new Bishop("C4", redTeam);
    Bishop bishopActualC4Blue = new Bishop("C4", blueTeam);
    ChessSquare chessSquareActualC3 = chessBoardActual.getChessSquare("C3");
    ChessSquare chessSquareActualC4 = chessBoardActual.getChessSquare("C4");
    ChessSquare chessSquareActualH3 = chessBoardActual.getChessSquare("H3");
    ChessSquare chessSquareActualH4 = chessBoardActual.getChessSquare("H4");
    ChessSquare chessSquareActualA6 = chessBoardActual.getChessSquare("A6");
    ChessSquare chessSquareActualA7 = chessBoardActual.getChessSquare("A7");


    @Test
    void red_pawn_on_C_3_is_blocked_by_blue_pawn_on_C_4() {
        chessBoardActual.addChessPieceToBoard(pawnActualC3Red);
        chessBoardActual.addChessPieceToBoard(pawnActualC4Blue);
        chessSquareActualC3.doClick();

        assertEquals(RED_TEAM_COLOR, chessSquareActualC3.getBackground());
        assertEquals(BLUE_TEAM_COLOR, chessSquareActualC4.getBackground());
    }

    @Test
    void blue_pawn_on_C_4_is_blocked_by_red_pawn_on_C_3() {
        chessBoardActual.addChessPieceToBoard(pawnActualC3Red);
        chessBoardActual.addChessPieceToBoard(pawnActualC4Blue);
        chessSquareActualC4.doClick();

        assertEquals(BLUE_TEAM_COLOR, chessSquareActualC4.getBackground());
        assertEquals(RED_TEAM_COLOR, chessSquareActualC3.getBackground());
    }

    @Test
    void red_pawn_on_H_3_is_blocked_by_blue_pawn_on_H_4() {
        chessBoardActual.addChessPieceToBoard(pawnActualH3Red);
        chessBoardActual.addChessPieceToBoard(pawnActualH4Blue);
        chessSquareActualH3.doClick();

        assertEquals(RED_TEAM_COLOR, chessSquareActualH3.getBackground());
        assertEquals(BLUE_TEAM_COLOR, chessSquareActualH4.getBackground());
    }

    @Test
    void blue_pawn_on_H_4_is_blocked_by_red_pawn_on_H_3() {
        chessBoardActual.addChessPieceToBoard(pawnActualH4Blue);
        chessBoardActual.addChessPieceToBoard(pawnActualH3Red);

        chessSquareActualH4.doClick();

        assertEquals(RED_TEAM_COLOR, chessSquareActualH3.getBackground());
        assertEquals(BLUE_TEAM_COLOR, chessSquareActualH4.getBackground());
    }

    @Test
    void red_pawn_on_A_6_is_blocked_by_blue_pawn_on_A_7() {
        chessBoardActual.addChessPieceToBoard(pawnActualA6Red);
        chessBoardActual.addChessPieceToBoard(pawnActualA7Blue);
        chessSquareActualA6.doClick();

        assertEquals(RED_TEAM_COLOR, chessSquareActualA6.getBackground());
        assertEquals(BLUE_TEAM_COLOR, chessSquareActualA7.getBackground());
    }

    @Test
    void blue_pawn_on_A_7_is_blocked_by_blue_pawn_on_A_6() {
        chessBoardActual.addChessPieceToBoard(pawnActualA7Blue);
        chessBoardActual.addChessPieceToBoard(pawnActualA6Red);
        chessSquareActualA7.doClick();

        assertEquals(RED_TEAM_COLOR, chessSquareActualA6.getBackground());
        assertEquals(BLUE_TEAM_COLOR, chessSquareActualA7.getBackground());
    }


    @Test
    void red_pawn_on_C_3_is_blocked_by_red_rook_on_C_4() {
        chessBoardActual.addChessPieceToBoard(pawnActualC3Red);
        chessBoardActual.addChessPieceToBoard(rookActualC4Red);
        chessSquareActualC3.doClick();

        assertEquals(RED_TEAM_COLOR, chessSquareActualC3.getBackground());
        assertEquals(RED_TEAM_COLOR, chessSquareActualC4.getBackground());
    }

    @Test
    void red_pawn_on_C_3_is_blocked_by_blue_rook_on_C_4() {
        chessBoardActual.addChessPieceToBoard(pawnActualC3Red);
        chessBoardActual.addChessPieceToBoard(rookActualC4Blue);
        chessSquareActualC3.doClick();

        assertEquals(RED_TEAM_COLOR, chessSquareActualC3.getBackground());
        assertEquals(BLUE_TEAM_COLOR, chessSquareActualC4.getBackground());
    }

    @Test
    void red_pawn_on_C_3_is_blocked_by_red_bishop_on_C_4() {
        chessBoardActual.addChessPieceToBoard(pawnActualC3Red);
        chessBoardActual.addChessPieceToBoard(bishopActualC4Red);
        chessSquareActualC3.doClick();

        assertEquals(RED_TEAM_COLOR, chessSquareActualC3.getBackground());
        assertEquals(RED_TEAM_COLOR, chessSquareActualC4.getBackground());
    }

    @Test
    void red_pawn_on_C_3_is_blocked_by_blue_bishop_on_C_4() {
        chessBoardActual.addChessPieceToBoard(pawnActualC3Red);
        chessBoardActual.addChessPieceToBoard(bishopActualC4Blue);
        chessSquareActualC3.doClick();

        assertEquals(RED_TEAM_COLOR, chessSquareActualC3.getBackground());
        assertEquals(BLUE_TEAM_COLOR, chessSquareActualC4.getBackground());
    }


}
