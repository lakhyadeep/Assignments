import java.util.Scanner;

public class CheckPrime {

	public static void main(String[] args) 
	{
		
		// TODO Auto-generated method stub
		System.out.print("Enter Any Number:");
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		int flag=0;
		if(num % 2==1)
				 flag=0;
			else 
		
				flag =1;
	if(flag==0)
			System.out.println(num+" is a Prime number");
			
		else
			System.out.println(num+" is Not a Prime number");
		
	s.close();
	}
}

