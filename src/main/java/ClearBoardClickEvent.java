import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClearBoardClickEvent implements ActionListener {
    private final ChessBoard chessBoard;

    ClearBoardClickEvent(ChessBoard chessBoard) {
        this.chessBoard = chessBoard;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        chessBoard.clearActiveChessBoard();
    }
}
