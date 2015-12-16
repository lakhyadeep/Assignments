
public class NullPointerEx {

	public static void main(String[] args) 
	{
	
		Example e1=null; //object e1 is pointing to null value
		try 
		{
		e1.display();//exception occures ;
		}
		
		catch(NullPointerException n)
		{
			System.out.println("Method is invoked with a Null object ");
			
		}
		finally
		{
			System.out.println("End of Program");
		}
		
		
		
	}
	

}

class Example
{
	String name="Sankar";
	int age=12;
	void display()
	{
		System.out.println("Name="+name);
		System.out.println("Age="+age);
	}
	
}
