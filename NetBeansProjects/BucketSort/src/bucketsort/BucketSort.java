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
import java.util.Random;

public class BucketSort {
    private int[] data; 
    private static Random generator = new Random();
    
    public BucketSort(int size)
    {
        data = new int[size];
        
        for(int i = 0; i < size; i++)
            data[i] = 10 + generator.nextInt(90);
    }
    
    public void sort()
    {
        int totalDigits = numberOfDigits();
        
        int pail[][] = new int[10][data.length];
        
        //go through all digit places and srot each number
        //according to digit value
        for (int pass = 1; pass <= totalDigits; pass++)
        {
            distributeElements(pail, pass); //distribution pass
            collectElements(pail); //gathering pass
            
            if (pass != totalDigits)
                emptyBucket(pail); //set size of buckets to 0
        }
    }
    
    //determine number of digits in the largest number
    public int numberOfDigits()
    {
        int largest = data[0]; //set largest to first element
        
        for (int element : data)
            if (element > largest)
                largest = element;
        
        int digits = (int) (Math.log10(largest) + 1);
        return digits;
    }
    
    public void distributeElements(int pail[][], int digit)
    {
        int divisor = (int) (Math.pow(10, digit));
        
        for (int element : data)
        {
            int bucketNumber = (element % divisor) / (divisor / 10);
            
            int elementNumber = ++pail[bucketNumber][0];
            pail[bucketNumber][elementNumber] = element;
        }
    }
    
    public void collectElements(int pails[][])
    {
        int subscript = 0;
        
        for (int i = 0; i < 10; i++)
            for(int j = 1; j <= pails[i][0]; j++)
                data[subscript++] = pails[i][j];
    }
    
    public void emptyBucket(int pails[][])
    {
        for(int i = 0; i < 10; i++)
                pails[i][0] = 0;
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
