
class Shapes 
{

	public int len;
	public int bth;
	Shapes(int l , int b)
	{
		len=l;
		bth=b;
		
	}
	
	void RectangleArea()
	{
		
		System.out.println("Area of Rectangle whose length="+len+" And Breath="+bth);
		
	}
	
	void TriangleArea()
	{
		
		System.out.println("Area of Triangle whose length="+len+" And Breath="+bth);
		
	}
	
}


class Area extends Shapes
{
	Area(int len,int bth)
	{
	super(len,bth);	//Passing value to the super class
	}
	
	
void DisplayRectangleArea()
	{
		super.RectangleArea();
		int RectArea=len*bth;
		System.out.println(+RectArea);
	}
	
	void DisplayTriangleArea()
	{
		super.TriangleArea();
		int TriArea=len*bth*1/2;
		System.out.println(+TriArea);
	}	
	
}
public class SingleInheritance  {

	public static void main(String[] args) 
	{
		Area a1=new Area(5,6);
		Area a2=new Area(10,10);
		System.out.println("First Object");		
		a1.DisplayRectangleArea();
		a1.DisplayTriangleArea();
		System.out.println("");
		System.out.println("Second Object");
		a2.DisplayRectangleArea();
		a2.DisplayTriangleArea();
	}	

}