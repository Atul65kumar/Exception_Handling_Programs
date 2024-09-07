package exception_handling;

public class Assignment_ArraySize {

	public static void main(String[] args) 
	{
		int salary[] = new int[4];
		
		salary[0] = 90000;
		salary[1] = 10000;
		salary[2] = 56000;
		salary[3] = 65000;		
		try 
		{
			salary[4] = 45000;
		}
		catch(ArrayIndexOutOfBoundsException a1)
		{
			System.out.println("This exception has been resolved");
		}		
	}
}
 //ArrayIndexOutOfBoundsException