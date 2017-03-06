
/**
 * Encrypts digits in a specific way.
 * 
 * Micheal Walburn  
 * ver. 1
 */
import java.util.Scanner;
public class encryptionMW
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        int temp1 = 0;
        int temp2 = 0;
        int temp3 = 0;
        int temp4 = 0;
        int encryptedNum = 0;
        
        //asks for digit input; initializes variables
        System.out.print("Input a four digit number :");
        int number = input.nextInt();
        
        String num = Integer.toString(number);
        int thousands = Character.digit(num.charAt(0), 10);
        int hundreds = Character.digit(num.charAt(1), 10);
        int tens = Character.digit(num.charAt(2), 10);
        int ones = Character.digit(num.charAt(3), 10);
        
        //adds 7 to all the digits
        thousands += 7;
        hundreds += 7;
        tens += 7;
        ones += 7;
        
        //constructs the number
        thousands *= 1000;
        hundreds *= 100;
        tens *= 10;
        
        number = thousands + hundreds + tens + ones;
        
        //divides number by 10
        number = number / 10;
        
        //swaps 1st and 3rd digits, and 2nd and 4th digits
        String num2 = Integer.toString(number);
        if (number >= 1000)
        {
            thousands = Character.digit(num2.charAt(0), 10);
            hundreds = Character.digit(num2.charAt(1), 10);
            tens = Character.digit(num2.charAt(2), 10);
            ones = Character.digit(num2.charAt(3), 10);
        }
        else
        {
            thousands = 0;
            hundreds = Character.digit(num2.charAt(0), 10);
            tens = Character.digit(num2.charAt(1), 10);
            ones = Character.digit(num2.charAt(2), 10);
        }
        temp1 = thousands;
        temp2 = hundreds;
        temp3 = tens;
        temp4 = ones;
        
        thousands = temp3;
        hundreds = temp4;
        tens = temp1;
        ones = temp2;
        
        //constructs the encrypted number
        thousands *= 1000;
        hundreds *= 100;
        tens *= 10;
        
        
        encryptedNum = thousands + hundreds + tens + ones;
        if (thousands == 0)
            System.out.printf("The encrypted number is 0%s", encryptedNum);
        else
            System.out.printf("The encrypted number is: %s", encryptedNum);
    }
}
