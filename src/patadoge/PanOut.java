package patadoge;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanOut extends JPanel {

    ImageIcon imgHeader;
//    JButton btnHeader;
    JLabel lblHeader;

    public PanOut() {
        lblHeader = new JLabel();
        imgHeader = new ImageIcon("cow1.jpg");
        lblHeader.setIcon(imgHeader);
        add(lblHeader);
        this.setBackground(new Color(253, 5, 253));

//        header as a button does not work
//        btnHeader = new JButton();
//        imgHeader.getImage();
//        btnHeader.setIcon(imgHeader);
//        add(btnHeader);
    }
}