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
import java.util.Random;

public class LinearArray {
    private int[] data;
    private static Random generator = new Random();
    
    public LinearArray(int size)
    {
        data = new int[size];
        
        for(int i = 0; i < size; i++)
            data[i] = 10 + generator.nextInt(90);
    }
    
    public int linearSearch(int search)
    {
        return recursiveLinearSearch(search, 0);
    }
    
    public int recursiveLinearSearch(int search, int start)
    {
        int location;
        
        if (start >= data.length)
            location = -1;
        else
        {
            if (data[start] == search)
                location = start;
            else
                location = recursiveLinearSearch(search, start + 1);
        }
        
        return location;
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