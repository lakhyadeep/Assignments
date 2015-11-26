import java.util.Scanner;

public class UserInputAge {

	public static void main(String[] args)
	{
	
	System.out.print("Enter Your Age:  ");
	Scanner s=new Scanner(System.in);
	int age=s.nextInt(); //Input from Keyboard
	
	if (age >= 18) //checking the age condition
	
		System.out.println("Your age is "+age+"."+ "You Are Eligible to Vote");
	else
	
		System.out.println("Your age is "+age+"."+ "You Are Not Eligible to Vote");
			
	s.close(); //closing the object
	}
	

}
