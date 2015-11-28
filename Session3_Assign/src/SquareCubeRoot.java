import java.util.Scanner;

public class SquareCubeRoot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print("Enter Any Number:");
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		double as=Math.sqrt(num);
		double ac=Math.cbrt(num);
		System.out.println("The Square root of the Number "+num+" is " +as);
		System.out.println("The Cube root of the Number "+num+" is " +ac);
		s.close();
	}
	

}
