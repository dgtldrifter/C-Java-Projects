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
//Class that creates an integer array filled with random
// values and can sort that array using the quicksort algorithm
import java.util.Random;

public class QuickSort {
    private int[] data; //array of values
    private static Random generator = new Random();
    
    //create array of giveln size and fill with random integers
    public QuickSort(int size)
    {
        data = new int[size]; // create space for array
        
        //fill array with random ints in range 10-99
        for (int i = 0; i < size; i++)
            data[i] = 10 + generator.nextInt(90);
    }
    
    //call recursive method quicksortHelper
    public void sort()
    {
        quickSortHelper(0, data.length - 1);
    }
    
    //recursive method to sort array using quicksort
    private void quickSortHelper(int left, int right)
    {
        int pivot = partition(left, right);
        
        if (left < pivot - 1) // if more than one element on left
            quickSortHelper(left, pivot - 1); //sort left side
        
        if (pivot + 1 < right) // if more than one element on right
            quickSortHelper(pivot + 1, right); //sort right side
    }
    
    //partition the given range andn return final index of pivot
    private int partition(int left, int right)
    {
        int pivot = left; // index of pivot element
        
        //loop until two edges meet
        while(true)
        {
            //search for ata to right of pivot greater tahn pivot
            while (data[right] >= data[pivot])
            {
                if(right == pivot)
                    return pivot;// partitioning completed
                
            --right; // move left one element
            }
            
            swap(pivot, right); // move right element in correct lovation
            pivot = right--; //update pivot location and move right edge left
            
            while (data[left] <= data[pivot])
            {
                if(left == pivot)
                    return pivot;// partitioning completed
                
                ++left; //move right one element
            }
            
            swap(pivot, left); // move left element inot correct location
            pivot = left++; //update pivot location and move left edge right
        }
    }
    
    // method to swap values in two elements
    private void swap(int first, int second)
    {
        int temporary = data[first]; // store first in temporary
        data[first] = data[second]; //replace first with second
        data[second] = temporary; // put temporary in second
    }
    
    //method to output values in array
    public String toString()
    {
        StringBuilder temporary = new StringBuilder();
        
        //iterate through array
        for (int element : data)
            temporary.append(element + " ");
        
        temporary.append("\n"); // add endlive character
        return temporary.toString();
    }
}
