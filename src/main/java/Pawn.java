import java.awt.*;

public class Pawn extends ChessPiece {
    private boolean hasPerformedDoubleMoveStatus;

    Pawn(String location, Team team) {
        super(location, team);
        this.chessPieceName = "PAWN";
        this.chessPieceSymbol = "P";
        this.legalPieceLimit = 8;
        hasPerformedDoubleMoveStatus = false;
    }

    @Override
    void calculateLegalMovesForChessPiece(ChessBoard chessBoard, ChessSquare chessSquare) {
        if (this.getColumnLocation() >= 5) {
            if (!hasPerformedDoubleMoveStatus && this.getColumnLocation() == 7) {
                findLegalDoubleMoveChessSquareNorthOfCurrentSquare(chessBoard, chessSquare);
            } else {
                findLegalChessSquareNorthOfCurrentPawn(chessBoard, chessSquare);
            }
            findLegalCapturesNorthWestAndNorthEastOfCurrentPawn(chessBoard, chessSquare);
        } else {
            if (!hasPerformedDoubleMoveStatus && this.getColumnLocation() == 2) {
                findLegalDoubleMoveChessSquareSouthOfCurrentSquare(chessBoard, chessSquare);
            } else {
                findLegalChessSquareSouthOfCurrentPawn(chessBoard, chessSquare);
            }
            findLegalCapturesSouthWestAndSouthEastOfCurrentPawn(chessBoard, chessSquare);
        }
    }

    private void findLegalCapturesNorthWestAndNorthEastOfCurrentPawn(ChessBoard chessBoard, ChessSquare chessSquare) {
        findLegalChessSquareDiagonalNorthWestOfCurrentPawn(chessBoard, chessSquare);
        findLegalChessSquareDiagonalNorthEastOfCurrentPawn(chessBoard, chessSquare);
    }

    private void findLegalCapturesSouthWestAndSouthEastOfCurrentPawn(ChessBoard chessBoard, ChessSquare chessSquare) {
        findLegalChessSquareDiagonalSouthEastOfCurrentPawn(chessBoard, chessSquare);
        findLegalChessSquareDiagonalSouthWestOfCurrentPawn(chessBoard, chessSquare);
    }

    private void findLegalChessSquareNorthOfCurrentPawn(ChessBoard chessBoard, ChessSquare chessSquare) {
        if (!chessSquare.isChessSquareNorthEndOfBoard()) {
            ChessSquare nextLegalChessSquareAboveCurrent = chessSquare.getChessSquareAboveCurrentChessSquare(chessBoard);
            if (!nextLegalChessSquareAboveCurrent.isChessSquareOccupied()) {
                nextLegalChessSquareAboveCurrent.setBackground(LEGAL_MOVE_HIGHLIGHT);
                updateLegalMoveReport(nextLegalChessSquareAboveCurrent);
            }
        }
    }

    private void findLegalChessSquareSouthOfCurrentPawn(ChessBoard chessBoard, ChessSquare chessSquare) {
        if (!chessSquare.isChessSquareSouthEndOfBoard()) {
            ChessSquare nextLegalChessSquareBelowCurrent = chessSquare.getChessSquareBelowCurrentChessSquare(chessBoard);
            if (!nextLegalChessSquareBelowCurrent.isChessSquareOccupied()) {
                nextLegalChessSquareBelowCurrent.setBackground(LEGAL_MOVE_HIGHLIGHT);
                updateLegalMoveReport(nextLegalChessSquareBelowCurrent);
            }
        }
    }

    private void findLegalDoubleMoveChessSquareSouthOfCurrentSquare(ChessBoard chessBoard, ChessSquare chessSquare) {
        if (!chessSquare.isChessSquareSouthEndOfBoard()) {
            ChessSquare nextLegalChessSquareBelowCurrent = chessSquare.getChessSquareBelowCurrentChessSquare(chessBoard);
            if (!nextLegalChessSquareBelowCurrent.isChessSquareOccupied()) {
                nextLegalChessSquareBelowCurrent.setBackground(Color.YELLOW);
                updateLegalMoveReport(nextLegalChessSquareBelowCurrent);
                if (!hasPerformedDoubleMoveStatus) {
                    ChessSquare doubleMoveDestination = nextLegalChessSquareBelowCurrent.getChessSquareBelowCurrentChessSquare(chessBoard);
                    doubleMoveDestination.setBackground(Color.YELLOW);
                    updateLegalMoveReport(doubleMoveDestination);
                    hasPerformedDoubleMoveStatus = true;
                }
            }
        }
    }

