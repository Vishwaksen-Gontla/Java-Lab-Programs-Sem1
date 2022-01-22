//Aim : To Write a Java Program to Handle Arithmetic Exceptions and InputMisMatchExceptions.

package lab11;
import java.util.Scanner;
import java.util.InputMismatchException;
public class Demo {
	
	static double divide(int a ,int b) throws ArithmeticException
	{
		return a/b;
	}

	public static void main(String[] args) 
	{
		int numerator,denomenator;
		double result;
		try 
		{
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter the numerator:");
			numerator = scan.nextInt();
			System.out.println("Enter the denomenator:");
			denomenator = scan.nextInt();
			result = divide(numerator,denomenator);
			System.out.println("result - "+result);
			scan.close();
			
		}
		catch(InputMismatchException  e)
		{
			System.out.println("Exception -"+e +" is handled");
		}
		
		catch (ArithmeticException e)
		{
			System.out.println("Exception -"+e +" is handled");
		}
		
	}

}
