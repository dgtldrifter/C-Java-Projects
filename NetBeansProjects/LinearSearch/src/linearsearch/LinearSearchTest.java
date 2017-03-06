/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linearsearch;

/**
 *
 * @author mwalburn1201
 */
import java.util.Scanner;
public class LinearSearchTest {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        LinearArray searchArray = new LinearArray(10);
        System.out.println(searchArray);
        
        System.out.printf(
            "%nPlease enter an integer value(-1 to quit): ");
        int searchInt = input.nextInt();
        
        while (searchInt != -1)
        {
            int position = searchArray.linearSearch(searchInt);
            
            if(position == -1)
                System.out.printf("The integer " + searchInt + 
                        "was not found.%n%n");
            else
                System.out.printf("The integer " + searchInt + 
                        "was found in position " + position + ".%n%n");
            
            System.out.print(
                "Please enter aninteger value(-1 to quit): ");
            searchInt = input.nextInt();
        }
    }
}
