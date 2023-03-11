import javax.swing.*;
import java.awt.*;

public class UserInputTextArea extends JTextArea {
    private static final Dimension PREFERRED_SIZE = new Dimension(5, 20);

    UserInputTextArea(String initialTextOnCreation) {
        this.setPreferredSize(PREFERRED_SIZE);
        setText(initialTextOnCreation);
    }

}
