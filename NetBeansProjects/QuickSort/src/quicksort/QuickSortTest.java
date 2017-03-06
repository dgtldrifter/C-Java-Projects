/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quicksort;

/**
 *
 * @author mwalburn1201
 */
public class QuickSortTest {
    public static void main(String[] args)
    {
        //create object to perform selection sort
        QuickSort sortArray = new QuickSort(10);
        
        System.out.println("Before: ");
        System.out.println(sortArray); //print unsorted array
        
        sortArray.sort(); //sort array
        
        System.out.println("After: ");
        System.out.println(sortArray); //print sorted array
        
        
    }
}
