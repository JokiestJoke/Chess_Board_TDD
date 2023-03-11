public class Rook extends ChessPiece {

    Rook(String location, Team team) {
        super(location, team);
        this.chessPieceName = "ROOK";
        this.chessPieceSymbol = "R";
        this.legalPieceLimit = 2;
    }

    @Override
    void calculateLegalMovesForChessPiece(ChessBoard chessBoard, ChessSquare chessSquare) {
        recursivelyFindAllLegalChessSquaresNorthOfCurrentChessPiece(chessBoard, chessSquare);
        recursivelyFindAllLegalChessSquaresEastOfCurrentChessPiece(chessBoard, chessSquare);
        recursivelyFindAllLegalChessSquaresSouthOfCurrentChessPiece(chessBoard, chessSquare);
        recursivelyFindAllLegalChessSquaresWestOfCurrentChessPiece(chessBoard, chessSquare);
    }
}
