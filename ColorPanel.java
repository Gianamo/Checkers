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
    
    
    
}