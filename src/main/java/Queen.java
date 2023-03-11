public class Queen extends ChessPiece {
    Queen(String location, Team team) {
        super(location, team);
        this.chessPieceName = "QUEEN";
        this.chessPieceSymbol = "Q";
        this.legalPieceLimit = 1;
    }

    @Override
    void calculateLegalMovesForChessPiece(ChessBoard chessBoard, ChessSquare chessSquare) {
        recursivelyFindAllLegalChessSquaresEastOfCurrentChessPiece(chessBoard, chessSquare);
        recursivelyFindAllLegalChessSquaresWestOfCurrentChessPiece(chessBoard, chessSquare);
        recursivelyFindAllLegalChessSquaresNorthOfCurrentChessPiece(chessBoard, chessSquare);
        recursivelyFindAllLegalChessSquaresSouthOfCurrentChessPiece(chessBoard, chessSquare);

        recursivelyFindAllLegalChessSquaresDiagonalNorthWestOfCurrentChessPiece(chessBoard, chessSquare);
        recursivelyFindAllLegalChessSquaresDiagonalSouthEastOfCurrentChessPiece(chessBoard, chessSquare);
        recursivelyFindAllLegalChessSquaresDiagonalNorthEastOfCurrentChessPiece(chessBoard, chessSquare);
        recursivelyFindAllLegalChessSquaresDiagonalSouthWestOfCurrentChessPiece(chessBoard, chessSquare);
    }
}
