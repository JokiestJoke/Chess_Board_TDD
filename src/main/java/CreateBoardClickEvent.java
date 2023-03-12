import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CreateBoardClickEvent implements ActionListener {
    private final ChessBoard chessBoard;

    private final Team redTeam = new Team("RED", Color.RED);
    private final Team blueTeam = new Team("BLUE", Color.BLUE);

    CreateBoardClickEvent(ChessBoard chessBoard) {
        this.chessBoard = chessBoard;
    }

    private static final String DEFAULT_RED_TEAM_STRING = "INPUT RED TEAM'S BOARD CONFIGURATION HERE";

    private static final String DEFAULT_BLUE_TEAM_STRING = "INPUT BLUE TEAM'S BOARD CONFIGURATION HERE";

    @Override
    public void actionPerformed(ActionEvent e) {
        String redTeamBoardConfiguration = chessBoard.getUserTextArea(0).getText().toUpperCase().trim();
        String blueTeamBoardConfiguration = chessBoard.getUserTextArea(1).getText().toUpperCase().trim();

        isValidBoardConfiguration(redTeamBoardConfiguration, DEFAULT_RED_TEAM_STRING, redTeam);
        isValidBoardConfiguration(blueTeamBoardConfiguration, DEFAULT_BLUE_TEAM_STRING, blueTeam);
    }

    private void isValidBoardConfiguration(String targetConfigurationString, String shouldNotEqualString, Team team) {
        if (!targetConfigurationString.equals(shouldNotEqualString) && !targetConfigurationString.isEmpty()) {
            System.out.println(targetConfigurationString);
            createChessBoardConfiguration(targetConfigurationString, redTeam);
        }
    }


    private void createChessBoardConfiguration(String boardConfiguration, Team team) {
        String[] chessPieces = boardConfiguration.split(" ");
        for (String chessPiece : chessPieces) {
            createRequestedChessPiece(chessPiece, team);
        }
    }

    private void createRequestedChessPiece(String chessPiece, Team team) {
        String location = chessPiece.substring(1);
        String chessPieceSymbol = chessPiece.substring(0, 1);
        switch (chessPieceSymbol) {
            case "P":
                chessBoard.addChessPieceToBoard(new Pawn(location, team));
                break;
            case "R":
                chessBoard.addChessPieceToBoard(new Rook(location, team));
                break;
            case "N":
                chessBoard.addChessPieceToBoard(new Knight(location, team));
                break;
            case "B":
                chessBoard.addChessPieceToBoard(new Bishop(location, team));
                break;
            case "Q":
                chessBoard.addChessPieceToBoard(new Queen(location, team));
                break;
            case "K":
                chessBoard.addChessPieceToBoard(new King(location, team));
                break;
            default:
                throw new IllegalArgumentException("Error creating Chess Piece. Please only use the format ### (I.E. KB1 or NA2)");
        }
    }
}
