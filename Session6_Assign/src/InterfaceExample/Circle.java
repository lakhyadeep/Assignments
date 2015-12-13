package InterfaceExample;
//import java.util.Scanner;

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
