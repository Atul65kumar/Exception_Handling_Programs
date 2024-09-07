package exception_handling;

public class Throws_keyword_Assignmet
{
	public static void main(String[] args) throws NullPointerException
	{
	for(int i= 0; i<5; i++)
	{
	throw new NullPointerException("Sorry, we can't go further due to exception");
	}
	}
}
