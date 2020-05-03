package fo.samgle;

import javax.swing.*;
import java.util.ArrayList;


public class Main extends JFrame {
    private Pitsa pitsaPanel;
    private Grill grillPanel;
    private Startsíða startsíðaPanel;
    private Vísa vísaPanel;
    public static DefaultListModel dataList     = new DefaultListModel();
    public static ArrayList<PitsaInfo> bestidling   = new ArrayList();

    public static void main(String[] args) {
        Main m = new Main();

        m.grillPanel                = new Grill();
        m.pitsaPanel                = new Pitsa();
        m.startsíðaPanel            = new Startsíða();
        m.vísaPanel                 = new Vísa();


        m.NavigateTo("Startsíða");
        m.setSize(900, 1000);
        m.setResizable(false);
        m.setLocationRelativeTo(null);
        m.setDefaultCloseOperation(EXIT_ON_CLOSE);
        m.setVisible(true);


    }

    public void NavigateTo(String panelId) {
        this.remove(pitsaPanel);
        this.remove(grillPanel);
        this.remove(startsíðaPanel);
        this.remove(vísaPanel);
        if (panelId == "Startsíða") {
            this.add(startsíðaPanel);
        } else if (panelId == "Pitsa") {
            this.add(pitsaPanel);
        }else if (panelId == "Grill"){
            this.add(grillPanel);
        }else if (panelId == "Vísa"){
            this.add(vísaPanel);
        }
        this.repaint();
    }
}
