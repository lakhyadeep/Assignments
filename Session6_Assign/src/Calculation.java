

class PrintInteger implements Display
{
	
	public void getParam(int i)
	{
		System.out.println("The Integer is "+i);
		
	}
}

class ShowSquare implements Display
{
	
	public void getParam(int i)
	{
		
		System.out.println("The Square of "+i+" is " +(i*i));
		
	}
	
	
}
class Calculation
{

	public static void main(String[] args)
	{
		System.out.println("First Class andd Method Implemented");
		PrintInteger i=new PrintInteger();
		i.getParam(5);
		System.out.println("");
		System.out.println("Second Class and Method Implemented Differently");
		ShowSquare s=new ShowSquare();
		s.getParam(5);
	}
	
	
}
