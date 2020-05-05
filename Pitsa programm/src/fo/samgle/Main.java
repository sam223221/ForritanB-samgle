package fo.samgle;

import fo.samgle.Gera.*;
import fo.samgle.Vísa.GrillVisa;
import fo.samgle.Vísa.PitsaVisa;
import fo.samgle.Vísa.Visa;
import jdk.internal.dynalink.beans.StaticClass;

import javax.swing.*;
import java.util.ArrayList;


public class Main extends JFrame {
    private Pitsa           pitsaPanel;
    private Grill           grillPanel;
    private Startsíða       startsíðaPanel;
    private Visa            vísaPanel;
    private broytt_pitsa    broyttPitsa;
    private broytt_grill    broyttGrill;
    private GrillVisa       grillVisa;
    private PitsaVisa       pitsaVisa;

    public static DefaultListModel ListdataList                 = new DefaultListModel();
    public static DefaultListModel dataList                     = new DefaultListModel();
    public static ArrayList<MatInfo> bestidling                 = new ArrayList();
    public static ArrayList<ArrayList<MatInfo>> goymaBestidling = new ArrayList();


    public static void main(String[] args) {
        Main m = new Main();

        m.grillPanel        = new Grill();
        m.pitsaPanel        = new Pitsa();
        m.startsíðaPanel    = new Startsíða();
        m.vísaPanel         = new Visa();
        m.broyttPitsa       = new broytt_pitsa();
        m.broyttGrill       = new broytt_grill();
        m.pitsaVisa         = new PitsaVisa();
        m.grillVisa         = new GrillVisa();

        m.grillVisa.GrillVisa();
        m.pitsaVisa.PitsaVísa();

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
