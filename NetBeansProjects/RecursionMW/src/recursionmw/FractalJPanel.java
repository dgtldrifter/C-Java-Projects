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
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JPanel;

public class FractalJPanel extends JPanel
{
    private Color color;
    private int level;
    
    private final int WIDTH = 400;
    private final int HEIGHT = 400;
    
    //set the initial fractal level to the value specified
    //and set up Panel specifications
    public FractalJPanel (int currentLevel)
    {
        color = Color.GREEN;
        level = currentLevel;
        setBackground(Color.WHITE);
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
    }
    
    //draw fractal recursively
    public void drawFractal(int level, int xA, int yA, int xB,
            int yB, Graphics g)
    {
        //base case: draw a line connecting two given points
        if (level == 0)
            g.drawLine(xA,yA,xB,yB);
        else
        {
            //calculate midpooint between (xA, yA) and (xB, yB)
            int xC = (xA + xB) / 2;
            int yC = (yA + yB) / 2;
            
            //calculate the forurth point (xD, yD) which forms an
            //isosceles right triangles between (xA, yA) and (xC, YC)
            //where the right angle is at (xD, yD
            int xD = xA + (xC - xA) / 2 - (yC - yA) / 2;
            int yD = yA + (yC - yA) / 2 - (xC - xA) / 2;
            
            //recursively draw the Fractal
            drawFractal(level - 1, xD, yD, xA, yA, g);
            drawFractal(level - 1, xD, yD, xC, yC, g);
            drawFractal(level - 1, xD, yD, xB, yB, g);
        }
    }
    
    public void paintComponent(Graphics g)
    {
        super. paintComponent(g);
        
        g.setColor(Color.BLUE);
        drawFractal(level, 190, 190, 120,100, g);
        
        g.setColor(Color.PINK);
        drawFractal(level, 190,190,75,220,g);
        
        g.setColor(Color.ORANGE);
        drawFractal(level, 190,190,190,300,g);
        
        g.setColor(Color.GREEN);
        drawFractal(level, 190,190, 310, 220, g);
        
        g.setColor(Color.RED);
        drawFractal(level, 190, 190, 270, 100, g);
    }
    public void setColor(Color c)
    {
            color  = c;
    }
    public void setLevel(int currentLevel)
    {
            level = currentLevel;
    }
    public int getLevel()
    {
        return level;
    }
}//end class fractalJPanel
