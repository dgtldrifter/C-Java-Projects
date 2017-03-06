
/**
 * Write a description of class star here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class star
{
    public static void main(String[] args)
    {
        int row = 1;
        
        while (row <= 7)
        {
            int column = 1;
            if (row % 2 == 0)
                System.out.print(" ");
                
            while (column <= 7)
            {
                System.out.print("* ");
                column++;
            }
            
            System.out.println();
            row++;
            
        }
    }
}