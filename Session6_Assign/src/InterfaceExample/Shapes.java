package InterfaceExample;

public interface Shapes 
{
	double pi=3.143;
	abstract void  draw();
	abstract void getArea();
	
}

class Circle implements Shapes 
{

	int r;
	public void draw()
	 {
		
		/*Scanner s=new Scanner(System.in);
		System.out.println("Enter radius:");
		r=s.nextInt();*/
		r=5;
		
	 }
	public void getArea()
	
	{
		System.out.println("Area of Circle of Radius "+r+" is: "+(pi*r*r));
	
	}
}

class Square implements Shapes
{
	 int l;
	 
	 public void draw()
	 {
		 
		 l=5;
	 }
	 
	 public void getArea()
		
		{
			System.out.println("Area of Square "+l+" is: "+(l*l));
		
		}
	 
}

class Rectangle implements Shapes
{
	 int l,b;
	 
	 public void draw()
	 {
		 
		 l=6;
		 b=8;
	 }
	 
	 public void getArea()
		
		{
			System.out.println("Area of Rectangle is: "+(l*b));
		
		}
	 
}


class Triangle implements Shapes
{
	 int l,b;
	 
	 public void draw()
	 {
		 
		 l=8;
		 b=9;
	 }
	 
	 public void getArea()
		
		{
			System.out.println("Area of Triangle is: "+(l*b)/2);
		
		}
	 
}