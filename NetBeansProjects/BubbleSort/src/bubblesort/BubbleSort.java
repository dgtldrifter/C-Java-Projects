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
import java.util.Random;

public class BubbleSort {
    private int[] data;
    private static Random generator = new Random();
    
    public BubbleSort(int size)
    {
        data = new int[size];
        
        for (int i = 0; i < size; i++)
            data[i] = 10 + generator.nextInt(90);
    }
    
    public void sort()
    {
        for (int pass = 1; pass < data.length; pass++)
        {
            for (int index = 0; index < data.length - 1; index++)
            {
                if (data[index] > data[index + 1])
                    swap(index, index + 1);
            }
        }
    }
    
    public void swap(int first, int second)
    {
        int temporary = data[first];
        data[first] = data[second];
        data[second] = temporary;
    }
    
    public String toString()
    {
        StringBuilder temporary = new StringBuilder();
        
        for (int element : data)
            temporary.append(element + " ");
        
        temporary.append("\n");
        return temporary.toString();
    }
}
