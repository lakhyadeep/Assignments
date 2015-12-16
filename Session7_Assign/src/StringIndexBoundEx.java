
public class StringIndexBoundEx {

	public static void main(String[] args)
	{
	
		String str="HaveAGoodDay";
		System.out.println(str.charAt(3));
		System.out.println(str.charAt(6));
		System.out.println(str.charAt(9));
		System.out.println(str.charAt(11));
		try
		{
		System.out.println(str.charAt(12));
		}
		catch(StringIndexOutOfBoundsException s)
		{
			System.out.println("No Chacter within the range of the string");
		}
		finally
		{
			System.out.println("End of Program");
		}
	}

}
