public class Bishop extends ChessPiece {

    Bishop(String location, Team team) {
        super(location, team);
        this.chessPieceName = "BISHOP";
        this.chessPieceSymbol = "B";
        this.legalPieceLimit = 2;
    }

    @Override
    void calculateLegalMovesForChessPiece(ChessBoard chessBoard, ChessSquare chessSquare) {
        recursivelyFindAllLegalChessSquaresDiagonalNorthWestOfCurrentChessPiece(chessBoard, chessSquare);
        recursivelyFindAllLegalChessSquaresDiagonalSouthEastOfCurrentChessPiece(chessBoard, chessSquare);
        recursivelyFindAllLegalChessSquaresDiagonalNorthEastOfCurrentChessPiece(chessBoard, chessSquare);
        recursivelyFindAllLegalChessSquaresDiagonalSouthWestOfCurrentChessPiece(chessBoard, chessSquare);
    }
    
}
