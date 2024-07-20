 //Develop a Java program to determine if a given number (numerator) is greater than, 
 //equal to, or less than another number (denominator). Initialize the variables 
 //numerator and denominator to values 10 and 20 respectively. Print "Greater" 
 //if numerator is greater than denominator, "Equal" if they are equal, and "Less" 
 //if numerator is less than denominator.

package calculater;

public class NumComparison 
{
    public static void main(String[] args) 
    {
        // Initialize the numerator and denominator
        int numerator = 10;
        int denominator = 20;

        // Compare the numerator and denominator
        // If numerator is greater than denominator it prints greater
        if (numerator > denominator) 
        {
            System.out.println("Greater");
        }
        
        // if numerator and denominator both are equal then print equal
        else if (numerator == denominator) 
        {
            System.out.println("Equal");
        }
        
        // if numerator is less than denominator
        else {
            System.out.println("Less");
        }
    }
}

