import java.util.Scanner;

public abstract class ArrayIndexOutofBoundEx 
{

	public static void main(String[] args)
	{
	
		
		int[] arr={10,20,30,40,50};
		System.out.println("Displaying The Array");
		System.out.println("arr[1]="+arr[0]);
		System.out.println("arr[2]="+arr[1]);	
		System.out.println("arr[3]="+arr[2]);
		System.out.println("arr[4]="+arr[3]);
		System.out.println("arr[5]="+arr[4]);//ArrayIndex Exception
		try
		{	
		System.out.println("arr[6]="+arr[5]);
		}
		
		catch(ArrayIndexOutOfBoundsException a) //exception Handling
		{
			System.out.println("Cannot  display 6 or 7 0r 10 elements because array size is 5"); 
		}
		
		finally
		{
			System.out.println("End of Program");
		}
	}
}
