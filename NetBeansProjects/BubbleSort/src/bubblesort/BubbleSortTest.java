/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bubblesort;

/**
 *
 * @author mwalburn1201
 */
public class BubbleSortTest {
    public static void main(String[] args)
    {
        BubbleSort sortArray = new BubbleSort(10);
        
        System.out.println("Before: ");
        System.out.println(sortArray);
        
        sortArray.sort();
        
        System.out.println("After: ");
        System.out.println(sortArray);
    }
}
