import java.awt.*;

public abstract class ChessPiece {
    private final String locationString;
    private final String rowLocation;
    private final int columnLocation;
    protected static final Color LEGAL_MOVE_HIGHLIGHT = Color.YELLOW;
    protected static final Color LEGAL_CAPTURE_HIGHLIGHT = Color.GREEN;
    protected Team team;
    protected String chessPieceName;
    protected String chessPieceSymbol;
    protected int legalPieceLimit;
    protected static final String VALID_CHARACTERS = "ABCDEFGH";

    ChessPiece(String location, Team team) {
        validate(location);
        this.locationString = location;
        rowLocation = location.substring(0, 1);
        columnLocation = Integer.parseInt(location.substring(1));
        this.team = team;
    }

    abstract void calculateLegalMovesForChessPiece(ChessBoard chessBoard, ChessSquare chessSquare);

    public String getChessPieceName() {
        return this.chessPieceName;
    }

    public Team getTeam() {
        return this.team;
    }

    public String getLocationString() {
        return locationString;
    }

    public String getRowLocation() {
        return rowLocation;
    }

    public int getColumnLocation() {
        return columnLocation;
    }

    public void findLegalChessSquareNorthOfCurrentSquare(ChessBoard chessBoard, ChessSquare chessSquare) {
        if (!chessSquare.isChessSquareNorthEndOfBoard()) {
            ChessSquare nextLegalChessSquareAboveCurrent = chessSquare.getChessSquareAboveCurrentChessSquare(chessBoard);
            if (!nextLegalChessSquareAboveCurrent.isChessSquareOccupied()) {
                nextLegalChessSquareAboveCurrent.setBackground(LEGAL_MOVE_HIGHLIGHT);
            } else {
                highlightLegalCapturesForChessPiece(nextLegalChessSquareAboveCurrent);
            }
        }
    }

    public void findLegalChessSquareEastOfCurrentSquare(ChessBoard chessBoard, ChessSquare chessSquare) {
        if (!chessSquare.isChessSquareEastEndOfBoard()) {
            ChessSquare rightDestination = chessSquare.getChessSquareRightOfCurrentChessSquare(chessBoard);
            if (!rightDestination.isChessSquareOccupied()) {
                rightDestination.setBackground(LEGAL_MOVE_HIGHLIGHT);
            } else {
                highlightLegalCapturesForChessPiece(rightDestination);
            }

        }
    }

    public void findLegalChessSquareSouthOfCurrentSquare(ChessBoard chessBoard, ChessSquare chessSquare) {
        if (!chessSquare.isChessSquareSouthEndOfBoard()) {
            ChessSquare nextLegalChessSquareBelowCurrent = chessSquare.getChessSquareBelowCurrentChessSquare(chessBoard);
            if (!nextLegalChessSquareBelowCurrent.isChessSquareOccupied()) {
                nextLegalChessSquareBelowCurrent.setBackground(LEGAL_MOVE_HIGHLIGHT);
            } else {
                highlightLegalCapturesForChessPiece(nextLegalChessSquareBelowCurrent);
            }
        }
    }

    public void findLegalChessSquareWestOfCurrentSquare(ChessBoard chessBoard, ChessSquare chessSquare) {
        if (!chessSquare.isChessSquareWestEndOfBoard()) {
            ChessSquare leftDestination = chessSquare.getChessSquareLeftOfCurrentChessSquare(chessBoard);
            if (!leftDestination.isChessSquareOccupied()) {
                leftDestination.setBackground(LEGAL_MOVE_HIGHLIGHT);
            } else {
                highlightLegalCapturesForChessPiece(leftDestination);
            }
        }
    }

    public void findLegalChessSquareDiagonalNorthWestOfCurrentChessPiece(ChessBoard chessBoard, ChessSquare chessSquare) {
        if (!chessSquare.isChessSquareNorthEndOfBoard() && !chessSquare.isChessSquareWestEndOfBoard()) {
            ChessSquare diagonalTopLeftOfCurrentSquare = chessSquare.getChessSquareDiagonalTopLeftOfCurrentChessSquare(chessBoard);
            if (!diagonalTopLeftOfCurrentSquare.isChessSquareOccupied()) {
                diagonalTopLeftOfCurrentSquare.setBackground(LEGAL_MOVE_HIGHLIGHT);
            } else {
                highlightLegalCapturesForChessPiece(diagonalTopLeftOfCurrentSquare);
            }
        }
    }

    public void findLegalChessSquareDiagonalSouthEastOfCurrentChessPiece(ChessBoard chessBoard, ChessSquare chessSquare) {
        if (!chessSquare.isChessSquareSouthEndOfBoard() && !chessSquare.isChessSquareEastEndOfBoard()) {
            ChessSquare diagonalBottomRightOfCurrentSquare = chessSquare.getChessSquareDiagonalBottomRightOfCurrentChessSquare(chessBoard);
            if (!diagonalBottomRightOfCurrentSquare.isChessSquareOccupied()) {
                diagonalBottomRightOfCurrentSquare.setBackground(LEGAL_MOVE_HIGHLIGHT);
            } else {
                highlightLegalCapturesForChessPiece(diagonalBottomRightOfCurrentSquare);
            }
        }
    }

