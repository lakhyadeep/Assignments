import java.util.Scanner;

public class Cal_Main {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		Calculator c=new Calculator();
		Scanner s=new Scanner(System.in);
		System.out.println("\t Basic Calculator ");
		System.out.println("===================================== ");		
		System.out.println("Operation");
		System.out.print("+  ");
		System.out.print("-  ");		
		System.out.print("/  ");
		System.out.print("*  ");
		System.out.println();
		System.out.println("===================================== ");	
		System.out.println("Enter Two number:");
		int num1=s.nextInt();
		int num2=s.nextInt();
		System.out.print("What opeartion do you want to perform?:");
		String str=s.next();
		
		switch(str)
		{
		
		
		case "+": 	int sum=c.Add(num1,num2);
					System.out.println(sum);
					break;
		
		case "-":	int sub=c.Sub(num1,num2);
					System.out.println(sub);
					break; 
					

		case "*":	int mul=c.Mul(num1,num2);
					System.out.println(mul);
					break; 

		case "/":	double div=c.Div(num1,num2);
					System.out.println(div);
					break; 
					
		default :System.out.println("Invalid Operation");
	
		}	
		s.close();
		
		
	}

}
