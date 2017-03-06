
/**
 * Decrypts 4 digit numbers.
 * 
 * Micheal Walburn
 * @version 1
 */
import java.util.Scanner;
public class decryptionMW
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        int thousands = 0;
        int hundreds = 0;
        int tens = 0;
        int ones = 0;
        int temp1 = 0;
        int temp2 = 0;
        int temp3 = 0;
        int temp4 = 0;
        
        int number = 0;
        
        //asks for encrypted 4 digit number
        System.out.print("Enter an encrypted 4-digit number: ");
        int encryptedNum = input.nextInt();
        
        //swaps 1st and 3rd digits, and 2nd and 4th digits
        String num = Integer.toString(encryptedNum);
        if (encryptedNum >= 1000)
        {
            thousands = Character.digit(num.charAt(0), 10);
            hundreds = Character.digit(num.charAt(1), 10);
            tens = Character.digit(num.charAt(2), 10);
            ones = Character.digit(num.charAt(3), 10);
        }
        else
        {
            thousands = 0;
            hundreds = Character.digit(num.charAt(0), 10);
            tens = Character.digit(num.charAt(1), 10);
            ones = Character.digit(num.charAt(2), 10);
        }
        temp1 = thousands;
        temp2 = hundreds;
        temp3 = tens;
        temp4 = ones;
        
        thousands = temp3;
        hundreds = temp4;
        tens = temp1;
        ones = temp2;
        
        //constructs the number
        thousands *= 1000;
        hundreds *= 100;
        tens *= 10;
        
        number = thousands + hundreds + tens + ones;
        
        //multiplies the number by 10
        number *= 10;
        
        //disassembles number again
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
        
        //subtracts 7 from all the digits
        thousands -= 7;
        hundreds -= 7;
        tens -= 7;
        ones -= 7;
        
        thousands *= 1000;
        hundreds *= 100;
        tens *= 10;
        
        number = thousands + hundreds + tens + ones;
        
        System.out.printf("The un-encrypted number is %s: ", number);
    }
}
