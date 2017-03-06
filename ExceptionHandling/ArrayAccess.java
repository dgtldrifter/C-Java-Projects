
/**
 * Write a description of class ArrayAccess here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ArrayAccess
{
    private JTextField inputField;
    private JTextField retrieveField1;
    private JTextField retrieveField2;
    private JTextField outputField;
    private JPanel inputArea;
    private JPanel retrieveArea;
    private JPanel outputArea;
    
    private int num;
    private int index = 0;
    private int array[] = new int[ 10 ];
    private String result;
    
    //set up GUI
    public ArrayAccess()
    {
        super("Accessing Array values");
        setLayout(new FlowLayout());
        
        //set up input Panel
        inputArea = new JPanel();
        inputArea.add(new JLabel("Enter array elements here"));
        inputField = new JTextField(10);
        inputArea.add(inputField);
        inputField.addActionListener(
            new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    try
                    {
                        num = Integer.parseInt(inputField.getText());
                        array[index] = number; //place value in array
                        index++;
                    }
                    catch(NumberFormatException formatException)
                    {
                        JOptionPane.showMessageDialog(null, 
                        "Please enter only integer values",
                        "Invalid Input", JOptionPane.ERROR_MESSAGE);
                    }
                    catch(ArrayIndexOutOfBoundsException outOfBounds)
                    {
                        JOptionPane.showMessageDialog(null,
                        "Array may contain only 10 elements",
                        "Array full", JOptionPane.ERROR_MESSAGE);
                    }
                    
                    inputField.setText("");
                }//end actionPerformed
            }//end anonymous inner class
        );//end call to addActionListener
        
        //set up retrieve Panel
        retrieveArea = new JPanel(new GridLayout(2, 2));
        retrieveArea.add(new JLabel("Enter number to retrieve"));
        retrieveField1 = new JTextField(10);
        retrieveArea.add(retrieveField1);
        
        retrieveField1.addActionListener(
            new ActionListener()
            {
                public void actionPerformed(ActionEvent event)
                {
                    try
                    {
                        num = Integer.parseInt(retrieveField1.getText());
                        boolean found = false;
                        result = Stirng.format(
                        "%d was in the following fields of the array: ", num);
                        
                        for (int i = 0; i < index; i++)
                        {
                            if(num == array[i])
                            {
                                result += String.format("%d ", i);
                                found = true;
                            }//end if
                        }//end for
                        
                        if (found == false)
                            throw new NumberNotFoundException();
                        
                        outputField.setText(result);
                    }//end try
                    catch(NumberFormatException formatException)
                    {
                        JOptionPane.showMessageDialog(null,
                        "Please enter only integer values",
                        "Invalid input", JOptionPane.ERROR_MESSAGE);
                    }//end catch
                    catch(NumberNotFoundException numberException)
                    {
                        JOptionPane.showMessageDialog(null, numberException.getMessage(),
                        "Not Found", JOptionPane.ERROR_MESSAGE);
                    }//end catch
                    
                    retrieveField1.setText("");
                }//end method actionPeforned
            }//end anonymous inner class
        );//end call to addActionListener
        
        retrieveArea.add(new JLabel("Enter index to retrieve"));
        retrieveField2 = new JTextField(10);
        retrieveArea.add(retrieveField2);
        retrieveField2.addActionListener(
            new ActionListener()
            {
                public void actionPerformed(ActionEvent event)
                {
                    try 
                    {
                        num = Integer.parseInt(retrieveField2.getText());
                        
                        if(num >= index || num < 0)
                            throw new ArrayIndexOutOfBoundsException("Index Not Found.");
                        
                        outputField.setText(String.format(
                        "The number at index %d is %d", num, array[num]));
                    }//end try
                    
                    catch(NumberFormatException formatException)
                    {
                        JOptionPane.showMessageDialog(null,
                        "Array indices must be integer values",
                        "Invalid Input", JOptionPane.ERROR_MESSAGE);
                    }//end catch
                    catch(ArrayIndexOutOfBoundsException outOfBounds)
                    {
                        JOptionPane.showMessageDialog(null, outOfBounds.getMessage(),
                        "Index Out of Bounds", JOptionPane.ERROR_MESSAGE);
                    }//end catch
                    
                    retrieveField2.setText("");
                }//end anonymous inenr class
            }//end new ActionListener
        );//end call to newActionListener
        
        //st up output Panel
        outputArea = new JPanel();
        outputArea.add(new JLabel("Result"));
        outputField = new JTextField(30);
        outputField.setEditable(false);
        outputArea.add(outputField);
        add(inputArea);
        add(retrieveArea);
        add(outputArea);
    }//end constructor
}
