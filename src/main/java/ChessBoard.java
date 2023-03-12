import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

public class ChessBoard {
    private static final Color WHITE = Color.WHITE;
    private static final Color BLACK = Color.BLACK;
    private final JPanel graphicalUserInterface = new JPanel(new BorderLayout(3, 3));
    private final JButton[][] gameBoardSquares = new JButton[8][8];
    private final ArrayList<JButton> graphicalUserInterfaceButtons = new ArrayList<>();
    private final ArrayList<UserInputTextArea> userInputs = new ArrayList<>();
    private JPanel gameBoard;
    private final JToolBar userToolBar = new JToolBar();
    private static final String COLUMN_CHARACTERS = "ABCDEFGH";

    ChessBoard() {
        createChessBoardGUI();
    }

    public final void createChessBoardGUI() {

        graphicalUserInterface.setBorder(new EmptyBorder(5, 5, 5, 5));
        gameBoard = new JPanel(new GridLayout(0, 9));
        gameBoard.setBorder(new LineBorder(BLACK));
        graphicalUserInterface.add(gameBoard);
        addUserInputToolBar();
        populateBoardWithChessSquares();
        fillChessBoard();
    }

    public final JComponent getGameBoardGraphicalUserInterface() {
        return graphicalUserInterface;
    }

    public final JButton[][] getJButtonSquares() {
        return gameBoardSquares;
    }

    public void addChessPieceToBoard(ChessPiece chessPiece) {
        String desiredRowLocation = chessPiece.getRowLocation();
        int indexOfDesiredRow = COLUMN_CHARACTERS.indexOf(desiredRowLocation);
        int desiredColumnLocation = chessPiece.getColumnLocation();

        ChessSquare targetChessSquare = (ChessSquare) gameBoardSquares[indexOfDesiredRow][desiredColumnLocation - 1];
        targetChessSquare.addChessPieceOccupantToSquare(chessPiece);
    }


    public ChessSquare getChessSquare(String location) {
        int indexOfRow = COLUMN_CHARACTERS.indexOf(location.substring(0, 1));
        int indexOfColumn = Integer.parseInt(location.substring(1));
        return (ChessSquare) gameBoardSquares[indexOfRow][indexOfColumn - 1];
    }

    public void clearActiveChessBoard() {
        for (int outerIndex = 0; outerIndex < gameBoardSquares.length; outerIndex++) {
            for (int innerIndex = 0; innerIndex < gameBoardSquares[outerIndex].length; innerIndex++) {
                ChessSquare currentChessSquare = (ChessSquare) gameBoardSquares[innerIndex][outerIndex];
                currentChessSquare.setText("");
                currentChessSquare.restoreOriginalChessSquareColor();
                currentChessSquare.getOccupantsList().clear();
            }
        }
    }

    public JButton getGraphicalUserInterfaceButton(int index) {
        return graphicalUserInterfaceButtons.get(index);
    }

    public UserInputTextArea getUserInputTextArea(int index) {
        return userInputs.get(index);
    }

    private void populateBoardWithChessSquares() {
        Insets buttonInsets = new Insets(0, 0, 0, 0);

        for (int outerIndex = 0; outerIndex < gameBoardSquares.length; outerIndex++) {
            for (int innerIndex = 0; innerIndex < gameBoardSquares[outerIndex].length; innerIndex++) {

                ChessSquare currentChessSquare = new ChessSquare(COLUMN_CHARACTERS.substring(innerIndex, innerIndex + 1), outerIndex + 1);
                currentChessSquare.addActionListener(new ChessSquareClickEvent(this));

                currentChessSquare.setMargin(buttonInsets);
                ImageIcon chessSquareIcon = new ImageIcon(new BufferedImage(64, 64, 2));
                currentChessSquare.setIcon(chessSquareIcon);

                if (innerIndex % 2 == 1 && outerIndex % 2 == 1 || innerIndex % 2 == 0 && outerIndex % 2 == 0) {
                    setChessSquareColor(currentChessSquare, WHITE);
                } else {
                    setChessSquareColor(currentChessSquare, BLACK);
                }
                gameBoardSquares[innerIndex][outerIndex] = currentChessSquare;
            }
        }
    }

    private void setChessSquareColor(ChessSquare chessSquare, Color color) {
        chessSquare.setBackground(color);
        chessSquare.setChessSquareDefaultColor(color);
    }

    private void fillChessBoard() {
        fillInformationPanel();
        for (int outerIndex = 0; outerIndex < 8; outerIndex++) {
            for (int innerIndex = 0; innerIndex < 8; innerIndex++) {
                if (innerIndex == 0) {
                    gameBoard.add(new JLabel("" + (outerIndex + 1),
                            SwingConstants.CENTER));
                }
                gameBoard.add(gameBoardSquares[innerIndex][outerIndex]);
            }
        }
    }

    private void fillInformationPanel() {
        gameBoard.add(new JLabel(""));
        for (int index = 0; index < 8; index++) {
            gameBoard.add(new JLabel(COLUMN_CHARACTERS.substring(index, index + 1), SwingConstants.CENTER));
        }
    }

    private void addUserInputToolBar() {
        userToolBar.setFloatable(false);
        graphicalUserInterface.add(userToolBar, BorderLayout.PAGE_START);

        JButton createBoardButton = new JButton("Create Board");
        createBoardButton.addActionListener(new CreateBoardClickEvent(this));
        createBoardButton.setName("Create Button");
        graphicalUserInterfaceButtons.add(createBoardButton);
        userToolBar.add(createBoardButton);
        userToolBar.addSeparator();

        JButton clearBoardButton = new JButton("Clear Current Board");
        clearBoardButton.addActionListener(new ClearBoardClickEvent(this));
        clearBoardButton.setName("Clear Button");
        graphicalUserInterfaceButtons.add(clearBoardButton);
        userToolBar.add(clearBoardButton);
        userToolBar.addSeparator();

        UserInputTextArea redTeamInputArea = new UserInputTextArea("Input Red Team's Board Configuration Here");
        redTeamInputArea.setName("Red Team Configuration Text Field");
        userInputs.add(redTeamInputArea);
        userToolBar.add(redTeamInputArea);
        userToolBar.addSeparator();

        UserInputTextArea blueTeamInputArea = new UserInputTextArea("Input Blue Team's Board Configuration Here");
        blueTeamInputArea.setName("Blue Team Configuration Text Field");
        userInputs.add(blueTeamInputArea);
        userToolBar.add(blueTeamInputArea);
        userToolBar.addSeparator();

        UserInputTextArea legalTeamsReportTextArea = new UserInputTextArea("Legal Moves Will be Generated Here");
        legalTeamsReportTextArea.setName("Legal Capture");
        userInputs.add(legalTeamsReportTextArea);
        userToolBar.add(legalTeamsReportTextArea);
        userToolBar.addSeparator();
    }
}