    private void findLegalDoubleMoveChessSquareNorthOfCurrentSquare(ChessBoard chessBoard, ChessSquare chessSquare) {
        if (!chessSquare.isChessSquareNorthEndOfBoard()) {
            ChessSquare nextLegalChessSquareAboveCurrent = chessSquare.getChessSquareAboveCurrentChessSquare(chessBoard);
            if (!nextLegalChessSquareAboveCurrent.isChessSquareOccupied()) {
                nextLegalChessSquareAboveCurrent.setBackground(Color.YELLOW);
                updateLegalMoveReport(nextLegalChessSquareAboveCurrent);
                if (!hasPerformedDoubleMoveStatus) {
                    ChessSquare doubleMoveDestination = nextLegalChessSquareAboveCurrent.getChessSquareAboveCurrentChessSquare(chessBoard);
                    doubleMoveDestination.setBackground(Color.YELLOW);
                    updateLegalMoveReport(doubleMoveDestination);
                    hasPerformedDoubleMoveStatus = true;
                }
            }
        }
    }


    private void findLegalChessSquareDiagonalNorthWestOfCurrentPawn(ChessBoard chessBoard, ChessSquare chessSquare) {
        if (!chessSquare.isChessSquareNorthEndOfBoard() && !chessSquare.isChessSquareWestEndOfBoard()) {
            ChessSquare diagonalTopLeftOfCurrentSquare = chessSquare.getChessSquareDiagonalTopLeftOfCurrentChessSquare(chessBoard);

            if (diagonalTopLeftOfCurrentSquare.isChessSquareOccupied()) {
                highlightLegalCapturesForChessPiece(diagonalTopLeftOfCurrentSquare);
            }
        }
    }

    private void findLegalChessSquareDiagonalSouthEastOfCurrentPawn(ChessBoard chessBoard, ChessSquare chessSquare) {
        if (!chessSquare.isChessSquareSouthEndOfBoard() && !chessSquare.isChessSquareEastEndOfBoard()) {
            ChessSquare diagonalBottomRightOfCurrentSquare = chessSquare.getChessSquareDiagonalBottomRightOfCurrentChessSquare(chessBoard);

            if (diagonalBottomRightOfCurrentSquare.isChessSquareOccupied()) {
                highlightLegalCapturesForChessPiece(diagonalBottomRightOfCurrentSquare);
            }
        }
    }

    private void findLegalChessSquareDiagonalNorthEastOfCurrentPawn(ChessBoard chessBoard, ChessSquare chessSquare) {
        if (!chessSquare.isChessSquareEastEndOfBoard() && !chessSquare.isChessSquareNorthEndOfBoard()) {
            ChessSquare diagonalTopRightOfCurrentSquare = chessSquare.getChessSquareDiagonalTopRightOfCurrentChessSquare(chessBoard);

            if (diagonalTopRightOfCurrentSquare.isChessSquareOccupied()) {
                highlightLegalCapturesForChessPiece(diagonalTopRightOfCurrentSquare);
            }
        }
    }

    private void findLegalChessSquareDiagonalSouthWestOfCurrentPawn(ChessBoard chessBoard, ChessSquare chessSquare) {
        if (!chessSquare.isChessSquareSouthEndOfBoard() && !chessSquare.isChessSquareWestEndOfBoard()) {
            ChessSquare diagonalBottomLeftOfCurrentSquare = chessSquare.getChessSquareDiagonalBottomLeftOfCurrentChessSquare(chessBoard);

            if (diagonalBottomLeftOfCurrentSquare.isChessSquareOccupied()) {
                highlightLegalCapturesForChessPiece(diagonalBottomLeftOfCurrentSquare);
            }
        }
    }


}
