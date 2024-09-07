package exception_handling;
import java.util.InputMismatchException;
public class Finally_Block {

	public static void main(String[] args) {
		int rollno[] = new int[3];
		rollno[0] = 85;
		rollno[1] = 96;
		rollno[2] = 55;
		
		try {
			rollno[3] = 21;
		} 
		catch (ArrayIndexOutOfBoundsException a1) 
		{
			System.out.println("Catch block 1");
		}
		catch (InputMismatchException a2) // only for safety reason
		{
			System.out.println("Catch block 2");
		} 
		catch (NullPointerException a3) 
		{
			System.out.println("Catch block 3");
		} // we can use multiple catches
		finally {

			System.out.println("This is finally block");
		}
	}
}
