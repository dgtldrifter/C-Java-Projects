/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reverselistmw;

/**
 *
 * @author mwalburn1201
 */
import java.util.LinkedList;
import java.util.List;

public class ReverseListMW 
{
    public static void main(String[] args)
    {
    //create two linked lilsts
    LinkedList<Character> list1 = new LinkedList<Character>();
    LinkedList<Character> list2 = new LinkedList<Character>();
    
    //use  List insert methods
    list1.addFirst('5');
    list1.addFirst('@');
    list1.addLast('V');
    list1.addLast('+');
    list1.addFirst('P');
    list1.addFirst('c');
    list1.addLast('M');
    list1.addLast('&');
    list1.addFirst('y');
    list1.addLast('X');
    
    System.out.println("List: ");
    System.out.println(list1);
    
    list2 = reverse(list1); //reverse lists using method reverse
    System.out.println("Reversed list is: ");
    System.out.println(list2);
    }


//reverses a list and returns it to the caller
public static LinkedList<Character> reverse(List<Character> one)
{
    LinkedList<Character> reversed = new LinkedList<Character>();

    for(char element : one)
        reversed.addFirst(element);

    return reversed;
}
}
