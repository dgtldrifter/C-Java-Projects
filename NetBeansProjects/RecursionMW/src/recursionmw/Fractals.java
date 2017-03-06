/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursionmw;

/**
 *
 * @author mwalburn1201
 */
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JColorChooser;

public class Fractals extends JFrame
{
    private final int WIDTH = 400;
    private final int HEIGHT = 480;
    private final int MIN_LEVEL = 0, MAX_LEVEL = 15;
    private Color color = Color.GREEN;
    
    private JButton increaseLevelJButton, decreaseLevelJButton;
    private JLabel levelJLabel;
    private FractalJPanel drawSpace;
    private JPanel mainJPanel, controlJPanel;
    
    //set up GUI
    public Fractals()
    {
        super("Fractal");
        
        //set up control panel
        controlJPanel = new JPanel();
        controlJPanel.setLayout(new FlowLayout());
        
        //set up decrease level button to add to control panel and
        // register listener
        decreaseLevelJButton = new JButton("Decrease Level");
        controlJPanel.add(decreaseLevelJButton);
        decreaseLevelJButton.addActionListener(
            new ActionListener() //anonymous inner class
            {
                //process decreaseLevelJButton event
                public void actionPerformed(ActionEvent event)
                {
                    int level = drawSpace.getLevel();
                    level--;
                    
                    if ((level >= MIN_LEVEL) &&
                            (level <= MAX_LEVEL))
                    {
                        levelJLabel.setText("Level: " + level);
                        drawSpace.setLevel(level);
                        repaint();
                    }
                }
            }
        ); //end addActionListener
        
        //set up increase level button to add to control panel
        //and register listener
        increaseLevelJButton = new JButton("Increase Level");
        controlJPanel.add(increaseLevelJButton);
        increaseLevelJButton.addActionListener(
            new ActionListener() // anonymous inner class
            {
                //process increaseLevelJButton event
                public void actionPerformed(ActionEvent event)
                {
                    int level = drawSpace.getLevel();
                    level++;
                    
                    if ((level >= MIN_LEVEL) &&
                            (level <= MAX_LEVEL))
                    {
                        levelJLabel.setText("Level: " + level);
                        drawSpace.setLevel(level);
                        repaint();
                    }
                }
            }
        );//end addActionListener
        
        //set uplevelJLabel to add to controlJPanel
        levelJLabel = new JLabel ("Level: 0");
        controlJPanel.add(levelJLabel);
        
        drawSpace = new FractalJPanel(0);
        
        mainJPanel = new JPanel();
        mainJPanel.add(controlJPanel);
        mainJPanel.add(drawSpace);
        
        add(mainJPanel);
        
        setSize(WIDTH, HEIGHT);
        setVisible(true);
    }
    
    public static void main(String args[])
    {
        Fractals demo = new Fractals();
        demo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}// end class fractal
