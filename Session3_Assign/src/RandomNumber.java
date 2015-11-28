import java.util.Scanner;

public class RandomNumber {

	public static void main(String[] args)
	
	{
	
		System.out.print("Eny A Random Number:");
		Scanner s =new Scanner (System.in);
		double num= s. nextDouble();
		int ran=(int)num;
		
		for(int r=0;r<=ran-1;r++)
		{
		int rest=(int)(ran*(Math.random()) );
			System.out.println(rest);
		}
		
		
		s.close();
		
		
		
		
		

	}

}
