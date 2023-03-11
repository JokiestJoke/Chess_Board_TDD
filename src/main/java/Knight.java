public class Knight extends ChessPiece {

    Knight(String location, Team team) {
        super(location, team);
        this.chessPieceName = "KNIGHT";
        this.chessPieceSymbol = "N";
        this.legalPieceLimit = 2;
    }

    @Override
    void calculateLegalMovesForChessPiece(ChessBoard chessBoard, ChessSquare chessSquare) {
        findChessSquareAtEndOfKnightPathVerticalUpAndHorizontalLeft(chessBoard, chessSquare);
        findChessSquareAtEndOfKnightPathVerticalUpAndHorizontalRight(chessBoard, chessSquare);

        findChessSquareAtEndOfKnightPathVerticalDownAndHorizontalLeft(chessBoard, chessSquare);
        findChessSquareAtEndOfKnightPathVerticalDownAndHorizontalRight(chessBoard, chessSquare);

        findChessSquareAtEndOfKnightPathHorizontalLeftVerticalUp(chessBoard, chessSquare);
        findChessSquareAtEndOfKnightPathHorizontalLeftVerticalDown(chessBoard, chessSquare);

        findChessSquareAtEndOfKnightPathHorizontalRightVerticalUp(chessBoard, chessSquare);
        findChessSquareAtEndOfKnightPathHorizontalRightVerticalDown(chessBoard, chessSquare);
    }

    private void findChessSquareAtEndOfKnightPathVerticalUpAndHorizontalLeft(ChessBoard chessBoard, ChessSquare chessSquare) {
        if (!chessSquare.isChessSquareNorthEndOfBoard() && !chessSquare.isChessSquareWestEndOfBoard()) {
            ChessSquare nextSquareDiagonalTopLeftToCurrent = chessSquare.getChessSquareDiagonalTopLeftOfCurrentChessSquare(chessBoard);
            if (!nextSquareDiagonalTopLeftToCurrent.isChessSquareNorthEndOfBoard()) {
                ChessSquare nextSquareAboveCurrent = nextSquareDiagonalTopLeftToCurrent.getChessSquareAboveCurrentChessSquare(chessBoard);

                if (!nextSquareAboveCurrent.isChessSquareOccupied()) {
                    nextSquareAboveCurrent.setBackground(LEGAL_MOVE_HIGHLIGHT);
                } else {
                    highlightLegalCapturesForChessPiece(nextSquareAboveCurrent);
                }
            }
        }
    }

    private void findChessSquareAtEndOfKnightPathVerticalUpAndHorizontalRight(ChessBoard chessBoard, ChessSquare chessSquare) {
        if (!chessSquare.isChessSquareNorthEndOfBoard() && !chessSquare.isChessSquareWestEndOfBoard()) {
            ChessSquare nextSquareDiagonalTopRightToCurrent = chessSquare.getChessSquareDiagonalTopRightOfCurrentChessSquare(chessBoard);
            if (!nextSquareDiagonalTopRightToCurrent.isChessSquareNorthEndOfBoard()) {
                ChessSquare nextSquareAboveCurrent = nextSquareDiagonalTopRightToCurrent.getChessSquareAboveCurrentChessSquare(chessBoard);

                if (!nextSquareAboveCurrent.isChessSquareOccupied()) {
                    nextSquareAboveCurrent.setBackground(LEGAL_MOVE_HIGHLIGHT);
                } else {
                    highlightLegalCapturesForChessPiece(nextSquareAboveCurrent);
                }
            }
        }
    }

    private void findChessSquareAtEndOfKnightPathVerticalDownAndHorizontalRight(ChessBoard chessBoard, ChessSquare chessSquare) {
        if (!chessSquare.isChessSquareEastEndOfBoard() && !chessSquare.isChessSquareSouthEndOfBoard()) {
            ChessSquare nextSquareDiagonalBottomRightToCurrent = chessSquare.getChessSquareDiagonalBottomRightOfCurrentChessSquare(chessBoard);
            if (!nextSquareDiagonalBottomRightToCurrent.isChessSquareSouthEndOfBoard()) {
                ChessSquare nextSquareBelowCurrent = nextSquareDiagonalBottomRightToCurrent.getChessSquareBelowCurrentChessSquare(chessBoard);

                if (!nextSquareBelowCurrent.isChessSquareOccupied()) {
                    nextSquareBelowCurrent.setBackground(LEGAL_MOVE_HIGHLIGHT);
                } else {
                    highlightLegalCapturesForChessPiece(nextSquareBelowCurrent);
                }
            }
        }
    }

    private void findChessSquareAtEndOfKnightPathVerticalDownAndHorizontalLeft(ChessBoard chessBoard, ChessSquare chessSquare) {
        if (!chessSquare.isChessSquareWestEndOfBoard() && !chessSquare.isChessSquareSouthEndOfBoard()) {
            ChessSquare nextSquareDiagonalBottomLeftToCurrent = chessSquare.getChessSquareDiagonalBottomLeftOfCurrentChessSquare(chessBoard);
            if (!nextSquareDiagonalBottomLeftToCurrent.isChessSquareSouthEndOfBoard()) {
                ChessSquare nextSquareBelowCurrent = nextSquareDiagonalBottomLeftToCurrent.getChessSquareBelowCurrentChessSquare(chessBoard);

                if (!nextSquareBelowCurrent.isChessSquareOccupied()) {
                    nextSquareBelowCurrent.setBackground(LEGAL_MOVE_HIGHLIGHT);
                } else {
                    highlightLegalCapturesForChessPiece(nextSquareBelowCurrent);
                }
            }
        }
    }

    private void findChessSquareAtEndOfKnightPathHorizontalLeftVerticalUp(ChessBoard chessBoard, ChessSquare chessSquare) {
        if (!chessSquare.isChessSquareWestEndOfBoard() && !chessSquare.isChessSquareNorthEndOfBoard()) {
            ChessSquare nextSquareDiagonalTopLeftToCurrent = chessSquare.getChessSquareDiagonalTopLeftOfCurrentChessSquare(chessBoard);
            if (!nextSquareDiagonalTopLeftToCurrent.isChessSquareWestEndOfBoard()) {
                ChessSquare nextSquareHorizontalLeftToCurrent = nextSquareDiagonalTopLeftToCurrent.getChessSquareLeftOfCurrentChessSquare(chessBoard);

                if (!nextSquareHorizontalLeftToCurrent.isChessSquareOccupied()) {
                    nextSquareHorizontalLeftToCurrent.setBackground(LEGAL_MOVE_HIGHLIGHT);
                } else {
                    highlightLegalCapturesForChessPiece(nextSquareHorizontalLeftToCurrent);
                }
            }
        }
    }

    private void findChessSquareAtEndOfKnightPathHorizontalLeftVerticalDown(ChessBoard chessBoard, ChessSquare chessSquare) {
        if (!chessSquare.isChessSquareWestEndOfBoard() && !chessSquare.isChessSquareSouthEndOfBoard()) {
            ChessSquare nextSquareDiagonalBottomLeftToCurrent = chessSquare.getChessSquareDiagonalBottomLeftOfCurrentChessSquare(chessBoard);
            if (!nextSquareDiagonalBottomLeftToCurrent.isChessSquareWestEndOfBoard()) {
                ChessSquare nextSquareHorizontalLeftToCurrent = nextSquareDiagonalBottomLeftToCurrent.getChessSquareLeftOfCurrentChessSquare(chessBoard);

                if (!nextSquareHorizontalLeftToCurrent.isChessSquareOccupied()) {
                    nextSquareHorizontalLeftToCurrent.setBackground(LEGAL_MOVE_HIGHLIGHT);
                } else {
                    highlightLegalCapturesForChessPiece(nextSquareHorizontalLeftToCurrent);
                }
            }
        }
    }

    private void findChessSquareAtEndOfKnightPathHorizontalRightVerticalUp(ChessBoard chessBoard, ChessSquare chessSquare) {
        if (!chessSquare.isChessSquareNorthEndOfBoard() && !chessSquare.isChessSquareEastEndOfBoard()) {
            ChessSquare nextSquareDiagonalTopRightToCurrent = chessSquare.getChessSquareDiagonalTopRightOfCurrentChessSquare(chessBoard);
            if (!nextSquareDiagonalTopRightToCurrent.isChessSquareEastEndOfBoard()) {
                ChessSquare nextSquareHorizontalRightToCurrent = nextSquareDiagonalTopRightToCurrent.getChessSquareRightOfCurrentChessSquare(chessBoard);

                if (!nextSquareHorizontalRightToCurrent.isChessSquareOccupied()) {
                    nextSquareHorizontalRightToCurrent.setBackground(LEGAL_MOVE_HIGHLIGHT);
                } else {
                    highlightLegalCapturesForChessPiece(nextSquareHorizontalRightToCurrent);
                }
            }
        }
    }

    private void findChessSquareAtEndOfKnightPathHorizontalRightVerticalDown(ChessBoard chessBoard, ChessSquare chessSquare) {
        if (!chessSquare.isChessSquareSouthEndOfBoard() && !chessSquare.isChessSquareEastEndOfBoard()) {
            ChessSquare nextSquareDiagonalBottomRightToCurrent = chessSquare.getChessSquareDiagonalBottomRightOfCurrentChessSquare(chessBoard);
            if (!nextSquareDiagonalBottomRightToCurrent.isChessSquareEastEndOfBoard()) {
                ChessSquare nextSquareHorizontalRightToCurrent = nextSquareDiagonalBottomRightToCurrent.getChessSquareRightOfCurrentChessSquare(chessBoard);

                if (!nextSquareHorizontalRightToCurrent.isChessSquareOccupied()) {
                    nextSquareHorizontalRightToCurrent.setBackground(LEGAL_MOVE_HIGHLIGHT);
                } else {
                    highlightLegalCapturesForChessPiece(nextSquareHorizontalRightToCurrent);
                }
            }
        }
    }
}
