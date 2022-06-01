import javax.swing.*;
import java.awt.*;
/**
 * Write a description of class ColorPanel here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Piece extends JPanel
{
    int r;
    int c;
    public Piece(int rank, int color)
    {
       r = rank;
       c = color;
       repaint();
    }
    public Piece()
    {
        
    }
    
    public int getRank() {
        return r;
    }
    public int getColor() {
        return c;
    }
    
    public void setRank(int r) {
        this.r = r;
    }
    public void setColor(int c) {
        this.c = c;
    }
    
    public void setBRnC(int rank, int color)
    {
        r = rank;
        c = color;
        
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