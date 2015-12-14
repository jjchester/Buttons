package patadoge;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class PanRules extends JPanel // displays rules if button is clicked
{

    JButton btnRules;

    public PanRules() {

        btnRules = new JButton("Rules");
        btnRules.setFocusable(false);
        add(btnRules);
        AL rules = new AL();
        btnRules.addActionListener(rules);
        this.setBackground(new Color(253, 5, 253));
    }

    class AL implements ActionListener {

        private Component frame;

        @Override
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(frame, "Your son is the villain at"
                    + " the end of Fallout 4. You kill him"
                    + " or nuke the commonwealth.");
        }
    }
}