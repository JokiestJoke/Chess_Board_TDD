import javax.swing.*;

public class GameFrame extends JFrame {
    private final transient ChessBoard activeChessBoard;

    GameFrame(ChessBoard chessBoard) {
        this.activeChessBoard = chessBoard;
        applyDefaultGameFrameSettings();
    }

    private void applyDefaultGameFrameSettings() {
        this.setTitle("Chess_Final_Project");
        this.add(activeChessBoard.getGameBoardGraphicalUserInterface());
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLocationByPlatform(true);
        this.pack();
        this.setMinimumSize(getSize());
        this.setVisible(true);
    }
}
