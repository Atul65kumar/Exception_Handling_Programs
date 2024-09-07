package exception_handling;

public class Try_Catch_Program 
{
	public static void main(String[] args)
	{
		//int a =b/c; 
		//can b comes from grand parent class? -- yes
		//can c comes from parent class? -- yes
		try {
		int c = 1/0;
		System.out.println(c);
		}
		catch(ArithmeticException a1)
		{
			System.out.println("Handled the Exception");
		}	
	}
//java.lang.ArithmeticException
}
