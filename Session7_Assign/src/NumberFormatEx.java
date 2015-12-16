
public class NumberFormatEx {

	public static void main(String[] args)
	{
	
		String str="Hello World";
		System.out.println(str);
		try
		{
		int num=Integer.parseInt(str);// Number format exception
		}
		catch(NumberFormatException n)
		{
			System.out.println(str+" cannot be parse into integer ");
		}
		finally
		{
			System.out.println("End of Program");
		}
		
	}

}
