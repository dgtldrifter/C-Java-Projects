
/**
 * Class FunCP - write a description of the class here
 * 
 * @author (your name) 
 * @version (a version number)
 */

//java package imports 


import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class fun extends JApplet implements ActionListener
{
   int xone = 0, yone = 0, xtwo = 22, ytwo = 22;
   
   boolean first = true, assigned = false;
   
   private JMenuItem redI, greenI, blueI, cyanI,
                     magentaI, yellowI, blackI, pinkI,
                     oneI, tenI, twentyI, thirtyI,
                     fourtyI, lineI, circleI, ovalI,
                     squareI, rectangleI;
                     
   Color currentColor = Color.black;
                  
   //menu bar 
   JMenuBar menuMB;
   int shape;
   
   public void init()
   {
       menuMB = new JMenuBar();
       setJMenuBar(menuMB);
       
       setShapeMenu();
       setColorMenu();
       
       Container pane = getContentPane();
       pane.setBackground(Color.white);
       
        pane.addMouseListener(new MouseAdapter()
        {
           public void mouseClicked(MouseEvent event)
           {
               if (first)
               {
                   xone = event.getX();
                   yone = event.getY();
                   first = false;
                   assigned = true;
               }
               else
               {
                   xtwo = event.getX();
                   ytwo = event.getY();
                   first = true;
                   repaint();
               }
           }
        }
       );
    }
    
   private void setShapeMenu()
   {
       JMenu shapeM = new JMenu("Shape");
       menuMB.add(shapeM);
       
       lineI = new JMenuItem("Line");
       shapeM.add(lineI);
       lineI.addActionListener(this);
       
       circleI = new JMenuItem("CircleI");
       shapeM.add(circleI);
       circleI.addActionListener(this);
       
       ovalI = new JMenuItem("Oval");
       shapeM.add(ovalI);
       ovalI.addActionListener(this);
       
       squareI = new JMenuItem("Square");
       shapeM.add(squareI);
       squareI.addActionListener(this);
       
       rectangleI = new JMenuItem("Rectangle");
       shapeM.add(rectangleI);
       rectangleI.addActionListener(this);
   }
   
   private void setColorMenu()
   {
       JMenu colorM = new JMenu("Color");
       menuMB.add(colorM);
       
       redI = new JMenuItem("Red");
       colorM.add(redI);
       redI.addActionListener(this);
       
       greenI = new JMenuItem("Green");
       colorM.add(greenI);
       greenI.addActionListener(this);
       
       blueI = new JMenuItem("Blue");
       colorM.add(blueI);
       blueI.addActionListener(this);
       
       yellowI = new JMenuItem("Yellow");
       colorM.add(yellowI);
       yellowI.addActionListener(this);
       
       blackI = new JMenuItem("Black");
       colorM.add(blackI);
       blackI.addActionListener(this);
       
       pinkI = new JMenuItem("Pink");
       colorM.add(pinkI);
       pinkI.addActionListener(this);
       
       cyanI = new JMenuItem("Cyan");
       colorM.add(cyanI);
       cyanI.addActionListener(this);
       
       magentaI = new JMenuItem("Magenta");
       colorM.add(magentaI);
       magentaI.addActionListener(this);
       
       
   }
   
   public void paint(Graphics g)
   {
       //setting the first color and printing
       int fx, fy, w, h;
       
       super.paint(g);
       
       if(xone < xtwo)
            fx = xone;
       else
            fx = xtwo;
            
            if(yone < ytwo)
            fy = yone;
       else
            fy = ytwo;
            
       w = xtwo - xone;
       if (w < 0) w = -w;
       
       h = ytwo - yone;
       if (h < 0) h = -h;
       
       g.setColor(currentColor);
       
       if (assigned)
            switch (shape)
            {
                case 0:
                    g.drawLine(xone, yone+22, xtwo, ytwo+22);
                    break;
                        
                case 1:
                    g.drawOval(fx, fy + 22, w, w);
                    break;
                    
                case 2:
                    g.drawOval(fx, fy + 22, w, h);
                    break;
                    
                case 3:
                    g.drawRect(fx, fy + 22, w, w);
                    break;
                    
                case 4:
                    g.drawRect(fx, fy + 22, w, h);
                    break;
                
            }
   }
   
   public void actionPerformed(ActionEvent e)
   {
       JMenuItem mItem = (JMenuItem) e.getSource();
       
       if (mItem == lineI)
            shape = 0;
       else if (mItem == circleI)
            shape = 1;
       else if (mItem == ovalI)
            shape = 2;
       else if (mItem == squareI)
            shape = 3;
       else if (mItem == rectangleI)
            shape = 4;
       else if (mItem == redI)
            currentColor = Color.red;
       else if (mItem == greenI)
            currentColor = Color.green;
       else if (mItem == blueI)
            currentColor = Color.blue;
       else if (mItem == yellowI)
            currentColor = Color.yellow;
       else if (mItem == cyanI)
            currentColor = Color.cyan;
       else if (mItem == magentaI)
            currentColor = Color.magenta;
       else if (mItem == blackI)
            currentColor = Color.black;
       else if (mItem == pinkI)
            currentColor = Color.pink;
   }
}