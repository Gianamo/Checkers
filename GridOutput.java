import javax.swing.*; //for making windows (Jframe, JPanel)
import java.awt.*; //for color
import java.util.*;
import java.awt.event.*;
public class GridOutput
    {
        
        public static void print(Square[][] board)
        {
            Container pane;
            ColorPanel[][] panels;
            JFrame myWindow = new JFrame();
            myWindow.setTitle("Checkers");
            myWindow.setSize(800,800);
            myWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            myWindow.setResizable(false);
            myWindow.setUndecorated(true);
            Color color = UIManager.getColor("activeCaptionBorder");
            myWindow.getRootPane().setBorder(BorderFactory.createLineBorder(color, 4));
            panels = new ColorPanel[8][8];
            pane =  myWindow.getContentPane();
            pane.setLayout(new GridLayout(8,8));
            myWindow.setVisible(true);
            for(int r = 0; r < 8; r++)
            {
                for(int c = 0; c < 8; c++)
                {
                    panels[r][c] = new ColorPanel(); 
                    if(!board[r][c].getValid())
                    {
                        panels[r][c].setBRnC(Color.black,0,0);
                    }
                    else
                    {
                        panels[r][c].setBRnC(Color.white,board[r][c].getRank(), board[r][c].getColor());
                    } 
                    pane.add(panels[r][c]);
                }
            }
            myWindow.setVisible(true);
        }
        
    }