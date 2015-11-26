import java.util.Scanner;

public class DaysInMonth {

	public static void main(String[] args) 
	{

		System.out.print("Enter Month Number:");
		Scanner s=new Scanner(System.in);
		int i=s.nextInt();
		
		switch(i) 
		{
		case 1 : System.out.println("The month is January which has 31 days");
				break;
		case 2: System.out.println("The month is Feburary which has 28 days");
				break;
		case 3: System.out.println("The month is March which has 31 days");
		break;
		case 4: System.out.println("The month is April which has 30 days");
		break;
		case 5: System.out.println("The month is May which has 31 days");
		break;
		case 6: System.out.println("The month is June which has 30 days");
		break;
		case 7: System.out.println("The month is July which has 31 days");
		break;
		case 8: System.out.println("The month is August which has 31 days");
		break;
		case 9: System.out.println("The month is September which has 30 days");
		break;
		case 10: System.out.println("The month is October which has 31 days");
		break;
		case 11: System.out.println("The month is November which has 30 days");
		break;
		case 12: System.out.println("The month is December which has 31 days");
		break;
		default: System.out.println("Invalid Month Number Entered");
		break;

		}
		
		
		s.close();
		
	}
	
		

	}

