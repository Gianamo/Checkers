import java.util.Scanner;
/**
 * Write a description of class Prompter here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Prompter
{
    static Scanner s = new Scanner(System.in);
    public static int n(int q)
    {
        if(q == 1)
        {
            System.out.println("What is the vertical value of the piece you want to move?");
        }
        else if(q == 2)
        {
            System.out.println("What is the horizontal value of the piece you want to move?");
        }
        else if(q == 3)
        {
            System.out.println("What is the vertical value of the square you want to move to?");
        }
        else
        {
            System.out.println("What is the horizontal value of the square you want to move to");
        }
        return s.nextInt();
    }
}