    public void findLegalChessSquareDiagonalNorthEastOfCurrentChessSquare(ChessBoard chessBoard, ChessSquare chessSquare) {
        if (!chessSquare.isChessSquareEastEndOfBoard() && !chessSquare.isChessSquareNorthEndOfBoard()) {
            ChessSquare diagonalTopRightOfCurrentSquare = chessSquare.getChessSquareDiagonalTopRightOfCurrentChessSquare(chessBoard);
            if (!diagonalTopRightOfCurrentSquare.isChessSquareOccupied()) {
                diagonalTopRightOfCurrentSquare.setBackground(LEGAL_MOVE_HIGHLIGHT);
            } else {
                highlightLegalCapturesForChessPiece(diagonalTopRightOfCurrentSquare);
            }
        }
    }

    public void findLegalChessSquareDiagonalSouthWestOfCurrentChessSquare(ChessBoard chessBoard, ChessSquare chessSquare) {
        if (!chessSquare.isChessSquareSouthEndOfBoard() && !chessSquare.isChessSquareWestEndOfBoard()) {
            ChessSquare diagonalBottomLeftOfCurrentSquare = chessSquare.getChessSquareDiagonalBottomLeftOfCurrentChessSquare(chessBoard);
            if (!diagonalBottomLeftOfCurrentSquare.isChessSquareOccupied()) {
                diagonalBottomLeftOfCurrentSquare.setBackground(LEGAL_MOVE_HIGHLIGHT);
            } else {
                highlightLegalCapturesForChessPiece(diagonalBottomLeftOfCurrentSquare);
            }
        }
    }

    public void recursivelyFindAllLegalChessSquaresDiagonalSouthWestOfCurrentChessPiece(ChessBoard chessBoard, ChessSquare chessSquare) {
        if (!chessSquare.isChessSquareSouthEndOfBoard() && !chessSquare.isChessSquareWestEndOfBoard()) {
            ChessSquare diagonalBottomLeftOfCurrentSquare = chessSquare.getChessSquareDiagonalBottomLeftOfCurrentChessSquare(chessBoard);
            if (!diagonalBottomLeftOfCurrentSquare.isChessSquareOccupied()) {
                diagonalBottomLeftOfCurrentSquare.setBackground(LEGAL_MOVE_HIGHLIGHT);
                recursivelyFindAllLegalChessSquaresDiagonalSouthWestOfCurrentChessPiece(chessBoard, diagonalBottomLeftOfCurrentSquare);
            } else {
                highlightLegalCapturesForChessPiece(diagonalBottomLeftOfCurrentSquare);
            }
        }
    }

    public void recursivelyFindAllLegalChessSquaresDiagonalNorthEastOfCurrentChessPiece(ChessBoard chessBoard, ChessSquare chessSquare) {
        if (!chessSquare.isChessSquareEastEndOfBoard() && !chessSquare.isChessSquareNorthEndOfBoard()) {
            ChessSquare diagonalTopRightOfCurrentSquare = chessSquare.getChessSquareDiagonalTopRightOfCurrentChessSquare(chessBoard);
            if (!diagonalTopRightOfCurrentSquare.isChessSquareOccupied()) {
                diagonalTopRightOfCurrentSquare.setBackground(LEGAL_MOVE_HIGHLIGHT);
                recursivelyFindAllLegalChessSquaresDiagonalNorthEastOfCurrentChessPiece(chessBoard, diagonalTopRightOfCurrentSquare);
            } else {
                highlightLegalCapturesForChessPiece((diagonalTopRightOfCurrentSquare));
            }
        }
    }

    public void recursivelyFindAllLegalChessSquaresDiagonalNorthWestOfCurrentChessPiece(ChessBoard chessBoard, ChessSquare chessSquare) {
        if (!chessSquare.isChessSquareNorthEndOfBoard() && !chessSquare.isChessSquareWestEndOfBoard()) {
            ChessSquare diagonalTopLeftOfCurrentSquare = chessSquare.getChessSquareDiagonalTopLeftOfCurrentChessSquare(chessBoard);
            if (!diagonalTopLeftOfCurrentSquare.isChessSquareOccupied()) {
                diagonalTopLeftOfCurrentSquare.setBackground(LEGAL_MOVE_HIGHLIGHT);
                recursivelyFindAllLegalChessSquaresDiagonalNorthWestOfCurrentChessPiece(chessBoard, diagonalTopLeftOfCurrentSquare);
            } else {
                highlightLegalCapturesForChessPiece(diagonalTopLeftOfCurrentSquare);
            }
        }
    }

