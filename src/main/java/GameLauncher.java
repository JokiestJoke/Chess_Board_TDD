import javax.swing.*;

public class GameLauncher {

    public static void main(String[] args) {
        Runnable launcher = () -> {
            ChessBoard activeChessBoard = new ChessBoard();
            GameFrame activeGameFrame = new GameFrame(activeChessBoard);
        };
        SwingUtilities.invokeLater(launcher);
    }
}
