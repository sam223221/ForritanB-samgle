package fo.samgle;

import javax.swing.*;
import java.awt.*;

public class ViewBase extends JPanel {

    protected Main getMain() {
        boolean foundMain = false;
        Container currentContainer = this.getParent();
        while (!foundMain && currentContainer != null) {
            if (currentContainer.getParent() instanceof Main) {
                foundMain = true;
            }
            currentContainer = currentContainer.getParent();
        }
        if (foundMain) {
            return (Main)currentContainer;
        } else {
            return null;
        }
    }
}
