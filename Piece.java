import javax.swing.*; //for making windows (Jframe, JPanel)
import java.awt.*; //for color
import java.util.*;
import java.awt.event.*;
public class Piece
{
    private int rank; //0 for empty, 1 for normal, 2 for king
    private int color;//0 for empty, 1 for white, 2 for black
    public Piece()
    {
    }
    
    public int getColor()
    {
        return color;
    }
    
    public int getRank()
    {
        return rank;
    }
    
    public void setColor(int c)
    {
        color = c;
    }
    
    public void setRank(int r)
    {
        rank = r;
    }
}
