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

    @Override
    public void actionPerformed(ActionEvent e) {
        String redTeamBoardConfiguration = chessBoard.getUserInputTextArea(0).getText().toUpperCase().trim();
        String blueTeamBoardConfiguration = chessBoard.getUserInputTextArea(1).getText().toUpperCase().trim();
        createChessBoardConfiguration(redTeamBoardConfiguration, redTeam);
        createChessBoardConfiguration(blueTeamBoardConfiguration, blueTeam);
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
