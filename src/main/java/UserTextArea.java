import javax.swing.*;
import java.awt.*;

public class UserTextArea extends JTextArea {
    private static final Dimension PREFERRED_SIZE = new Dimension(5, 20);

    UserTextArea(String initialTextOnCreation) {
        this.setPreferredSize(PREFERRED_SIZE);
        setText(initialTextOnCreation);
    }

}
