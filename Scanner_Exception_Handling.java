package exception_handling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Scanner_Exception_Handling {

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your age");
		try {
		int age = s.nextInt();
		}
		catch(InputMismatchException a1)
		{
			System.out.println("Sorry, Please read the question");
			Scanner s1 = new Scanner(System.in);
			System.out.println("Enter your age");
			int age = s1.nextInt();
			//s1.close();
		}
		System.out.println("Enter the firstname");
		Scanner s2 = new Scanner(System.in);
		String firstname = s2.next();		
	}
}
