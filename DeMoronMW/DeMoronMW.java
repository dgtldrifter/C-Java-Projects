
/**
 * Write a description of class DeMoronMW here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DeMoronMW
{
    public static void main(String[] args)
    {
        int x = 6;
        int y = 0;
        
        //NOT(x 'LESS THAN' 5) AND NOT(y 'GREATER THAN OR EQUAL TO' 7) is true
        System.out.printf("!(x < 5) && !(y >= 7) is %b%n", (!(x < 5) && !(y >= 7)));
        //NOT the equation of (x LESS THAN 5) OR (y GREATER THAN OR EQUAL TO 7) is true
        System.out.printf("!((x < 5) || (y >= 7)) is %b%n", (!((x < 5) || (y >= 7))));
        
        int a = 8;
        int b = 22;
        int g = 88;
        
        //the term of (a DOES NOT EQUAL b) OR (g EUQALS 5) is true
        System.out.printf("!(a == b) || !(g != 5) is %b%n", (!(a == b) || !(g != 5)));
        //the equation of ((a DOES NOT EQUAL b) AND (g EQUALS 5)) is true
        System.out.printf("!((a == b) && !(g != 5)) is %b%n", (!((a == b) && (g != 5))));
        
        x = 8;
        y = 2;
        
        //the equation of ((x GREATER THAN 8) AND (y LESS THAN OR EQUAL TO 4)) is true
        System.out.printf("!((x <= 8) && (y > 4)) is %b%n", (!((x <= 8) && (y > 4))));
        //the equation of ((x GREATER THAN 8) OR (y LESS THAN OR EQUAL TO 4)) is true
        System.out.printf("!((x <= 8) || !(y > 4)) is %b%n", (!(x <= 8) || !(y > 4)));
        
        int j = 0;
        int k = 7;
        
        //the equation of ((j LESS THAN OR EQUAL TO 4) OR (k LESS THAN 6)) is true
        System.out.printf("!((j > 4) || ( k <= 6)) is %b%n",(!((j > 4) || ( k <= 6))));
        //the equation of (j LESS THAN OR EQUAL TO 4) OR (k LESS THAN 6)) is true
        System.out.printf("!(j > 4) || !( k <= 6) is %b%n",(!(j > 4) || !( k <= 6)));
    }
}
