public class King extends ChessPiece {

    King(String location, Team team) {
        super(location, team);
        this.chessPieceName = "KING";
        this.chessPieceSymbol = "K";
        this.legalPieceLimit = 1;
    }

    @Override
    void calculateLegalMovesForChessPiece(ChessBoard chessBoard, ChessSquare chessSquare) {
        findLegalChessSquareNorthOfCurrentSquare(chessBoard, chessSquare);
        findLegalChessSquareEastOfCurrentSquare(chessBoard, chessSquare);
        findLegalChessSquareSouthOfCurrentSquare(chessBoard, chessSquare);
        findLegalChessSquareWestOfCurrentSquare(chessBoard, chessSquare);

        findLegalChessSquareDiagonalNorthWestOfCurrentChessPiece(chessBoard, chessSquare);
        findLegalChessSquareDiagonalSouthEastOfCurrentChessPiece(chessBoard, chessSquare);
        findLegalChessSquareDiagonalNorthEastOfCurrentChessSquare(chessBoard, chessSquare);
        findLegalChessSquareDiagonalSouthWestOfCurrentChessSquare(chessBoard, chessSquare);
    }
}
