import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChessSquareClickEvent implements ActionListener {
    private final ChessBoard chessBoard;
    private UserInputTextArea legalMoveTextArea;

    private StringBuilder reportBuilder;

    ChessSquareClickEvent(ChessBoard chessBoard) {
        this.chessBoard = chessBoard;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        ChessSquare chessSquareClicked = (ChessSquare) e.getSource();
        if (chessSquareClicked.isChessSquareOccupied()) {
            ChessPiece currentOccupant = chessSquareClicked.getOccupantsList().get(0);
            currentOccupant.calculateLegalMovesForChessPiece(chessBoard, chessSquareClicked);

            legalMoveTextArea = chessBoard.getUserInputTextArea(2);
            reportBuilder = new StringBuilder("");

            reportBuilder.append("Legal Moves: ").append(currentOccupant.moveReport).append("\n")
                    .append("Legal Captures: ").append(currentOccupant.captureReport);

            legalMoveTextArea.setText(reportBuilder.toString());
        }
    }
}
