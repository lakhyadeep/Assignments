
class ExPoly
{
	int l,b;
	ExPoly(int l)
	{
		
		this.l=l; 
		System.out.println("Square="+l*l);	
	}
	
	
	ExPoly(int l,int b)
	
	{
		
		this.l=l;
		this.b=b;
		System.out.println("Rectangle="+l*b);
	}
	
}



public class ConstOverloding
{
	public static void main(String[] args)
	{
		ExPoly s=new ExPoly(4);
		
		ExPoly r=new ExPoly(5,5);
		
	}
	
}
