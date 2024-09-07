package exception_handling;

public class Throw_Keyword {

	public static void main(String[] args) throws NullPointerException, InterruptedException
	{
		Thread.sleep(2000);
		throw new NullPointerException("This is the exception which we get from Throw keyword");
		
		//throw new NullPointerException("Sorry!!, file is empty");
	}
}
