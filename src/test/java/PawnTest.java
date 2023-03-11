import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PawnTest {
    private static final Color LEGAL_MOVE_HIGHLIGHT = Color.YELLOW;
    Team redTeam = new Team("RED", Color.RED);
    Pawn pawnActualB3 = new Pawn("B3", redTeam);
    Pawn pawnActualB4 = new Pawn("B4", redTeam);
    Pawn pawnActualB5 = new Pawn("B5", redTeam);
    Pawn pawnActualE3 = new Pawn("E3", redTeam);
    Pawn pawnActualB6 = new Pawn("B6", redTeam);

    ChessBoard chessBoardActual = new ChessBoard();
    GameFrame gameFrameActual = new GameFrame(chessBoardActual);
    ChessSquare chessSquareActualB3 = chessBoardActual.getChessSquare("B3");
    ChessSquare chessSquareActualB4 = chessBoardActual.getChessSquare("B4");
    ChessSquare chessSquareActualB5 = chessBoardActual.getChessSquare("B5");
    ChessSquare chessSquareActualB6 = chessBoardActual.getChessSquare("B6");
    ChessSquare chessSquareActualE3 = chessBoardActual.getChessSquare("E3");
    ChessSquare chessSquareActualE4 = chessBoardActual.getChessSquare("E4");

    @Test
    void pawn_on_B_3_can_legally_move_to_B4_with_no_blocking_chess_pieces() {
        chessBoardActual.addChessPieceToBoard(pawnActualB3);
        chessSquareActualB3.doClick();

        assertEquals(LEGAL_MOVE_HIGHLIGHT, chessSquareActualB4.getBackground());
    }

    @Test
    void pawn_on_E_3_can_legally_move_to_E_4_with_no_blocking_chess_pieces() {
        chessBoardActual.addChessPieceToBoard(pawnActualE3);
        chessSquareActualE3.doClick();

        assertEquals(LEGAL_MOVE_HIGHLIGHT, chessSquareActualE4.getBackground());
    }

    @Test
    void pawn_on_B_6_can_legally_move_to_B_5_with_no_blocking_chess_pieces() {
        chessBoardActual.addChessPieceToBoard(pawnActualB6);
        chessSquareActualB6.doClick();

        assertEquals(LEGAL_MOVE_HIGHLIGHT, chessSquareActualB5.getBackground());
    }

    @Test
    void pawn_on_B_4_can_legally_move_to_B_5_with_no_blocking_chess_pieces() {
        chessBoardActual.addChessPieceToBoard(pawnActualB4);
        chessSquareActualB4.doClick();

        assertEquals(LEGAL_MOVE_HIGHLIGHT, chessSquareActualB5.getBackground());
    }

    @Test
    void pawn_on_B_5_can_legally_move_to_B_4_with_no_blocking_chess_pieces() {
        chessBoardActual.addChessPieceToBoard(pawnActualB5);
        chessSquareActualB5.doClick();

        assertEquals(LEGAL_MOVE_HIGHLIGHT, chessSquareActualB4.getBackground());
    }

}
