package patadoge;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class PanTimer extends JPanel // timer
{
    int nTimer;
    String sTimer;
    private JLabel lblCount;
    Timer timer;

    public PanTimer() {
        timer = new Timer(1000, updateTask);        
        nTimer = 0;
        timer.start();
        lblCount = new JLabel("0");
        add(lblCount);
        this.setBackground(new Color(253, 5, 253));
    }

    void UpdateLabel(int _nTimer) {
        nTimer = _nTimer;
        sTimer = Integer.toString(nTimer);
        lblCount.setText(sTimer);
    }
    ActionListener updateTask = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent evt) {
            nTimer++;
            UpdateLabel(nTimer);
        }
    };
}