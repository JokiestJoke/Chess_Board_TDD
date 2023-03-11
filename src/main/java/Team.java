import java.awt.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Team {
    private static final Logger LOGGER = Logger.getLogger(Team.class.getName());
    private int currentPawnTotal;
    private int currentKingTotal;
    private int currentQueenTotal;
    private int currentBishopTotal;
    private int currentRookTotal;
    private int currentKnightTotal;
    private final String teamName;
    private final Color teamColor;

    Team(String teamName, Color teamColor) {
        currentPawnTotal = 0;
        currentKingTotal = 0;
        currentQueenTotal = 0;
        currentBishopTotal = 0;
        currentRookTotal = 0;
        currentKnightTotal = 0;
        this.teamName = teamName;
        this.teamColor = teamColor;
    }

    void addChessPieceToTeam(ChessPiece chessPiece) {
        switch (chessPiece.chessPieceName) {
            case "PAWN":
                if (currentPawnTotal < chessPiece.legalPieceLimit) {
                    currentPawnTotal += 1;
                }
                break;
            case "ROOK":
                if (currentRookTotal < chessPiece.legalPieceLimit) {
                    currentRookTotal += 1;
                }
                break;
            case "KNIGHT":
                if (currentKnightTotal < chessPiece.legalPieceLimit) {
                    currentKnightTotal += 1;
                }
                break;
            case "BISHOP":
                if (currentBishopTotal < chessPiece.legalPieceLimit) {
                    currentBishopTotal += 1;
                }
                break;
            case "QUEEN":
                if (currentQueenTotal < chessPiece.legalPieceLimit) {
                    currentQueenTotal += 1;
                }
                break;
            case "KING":
                if (currentKingTotal < chessPiece.legalPieceLimit) {
                    currentKingTotal += 1;
                }
                break;
            default:
                String message = String.format("Error: The team %s cannot add/field %d more than %s(s)", this.teamName, chessPiece.legalPieceLimit, chessPiece.chessPieceName);
                LOGGER.log(Level.SEVERE, "Error: {0}", message);
                break;
        }
    }

    public String getTeamName() {
        return teamName;
    }

    public int getTotalNumberOfPawns() {
        return currentPawnTotal;
    }

    public int getTotalNumberOfKings() {
        return currentKingTotal;
    }

    public int getTotalNumberOfQueens() {
        return currentQueenTotal;
    }

    public int getTotalNumberOfBishops() {
        return currentBishopTotal;
    }

    public Color getTeamColor() {
        return teamColor;
    }

    public int getTotalNumberOfRooks() {
        return currentRookTotal;
    }

    public int getTotalNumberOfKnights() {
        return currentKnightTotal;
    }

    public void clearActiveChessPieces() {
        this.currentPawnTotal = 0;
        this.currentKingTotal = 0;
        this.currentQueenTotal = 0;
        this.currentBishopTotal = 0;
        this.currentRookTotal = 0;
        this.currentKnightTotal = 0;
    }


}
