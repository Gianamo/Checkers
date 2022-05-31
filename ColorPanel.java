import javax.swing.*;
import java.awt.*;
/**
 * Write a description of class ColorPanel here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ColorPanel extends JPanel
{
    int r;
    int c;
    public ColorPanel(Color backColor, int rank, int color)
    {
       setBackground(backColor);
       r = rank;
       c = color;
    }
    public ColorPanel()
    {
        
    }
    
    public void setBRnC(Color backColor, int rank, int color)
    {
        setBackground(backColor);
        r = rank;
        c = color;
        repaint();
    }
    
    @Override
    public void paintComponent(Graphics g)
    {
       super.paintComponent(g);
       Graphics2D g2 = (Graphics2D)g;
       if(r >= 1)
       {
           if(c == 1)
           {
               g2.setColor(Color.red);
           }
           else
           {
               g2.setColor(Color.black);
           }
           g2.fillOval(0,0,100,100);
           if(r > 1)
           {
               g2.setColor(Color.yellow);
               g2.fillOval(25,25,50,50);
           }
       }
    }

    
}