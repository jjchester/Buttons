package patadoge;

import javax.swing.*;
import java.awt.*;

public class PanMain extends JPanel // panel definition
{
    PanOut panOut = new PanOut();
    PanTimer panTimer = new PanTimer();

    PanScore panScore = new PanScore();
    PanGame panGame = new PanGame(panScore);
    PanRules panRules = new PanRules();
    //private PanOut PanOut;
    //private PanScore PanScore;

    public PanMain() {
        // this next line tells PanMain that it has a border layout.
        setLayout(new BorderLayout());
        add(panOut, BorderLayout.NORTH);
        add(panGame, BorderLayout.CENTER);
        add(panScore, BorderLayout.EAST);
        add(panTimer, BorderLayout.WEST);
        add(panRules, BorderLayout.SOUTH);
    }
}