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
    public static void main(String[] args)
    {
        Board game = new Board();
        GridOutput o = new GridOutput();
        int gameWon = 0;
        int turn = 1;
        boolean valid;
        Prompter p = new Prompter();
        while(gameWon == 0)
        {
            GridOutput.print(game.print2());
            if(turn == 1)
            {
                System.out.println("Red's's Turn");
            }
            else if(turn == 2)
            {
                System.out.println("Black's Turn");
            }
            
       
            valid = game.move(turn,p.n(1),p.n(2),p.n(3),p.n(3));
            while(!valid)
            {
                
                System.out.println("Move invalid. Try again");
                game.print();
                valid = game.move(turn,p.n(1),p.n(2),p.n(3),p.n(3));
            }
            GridOutput.print(game.print2());
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