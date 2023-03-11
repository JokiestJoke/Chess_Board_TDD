import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RookTest {

    private static final Color LEGAL_MOVE_HIGHLIGHT = Color.YELLOW;
    Team redTeam = new Team("RED", Color.RED);
    ChessBoard chessBoardActual = new ChessBoard();
    GameFrame gameFrame = new GameFrame(chessBoardActual);
    ChessSquare chessSquareActual;
    ChessSquare chessSquareActualA1 = chessBoardActual.getChessSquare("A1");
    ChessSquare chessSquareActualA2 = chessBoardActual.getChessSquare("A2");
    ChessSquare chessSquareActualA3 = chessBoardActual.getChessSquare("A3");
    ChessSquare chessSquareActualA4 = chessBoardActual.getChessSquare("A4");
    ChessSquare chessSquareActualA5 = chessBoardActual.getChessSquare("A5");
    ChessSquare chessSquareActualA6 = chessBoardActual.getChessSquare("A6");
    ChessSquare chessSquareActualA7 = chessBoardActual.getChessSquare("A7");
    ChessSquare chessSquareActualA8 = chessBoardActual.getChessSquare("A8");
    ChessSquare chessSquareActualB1 = chessBoardActual.getChessSquare("B1");
    ChessSquare chessSquareActualB8 = chessBoardActual.getChessSquare("B8");
    ChessSquare chessSquareActualC1 = chessBoardActual.getChessSquare("C1");
    ChessSquare chessSquareActualC8 = chessBoardActual.getChessSquare("C8");
    ChessSquare chessSquareActualD1 = chessBoardActual.getChessSquare("D1");
    ChessSquare chessSquareActualD8 = chessBoardActual.getChessSquare("D8");
    ChessSquare chessSquareActualE1 = chessBoardActual.getChessSquare("E1");
    ChessSquare chessSquareActualE8 = chessBoardActual.getChessSquare("E8");
    ChessSquare chessSquareActualF1 = chessBoardActual.getChessSquare("F1");
    ChessSquare chessSquareActualF8 = chessBoardActual.getChessSquare("F8");
    ChessSquare chessSquareActualG1 = chessBoardActual.getChessSquare("G1");
    ChessSquare chessSquareActualG8 = chessBoardActual.getChessSquare("G8");
    ChessSquare chessSquareActualH1 = chessBoardActual.getChessSquare("H1");
    ChessSquare chessSquareActualH2 = chessBoardActual.getChessSquare("H2");
    ChessSquare chessSquareActualH3 = chessBoardActual.getChessSquare("H3");
    ChessSquare chessSquareActualH4 = chessBoardActual.getChessSquare("H4");
    ChessSquare chessSquareActualH5 = chessBoardActual.getChessSquare("H5");
    ChessSquare chessSquareActualH6 = chessBoardActual.getChessSquare("H6");
    ChessSquare chessSquareActualH7 = chessBoardActual.getChessSquare("H7");
    ChessSquare chessSquareActualH8 = chessBoardActual.getChessSquare("H8");
    Rook rookActualA1 = new Rook("A1", redTeam);
    Rook rookActualH8 = new Rook("H8", redTeam);


    @Test
    void rook_on_A_1_can_legally_move_to_B_1_with_no_blocking_chess_pieces() {
        chessBoardActual.addChessPieceToBoard(rookActualA1);
        chessSquareActualA1.doClick();
        assertEquals(LEGAL_MOVE_HIGHLIGHT, chessSquareActualB1.getBackground());
    }

    @Test
    void rook_on_A_1_can_legally_move_to_C_1_with_no_blocking_chess_pieces() {
        chessBoardActual.addChessPieceToBoard(rookActualA1);
        chessSquareActualA1.doClick();
        assertEquals(LEGAL_MOVE_HIGHLIGHT, chessSquareActualC1.getBackground());
    }

    @Test
    void rook_on_A_1_can_legally_move_to_D_1_with_no_blocking_chess_pieces() {
        chessBoardActual.addChessPieceToBoard(rookActualA1);
        chessSquareActualA1.doClick();
        assertEquals(LEGAL_MOVE_HIGHLIGHT, chessSquareActualD1.getBackground());
    }

    @Test
    void rook_on_A_1_can_legally_move_to_E_1_with_no_blocking_chess_pieces() {
        chessBoardActual.addChessPieceToBoard(rookActualA1);
        chessSquareActualA1.doClick();
        assertEquals(LEGAL_MOVE_HIGHLIGHT, chessSquareActualE1.getBackground());
    }

    @Test
    void rook_on_A_1_can_legally_move_to_F_1_with_no_blocking_chess_pieces() {
        chessBoardActual.addChessPieceToBoard(rookActualA1);
        chessSquareActualA1.doClick();
        assertEquals(LEGAL_MOVE_HIGHLIGHT, chessSquareActualF1.getBackground());
    }

    @Test
    void rook_on_A_1_can_legally_move_to_G_1_with_no_blocking_chess_pieces() {
        chessBoardActual.addChessPieceToBoard(rookActualA1);
        chessSquareActualA1.doClick();
        assertEquals(LEGAL_MOVE_HIGHLIGHT, chessSquareActualG1.getBackground());
    }

    @Test
    void rook_on_A_1_can_legally_move_to_H_1_with_no_blocking_chess_pieces() {
        chessBoardActual.addChessPieceToBoard(rookActualA1);
        chessSquareActualA1.doClick();
        assertEquals(LEGAL_MOVE_HIGHLIGHT, chessSquareActualH1.getBackground());
    }

    @Test
    void rook_on_A_1_can_legally_move_to_A_2_with_no_blocking_chess_pieces() {
        chessBoardActual.addChessPieceToBoard(rookActualA1);
        chessSquareActualA1.doClick();
        assertEquals(LEGAL_MOVE_HIGHLIGHT, chessSquareActualA2.getBackground());
    }

    @Test
    void rook_on_A_1_can_legally_move_to_A_3_with_no_blocking_chess_pieces() {
        chessBoardActual.addChessPieceToBoard(rookActualA1);
        chessSquareActualA1.doClick();
        assertEquals(LEGAL_MOVE_HIGHLIGHT, chessSquareActualA3.getBackground());
    }

    @Test
    void rook_on_A_1_can_legally_move_to_A_4_with_no_blocking_chess_pieces() {
        chessBoardActual.addChessPieceToBoard(rookActualA1);
        chessSquareActualA1.doClick();
        assertEquals(LEGAL_MOVE_HIGHLIGHT, chessSquareActualA4.getBackground());
    }

    @Test
    void rook_on_A_1_can_legally_move_to_A_5_with_no_blocking_chess_pieces() {
        chessBoardActual.addChessPieceToBoard(rookActualA1);
        chessSquareActualA1.doClick();
        assertEquals(LEGAL_MOVE_HIGHLIGHT, chessSquareActualA5.getBackground());
    }

    @Test
    void rook_on_A_1_can_legally_move_to_A_6_with_no_blocking_chess_pieces() {
        chessBoardActual.addChessPieceToBoard(rookActualA1);
        chessSquareActualA1.doClick();
        assertEquals(LEGAL_MOVE_HIGHLIGHT, chessSquareActualA6.getBackground());
    }

    @Test
    void rook_on_A_1_can_legally_move_to_A_7_with_no_blocking_chess_pieces() {
        chessBoardActual.addChessPieceToBoard(rookActualA1);
        chessSquareActualA1.doClick();
        assertEquals(LEGAL_MOVE_HIGHLIGHT, chessSquareActualA7.getBackground());
    }

    @Test
    void rook_on_A_1_can_legally_move_to_A_8_with_no_blocking_chess_pieces() {
        chessBoardActual.addChessPieceToBoard(rookActualA1);
        chessSquareActualA1.doClick();
        assertEquals(LEGAL_MOVE_HIGHLIGHT, chessSquareActualA8.getBackground());
    }

    @Test
    void rook_on_H_8_can_legally_move_to_H_7_with_no_blocking_chess_pieces() {
        chessBoardActual.addChessPieceToBoard(rookActualH8);
        chessSquareActualH8.doClick();
        assertEquals(LEGAL_MOVE_HIGHLIGHT, chessSquareActualH7.getBackground());
    }

    @Test
    void rook_on_H_8_can_legally_move_to_H_6_with_no_blocking_chess_pieces() {
        chessBoardActual.addChessPieceToBoard(rookActualH8);
        chessSquareActualH8.doClick();
        assertEquals(LEGAL_MOVE_HIGHLIGHT, chessSquareActualH6.getBackground());
    }

    @Test
    void rook_on_H_8_can_legally_move_to_H_5_with_no_blocking_chess_pieces() {
        chessBoardActual.addChessPieceToBoard(rookActualH8);
        chessSquareActualH8.doClick();
        assertEquals(LEGAL_MOVE_HIGHLIGHT, chessSquareActualH5.getBackground());
    }

    @Test
    void rook_on_H_8_can_legally_move_to_H_4_with_no_blocking_chess_pieces() {
        chessBoardActual.addChessPieceToBoard(rookActualH8);
        chessSquareActualH8.doClick();
        assertEquals(LEGAL_MOVE_HIGHLIGHT, chessSquareActualH4.getBackground());
    }

    @Test
    void rook_on_H_8_can_legally_move_to_H_3_with_no_blocking_chess_pieces() {
        chessBoardActual.addChessPieceToBoard(rookActualH8);
        chessSquareActualH8.doClick();
        assertEquals(LEGAL_MOVE_HIGHLIGHT, chessSquareActualH3.getBackground());
    }

    @Test
    void rook_on_H_8_can_legally_move_to_H_2_with_no_blocking_chess_pieces() {
        chessBoardActual.addChessPieceToBoard(rookActualH8);
        chessSquareActualH8.doClick();
        assertEquals(LEGAL_MOVE_HIGHLIGHT, chessSquareActualH2.getBackground());
    }

    @Test
    void rook_on_H_8_can_legally_move_to_H_1_with_no_blocking_chess_pieces() {
        chessBoardActual.addChessPieceToBoard(rookActualH8);
        chessSquareActualH8.doClick();
        assertEquals(LEGAL_MOVE_HIGHLIGHT, chessSquareActualH1.getBackground());
    }

    @Test
    void rook_on_H_8_can_legally_move_to_G_8_with_no_blocking_chess_pieces() {
        chessBoardActual.addChessPieceToBoard(rookActualH8);
        chessSquareActualH8.doClick();
        assertEquals(LEGAL_MOVE_HIGHLIGHT, chessSquareActualG8.getBackground());
    }

    @Test
    void rook_on_H_8_can_legally_move_to_F_8_with_no_blocking_chess_pieces() {
        chessBoardActual.addChessPieceToBoard(rookActualH8);
        chessSquareActualH8.doClick();
        assertEquals(LEGAL_MOVE_HIGHLIGHT, chessSquareActualF8.getBackground());
    }

    @Test
    void rook_on_H_8_can_legally_move_to_E_8_with_no_blocking_chess_pieces() {
        chessBoardActual.addChessPieceToBoard(rookActualH8);
        chessSquareActualH8.doClick();
        assertEquals(LEGAL_MOVE_HIGHLIGHT, chessSquareActualE8.getBackground());
    }

    @Test
    void rook_on_H_8_can_legally_move_to_D_8_with_no_blocking_chess_pieces() {
        chessBoardActual.addChessPieceToBoard(rookActualH8);
        chessSquareActualH8.doClick();
        assertEquals(LEGAL_MOVE_HIGHLIGHT, chessSquareActualD8.getBackground());
    }

    @Test
    void rook_on_H_8_can_legally_move_to_C_8_with_no_blocking_chess_pieces() {
        chessBoardActual.addChessPieceToBoard(rookActualH8);
        chessSquareActualH8.doClick();
        assertEquals(LEGAL_MOVE_HIGHLIGHT, chessSquareActualC8.getBackground());
    }

    @Test
    void rook_on_H_8_can_legally_move_to_B_8_with_no_blocking_chess_pieces() {
        chessBoardActual.addChessPieceToBoard(rookActualH8);
        chessSquareActualH8.doClick();
        assertEquals(LEGAL_MOVE_HIGHLIGHT, chessSquareActualB8.getBackground());
    }

    @Test
    void rook_on_H_8_can_legally_move_to_A_8_with_no_blocking_chess_pieces() {
        chessBoardActual.addChessPieceToBoard(rookActualH8);
        chessSquareActualH8.doClick();
        chessSquareActual = chessBoardActual.getChessSquare("A8");
        assertEquals(LEGAL_MOVE_HIGHLIGHT, chessSquareActualA8.getBackground());
    }


}