    public void recursivelyFindAllLegalChessSquaresDiagonalSouthEastOfCurrentChessPiece(ChessBoard chessBoard, ChessSquare chessSquare) {
        if (!chessSquare.isChessSquareSouthEndOfBoard() && !chessSquare.isChessSquareEastEndOfBoard()) {
            ChessSquare diagonalBottomRightOfCurrentSquare = chessSquare.getChessSquareDiagonalBottomRightOfCurrentChessSquare(chessBoard);
            if (!diagonalBottomRightOfCurrentSquare.isChessSquareOccupied()) {
                diagonalBottomRightOfCurrentSquare.setBackground(LEGAL_MOVE_HIGHLIGHT);
                recursivelyFindAllLegalChessSquaresDiagonalSouthEastOfCurrentChessPiece(chessBoard, diagonalBottomRightOfCurrentSquare);
            } else {
                highlightLegalCapturesForChessPiece(diagonalBottomRightOfCurrentSquare);
            }
        }
    }

    public void recursivelyFindAllLegalChessSquaresNorthOfCurrentChessPiece(ChessBoard chessBoard, ChessSquare chessSquare) {
        if (!chessSquare.isChessSquareNorthEndOfBoard()) {
            ChessSquare upwardDestination = chessSquare.getChessSquareAboveCurrentChessSquare(chessBoard);
            if (!upwardDestination.isChessSquareOccupied()) {
                upwardDestination.setBackground(LEGAL_MOVE_HIGHLIGHT);
                recursivelyFindAllLegalChessSquaresNorthOfCurrentChessPiece(chessBoard, upwardDestination);
            } else {
                highlightLegalCapturesForChessPiece(upwardDestination);
            }
        }
    }

    public void recursivelyFindAllLegalChessSquaresEastOfCurrentChessPiece(ChessBoard chessBoard, ChessSquare chessSquare) {
        if (!chessSquare.isChessSquareEastEndOfBoard()) {
            ChessSquare rightDestination = chessSquare.getChessSquareRightOfCurrentChessSquare(chessBoard);
            if (!rightDestination.isChessSquareOccupied()) {
                rightDestination.setBackground(LEGAL_MOVE_HIGHLIGHT);
                recursivelyFindAllLegalChessSquaresEastOfCurrentChessPiece(chessBoard, rightDestination);
            } else {
                highlightLegalCapturesForChessPiece(rightDestination);
            }
        }
    }

    public void recursivelyFindAllLegalChessSquaresSouthOfCurrentChessPiece(ChessBoard chessBoard, ChessSquare chessSquare) {
        if (!chessSquare.isChessSquareSouthEndOfBoard()) {
            ChessSquare downwardDirection = chessSquare.getChessSquareBelowCurrentChessSquare(chessBoard);
            if (!downwardDirection.isChessSquareOccupied()) {
                downwardDirection.setBackground(LEGAL_MOVE_HIGHLIGHT);
                recursivelyFindAllLegalChessSquaresSouthOfCurrentChessPiece(chessBoard, downwardDirection);
            } else {
                highlightLegalCapturesForChessPiece(downwardDirection);
            }
        }
    }

    public void recursivelyFindAllLegalChessSquaresWestOfCurrentChessPiece(ChessBoard chessBoard, ChessSquare chessSquare) {
        if (!chessSquare.isChessSquareWestEndOfBoard()) {
            ChessSquare leftDestination = chessSquare.getChessSquareLeftOfCurrentChessSquare(chessBoard);
            if (!leftDestination.isChessSquareOccupied()) {
                leftDestination.setBackground(LEGAL_MOVE_HIGHLIGHT);
                recursivelyFindAllLegalChessSquaresWestOfCurrentChessPiece(chessBoard, leftDestination);
            } else {
                highlightLegalCapturesForChessPiece(leftDestination);
            }
        }
    }

    void highlightLegalCapturesForChessPiece(ChessSquare chessSquare) {
        ChessPiece chessPiece = chessSquare.getOccupantsList().get(0);
        if (!this.team.getTeamName().equals(chessPiece.getTeam().getTeamName())) {
            chessSquare.setBackground(LEGAL_CAPTURE_HIGHLIGHT);
        }
    }


    private void validate(String location) {
        String locationToValidate = location.trim().toUpperCase();
        isLengthIsOnlyTwoCharacters(locationToValidate);
        isFirstCharacterValidRowLocation(locationToValidate);
        isSecondCharacterValidColumnLocation(locationToValidate);
    }

    private void isLengthIsOnlyTwoCharacters(String location) {
        int length = location.length();
        if (length > 2) {
            throw new IllegalArgumentException("Error: String Location Is Larger than 2 characters.");
        }
    }

    private void isFirstCharacterValidRowLocation(String location) {
        boolean isValid = false;

        char firstCharacter = location.charAt(0);

        for (int index = 0; index < VALID_CHARACTERS.length(); index++) {
            if (firstCharacter == VALID_CHARACTERS.charAt(index)) {
                isValid = true;
                break;
            }
        }

        if (!isValid) {
            throw new IllegalArgumentException("Error: Row Location is Invalid. Must be either A, B, C, D, E, F, G, or H.");
        }
    }

    private void isSecondCharacterValidColumnLocation(String location) {
        String value = location.substring(1);
        int decimalValue = Integer.parseInt(value);
        if (decimalValue < 1 || decimalValue > 8) {
            throw new IllegalArgumentException("Error: Column Location is Invalid. Must be either a number between 1 through 8");
        }
    }
}
