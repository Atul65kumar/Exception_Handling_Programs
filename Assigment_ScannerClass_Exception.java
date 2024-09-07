package exception_handling;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Assigment_ScannerClass_Exception 
{
	public static void main(String[] args) 
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("Input the size of Array");
		int salary[] = new int[s1.nextInt()];
		
		try {
			System.out.println("Input the elements of Array");
			if(salary.length<=3)
			{
				for(int i=0; i<salary.length; i++)
				{
					salary[i] = s1.nextInt();
				}
			}
			else
			{
				for(int i=0; i<=salary.length; i++)
				{
					salary[i] = s1.nextInt();
				}
			}
		}
			catch(InputMismatchException a)
			{
				System.out.println("The value of input is different from the datatype of Array");
			}
			catch(ArrayIndexOutOfBoundsException b)
			{
				System.out.println("The size of Array is similar than the input elements");
			}
			finally
			{
				System.out.println("The Array is -> "+ Arrays.toString(salary));
			}
	}
}







//InputMismatchException
