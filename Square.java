import javax.swing.*;
import java.awt.*;

/**
 * Write a description of class Square here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Square extends JPanel
{
    private Piece p;
    private boolean isValid;// says whether or not a square is a valid spot to be
    
    public Square(int rank, int color, int x, int y)
    {
        isValid = (x + y) % 2 == 1;
        p = new Piece(rank, color, isValid);
        
        if(isValid) 
        {
            setBackground(Color.white);
        }
        else 
        {
            setBackground(Color.black);
        }
        setLayout(new GridLayout(1,1));
        add(p);
    }
    
    public Square(int rank, int color, boolean valid)
    {
        isValid = valid;
        p = new Piece(rank, color, isValid);
        
        if(isValid) 
        {
            setBackground(Color.white);
        }
        else 
        {
            setBackground(Color.black);
        }
        setLayout(new GridLayout(1,1));
        add(p);
    }
    
    public int getColor()
    {
        return p.getColor();
    }
    
    public int getRank()
    {
        return p.getRank();
    }
    
    public void setColor(int c)
    {
        p.setColor(c);
    }
    
    public void setRank(int r)
    {
        p.setRank(r);
    }
    
    public boolean getValid()
    {
        return isValid;
    }
    
    public Square copy()
    {
        Square x = new Square(p.getRank(), p.getColor(), isValid);
        return x;
    }
    
    public void reset()
    {
        this.setRank(0);
        this.setColor(0);
    }
}
