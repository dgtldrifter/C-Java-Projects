/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bucketsort;

/**
 *
 * @author mwalburn1201
 */
public class BucketSortTest {
    public static void main(String[] args)
    {
        //create object to perform bucket sort
        BucketSort sortArray = new BucketSort(10);
        
        System.out.println("Before: ");
        System.out.println(sortArray);
        
        sortArray.sort();
        
        System.out.println("After: ");
        System.out.println(sortArray);
    }
}
