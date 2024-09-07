package exception_handling;

public class Assignment_Exception_StringOutOfBound {

	public static void main(String[] args) 
	{
		String a = "World";
		try
		{
		a.charAt(5);
		}
		catch(StringIndexOutOfBoundsException c1)
		{
			System.out.println("String Index Out Of Bound Exception has been resolved");
		}	
	}
}

//StringIndexOutOfBoundsException