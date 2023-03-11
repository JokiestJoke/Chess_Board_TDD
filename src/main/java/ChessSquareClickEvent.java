import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChessSquareClickEvent implements ActionListener {
    private final ChessBoard chessBoard;

    ChessSquareClickEvent(ChessBoard chessBoard) {
        this.chessBoard = chessBoard;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        ChessSquare chessSquareClicked = (ChessSquare) e.getSource();
        if (chessSquareClicked.isChessSquareOccupied()) {
            ChessPiece currentOccupant = chessSquareClicked.getOccupantsList().get(0);
            currentOccupant.calculateLegalMovesForChessPiece(chessBoard, chessSquareClicked);
        }
    }
}
