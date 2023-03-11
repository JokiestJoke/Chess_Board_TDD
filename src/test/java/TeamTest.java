import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TeamTest {
    Team redTeam = new Team("RED", Color.RED);
    Team greenTeam = new Team("GREEN", Color.GREEN);

    @AfterEach
    public void cleanUp() {
        redTeam.clearActiveChessPieces();
        greenTeam.clearActiveChessPieces();
    }


    @Test
    void teams_cannot_exceed_eight_pawns_per_team() {
        createPawns(9, redTeam);
        assertEquals(8, redTeam.getTotalNumberOfPawns());
    }

    @Test
    void teams_cannot_exceed_one_king_per_team() {
        createKings(5, redTeam);
        assertEquals(1, redTeam.getTotalNumberOfKings());
    }

    @Test
    void teams_cannot_exceed_one_queen_per_team() {
        createQueens(7, redTeam);
        assertEquals(1, redTeam.getTotalNumberOfQueens());
    }

    @Test
    void teams_cannot_exceed_two_bishops_per_team() {
        createBishops(3, redTeam);
        assertEquals(2, redTeam.getTotalNumberOfBishops());
    }

    @Test
    void teams_cannot_exceed_two_rooks_per_team() {
        createRooks(3, redTeam);
        assertEquals(2, redTeam.getTotalNumberOfRooks());
    }

    @Test
    void teams_cannot_exceed_two_knights_per_team() {
        createKnights(5, redTeam);
        assertEquals(2, redTeam.getTotalNumberOfKnights());
    }

    @Test
    void teams_can_have_a_full_chess_board() {
        createFullBoard(redTeam);
        assertEquals(8, redTeam.getTotalNumberOfPawns());
        assertEquals(2, redTeam.getTotalNumberOfRooks());
        assertEquals(2, redTeam.getTotalNumberOfKnights());
        assertEquals(2, redTeam.getTotalNumberOfBishops());
        assertEquals(1, redTeam.getTotalNumberOfKings());
        assertEquals(1, redTeam.getTotalNumberOfQueens());
    }

    @Test
    void two_teams_have_separate_totals() {
        createPawns(8, redTeam);
        createPawns(8, greenTeam);
        assertEquals(8, redTeam.getTotalNumberOfPawns());
        assertEquals(8, greenTeam.getTotalNumberOfPawns());
    }

    private void createPawns(int desiredNumberToBeCreated, Team targetTeam) {
        for (int index = 0; index < desiredNumberToBeCreated; index++) {
            if (index < 8) {
                targetTeam.addChessPieceToTeam(new Pawn("A" + (index + 1), targetTeam));
            } else {
                targetTeam.addChessPieceToTeam(new Pawn("B" + 1, targetTeam));
            }

        }
    }

    private void createKings(int desiredNumberToBeCreated, Team targetTeam) {
        for (int index = 0; index < desiredNumberToBeCreated; index++) {
            targetTeam.addChessPieceToTeam(new King("A" + (index + 1), targetTeam));
        }
    }

    private void createQueens(int desiredNumberToBeCreated, Team targetTeam) {
        for (int index = 0; index < desiredNumberToBeCreated; index++) {
            targetTeam.addChessPieceToTeam(new Queen("A" + (index + 1), targetTeam));
        }
    }

    private void createBishops(int desiredNumberToBeCreated, Team targetTeam) {
        for (int index = 0; index < desiredNumberToBeCreated; index++) {
            targetTeam.addChessPieceToTeam(new Bishop("A" + (index + 1), targetTeam));
        }
    }

    private void createRooks(int desiredNumberToBeCreated, Team targetTeam) {
        for (int index = 0; index < desiredNumberToBeCreated; index++) {
            targetTeam.addChessPieceToTeam(new Rook("A" + (index + 1), targetTeam));
        }
    }

    private void createKnights(int desiredNumberToBeCreated, Team targetTeam) {
        for (int index = 0; index < desiredNumberToBeCreated; index++) {
            targetTeam.addChessPieceToTeam(new Knight("A" + (index + 1), targetTeam));
        }
    }

    private void createFullBoard(Team team) {
        createPawns(8, team);
        createBishops(2, team);
        createRooks(2, team);
        createKnights(2, team);
        createKings(1, team);
        createQueens(1, team);
    }

}
