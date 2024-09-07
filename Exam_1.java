package exception_handling;

public class Exam_1 {

	public static void main(String[] args) 
	{
	try{
		int [] numbers = {1,2,3};
		System.out.println("Element at Index 3: "+ numbers[3]);
	}
	catch(ArrayIndexOutOfBoundsException a)
	{
		System.out.println("Error");
	}
}}
