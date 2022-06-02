import javax.swing.*; //for making windows (Jframe, JPanel)
import java.awt.*; //for color
import java.util.*;
import java.awt.event.*;
/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main
{
    public static int turn = 1;
    
    static Square startSquare = null;
    static Square endSquare = null;
    
    public static void main(String[] args)
    {
        Board game = new Board();
        game.setSize(800,800);
        game.setResizable(false);
        game.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        
        int gameWon = 0;
        boolean valid;
        Prompter p = new Prompter();
        
        game.setVisible(true);
        while(gameWon == 0)
        {
            if(turn == 1)
            {
                System.out.println("Red's's Turn");
            }
            else if(turn == 2)
            {
                System.out.println("Black's Turn");
            }
            
            endSquare = null;
            while(endSquare == null) {}
            
            valid = game.move(turn, startSquare.getX(),startSquare.getY(),endSquare.getX(),endSquare.getY());
            while(!valid)
            {
                endSquare = null;
                while(endSquare == null) {}
                valid = game.move(turn, startSquare.getX(),startSquare.getY(),endSquare.getX(),endSquare.getY());
            }
            
            if(turn == 1)
            {
                turn = 2;
            }
            else if(turn == 2)
            {
                turn = 1;
            }
            gameWon = game.gameWinner();
        }
        if (gameWon == 1)
        {
            System.out.println("Red Wins");
        }
        else if (gameWon == 2)
        {
            System.out.println("Black Wins");
        }
        else
        {
            System.out.println("You broke it");
        }

    }
}