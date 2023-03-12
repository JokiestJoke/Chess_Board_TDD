import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class ChessSquare extends JButton {
    private final String rowLocation;
    private static final String VALID_CHARACTERS = "ABCDEFGH";
    private final int columnLocation;
    private boolean isOccupiedByChessPiece;
    private boolean isChessSquareAStartPosition = false;
    private boolean isChessSquareNorthEndOfBoard = false;
    private boolean isChessSquareEastEndOfBoard = false;
    private boolean isChessSquareSouthEndOfBoard = false;
    private boolean isChessSquareWestEndOfBoard = false;
    private transient Team owner;
    private final ArrayList<ChessPiece> occupants = new ArrayList<>();
    private Color chessSquareDefaultColor = Color.WHITE;

    ChessSquare(String rowLocation, int columnLocation) {
        this.rowLocation = rowLocation;
        this.columnLocation = columnLocation;
        isOccupiedByChessPiece = false;
        checkIfChessSquareIsStartPosition(columnLocation);
        checkIfChessSquareIsAnEndSquare(rowLocation, columnLocation);
    }

    public void addChessPieceOccupantToSquare(ChessPiece chessPiece) {
        if (occupants.isEmpty()) {
            attachChessPieceToSquare(chessPiece);
        } else {
            occupants.clear();
            attachChessPieceToSquare(chessPiece);
        }

    }

    public String getRowLocation() {
        return rowLocation;
    }

    public ArrayList<ChessPiece> getOccupantsList() {
        return occupants;
    }

    public int getColumnLocation() {
        return columnLocation;
    }

    public Team getOwner() {
        return owner;
    }

    public String getChessPieceSymbol() {
        return this.getText();
    }

    public boolean isChessSquareOccupied() {
        return isOccupiedByChessPiece;
    }

    public boolean isChessSquareAStartPosition() {
        return isChessSquareAStartPosition;
    }

    public boolean isChessSquareSouthEndOfBoard() {
        return isChessSquareSouthEndOfBoard;
    }

    public boolean isChessSquareNorthEndOfBoard() {
        return isChessSquareNorthEndOfBoard;
    }

    public boolean isChessSquareEastEndOfBoard() {
        return isChessSquareEastEndOfBoard;
    }

    public boolean isChessSquareWestEndOfBoard() {
        return isChessSquareWestEndOfBoard;
    }

    public void setChessSquareDefaultColor(Color color) {
        chessSquareDefaultColor = color;
    }

    public void restoreOriginalChessSquareColor() {
        this.setBackground(chessSquareDefaultColor);
    }

    public ChessSquare getChessSquareAboveCurrentChessSquare(ChessBoard chessBoard) {
        String location = rowLocation + (columnLocation - 1);
        return chessBoard.getChessSquare(location);
    }

    public ChessSquare getChessSquareBelowCurrentChessSquare(ChessBoard chessBoard) {
        String location = rowLocation + (columnLocation + 1);
        return chessBoard.getChessSquare(location);
    }

    public ChessSquare getChessSquareRightOfCurrentChessSquare(ChessBoard chessBoard) {
        int indexOfCurrentRow = VALID_CHARACTERS.indexOf(rowLocation) + 1;
        String location = String.valueOf(VALID_CHARACTERS.charAt(indexOfCurrentRow)) + (columnLocation);
        return chessBoard.getChessSquare(location);
    }

    public ChessSquare getChessSquareLeftOfCurrentChessSquare(ChessBoard chessBoard) {
        int indexOfCurrentRow = VALID_CHARACTERS.indexOf(rowLocation) - 1;
        String location = String.valueOf(VALID_CHARACTERS.charAt(indexOfCurrentRow)) + (columnLocation);
        return chessBoard.getChessSquare(location);
    }

    public ChessSquare getChessSquareDiagonalTopLeftOfCurrentChessSquare(ChessBoard chessBoard) {
        int indexOfCurrentRow = VALID_CHARACTERS.indexOf(rowLocation);
        String location = String.valueOf(VALID_CHARACTERS.charAt(indexOfCurrentRow - 1)) + (columnLocation - 1);
        return chessBoard.getChessSquare(location);
    }

    public ChessSquare getChessSquareDiagonalBottomRightOfCurrentChessSquare(ChessBoard chessBoard) {
        int indexOfCurrentRow = VALID_CHARACTERS.indexOf(rowLocation);
        String location = String.valueOf(VALID_CHARACTERS.charAt(indexOfCurrentRow + 1)) + (columnLocation + 1);
        return chessBoard.getChessSquare(location);
    }

    public ChessSquare getChessSquareDiagonalTopRightOfCurrentChessSquare(ChessBoard chessBoard) {
        int indexOfCurrentRow = VALID_CHARACTERS.indexOf(rowLocation);
        String location = String.valueOf(VALID_CHARACTERS.charAt(indexOfCurrentRow + 1)) + (columnLocation - 1);
        return chessBoard.getChessSquare(location);
    }

    public ChessSquare getChessSquareDiagonalBottomLeftOfCurrentChessSquare(ChessBoard chessBoard) {
        int indexOfCurrentRow = VALID_CHARACTERS.indexOf(rowLocation);
        String location = String.valueOf(VALID_CHARACTERS.charAt(indexOfCurrentRow - 1)) + (columnLocation + 1);
        return chessBoard.getChessSquare(location);
    }


    private void attachChessPieceToSquare(ChessPiece chessPiece) {
        occupants.add(chessPiece);
        owner = chessPiece.getTeam();
        owner.addChessPieceToTeam(chessPiece);
        applyChessSquareSettings(chessPiece);
    }

    private void applyChessSquareSettings(ChessPiece chessPiece) {
        this.setText(chessPiece.chessPieceSymbol);
        this.setForeground(Color.WHITE);
        this.setBackground(owner.getTeamColor());
        this.setFont(new Font("Arial", Font.BOLD, 12));
        this.isOccupiedByChessPiece = true;
    }

    private void checkIfChessSquareIsStartPosition(int rowLocation) {
        if (rowLocation == 2 || rowLocation == 7) {
            isChessSquareAStartPosition = true;
        }
    }

    private void checkIfChessSquareIsAnEndSquare(String columnLocation, int rowLocation) {
        checkIfChessSquareIsOnNorthEndOfBoard(rowLocation);
        checkIfChessSquareIsOnSouthEndOfBoard(rowLocation);
        checkIfChessSquareIsOnEastEndOfBoard(columnLocation);
        checkIfChessSquareIsOnWestEndOfBoard(columnLocation);
    }

    private void checkIfChessSquareIsOnNorthEndOfBoard(int rowLocation) {
        if (rowLocation == 1) {
            isChessSquareNorthEndOfBoard = true;
        }
    }

    private void checkIfChessSquareIsOnSouthEndOfBoard(int rowLocation) {
        if (rowLocation == 8) {
            isChessSquareSouthEndOfBoard = true;
        }
    }

    private void checkIfChessSquareIsOnEastEndOfBoard(String columnLocation) {
        if (columnLocation.equals("H")) {
            isChessSquareEastEndOfBoard = true;
        }
    }

    private void checkIfChessSquareIsOnWestEndOfBoard(String columnLocation) {
        if (columnLocation.equals("A")) {
            isChessSquareWestEndOfBoard = true;
        }
    }
}
