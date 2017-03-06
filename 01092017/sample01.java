
/**
 * Write a description of class sample01 here.
 * 
 * Micheal Walburn 
 * version 1
 */

import java.util.Scanner;

public class sample01
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        int radius = 0;
        
        System.out.print("Enter radius: "); //prompt for input
        radius = input.nextInt(); //read number
        
        System.out.printf("Diameter is %d%n", (2 * radius));
        System.out.printf("Circumference is %f%n", (2 * Math.PI * radius));
        System.out.printf("Area is %f%n", (Math.PI * radius * radius));
    }//end main
}