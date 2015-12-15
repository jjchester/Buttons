//Skip to content
//This repository  
//Search
//Pull requests
//Issues
//Gist
// @Slict
// Watch 1
//  Star 0
//  Fork 0 Mrgfhci/Cards
// Code  Issues 0  Pull requests 0  Wiki  Pulse  Graphs
//Branch: master Find file Copy pathCards/src/patadoge/PanGame.java
//e0ddc8f  on Jun 28
//@MrGTemp MrGTemp Wack a mole - aka Pat-a-Doge
//1 contributor
//RawBlameHistory     95 lines (86 sloc)  2.6 KB
package patadoge;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import javax.swing.*;

public class PanGame extends JPanel implements KeyListener {

    BtnDoge arBtnDoge[] = new BtnDoge[16];
    Map<Character, Integer> map = new HashMap<>();
    Timer timerDoge;
    int nTimer;
    int ranDoge;
    int nScore;
    Random r = new Random();
    PanScore panScore;
    boolean bScore = false, bStart = true;
    String sButton;

    public PanGame(PanScore _panScore) {
        panScore = _panScore;
        timerDoge = new Timer(1500, updateDoge); //timer to randomize doge pop ups
        nTimer = 0;
        timerDoge.start();
        setFocusable(true);
        requestFocus();
        map.put('1', 0);
        map.put('2', 1);
        map.put('3', 2);
        map.put('4', 3);
        map.put('q', 4);
        map.put('w', 5);
        map.put('e', 6);
        map.put('r', 7);
        map.put('a', 8);
        map.put('s', 9);
        map.put('d', 10);
        map.put('f', 11);
        map.put('z', 12);
        map.put('x', 13);
        map.put('c', 14);
        map.put('v', 15);
        this.setLayout(new GridLayout(4, 4));
        for (int i = 0; i < arBtnDoge.length; i++) {
            char ch[] = {'1', '2', '3', '4', 'q', 'w', 'e', 'r', 'a', 's', 'd', 'f', 'z', 'x', 'c', 'v'};
            arBtnDoge[i] = new BtnDoge(i);
            add(arBtnDoge[i]);
            String sCh = "";
            sCh += ch[i];
            arBtnDoge[i].setName(sCh);
            System.out.println(arBtnDoge[i].getName());
            //System.out.println("Button" + i +" created");
        }
        //  randomize();
        addKeyListener(this);
    }

    //randomize doge
    public void randomize() {
        // I needed to use the bStart var so that the upper left square was not
        // flipped immediately with the first random Doge.
        // if the user did not score, flip the previous Doge before getting a
        // new random Doge and flipping it.
        if (!bScore && !bStart) {
            arBtnDoge[ranDoge].flip();
        }
        ranDoge = r.nextInt(16);
        sButton = arBtnDoge[ranDoge].getName();
        arBtnDoge[ranDoge].flip();
        bScore = false;
        bStart = false;
    }

    @Override
    public void keyTyped(KeyEvent e) {
        for (int i = 0; i < arBtnDoge.length; i++) {
            if (e.getKeyChar() == ranDoge) {
            };
        }
    }

    @Override
//    public void keyPressed(KeyEvent e) {
//        int nKey = e.getKeyCode();
//        int nNewKey = nKey - 96;
//        Integer value = map.get(nNewKey);
//        //try {
//        if (value == ranDoge) {
//            arBtnDoge[value].flip();
//            nScore++;
//            //System.out.println(nScore);
//            panScore.UpdateScoreLabel(nScore);
//            bScore = true;
//        }
//    }
    public void keyReleased(KeyEvent e) {
    }
    ActionListener updateDoge = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent evt) {
            randomize();
        }
    };

    @Override
    public void keyPressed(KeyEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
