import java.util.Scanner;

public abstract class Student 
{
	
	int rollno;
	String std_name;
	String reg_no;
	
	abstract void getData();
	abstract void displayData();	
}


class StudentDetails extends Student

{

	String class_id;
	int m1,m2,m3,m4,m5;
	int total;
	double percentage;
	Scanner s=new Scanner(System.in);
	
	void getData() 
	{
	System.out.print("Enter Student Name:");
	super.std_name=s.next();
	System.out.print("Enter Registration Number:");
	super.reg_no=s.next();
	System.out.print("Enter Class:");
	class_id=s.next();
	System.out.print("Enter Roll No:");
	super.rollno=s.nextInt();
	System.out.println("Marks Entry(out of 100 each subject) ");
	System.out.print("English:");
	m1=s.nextInt();	
	System.out.print("Maths:");
	m2=s.nextInt();
	System.out.print("Science:");
	m3=s.nextInt();
	System.out.print("Assamese:");
	m4=s.nextInt();
	System.out.print("Sanskrit:");
	m5=s.nextInt();	
	}


	void displayData() 
	{
		
		
		total=m1+m2+m3+m4+m5;
		percentage=(total*100)/500;
		System.out.println("--------------------------------");
		System.out.println("Registration No:"+super.reg_no);
		System.out.println("Student Name:"+super.std_name);
		System.out.println("Class:"+class_id);
		System.out.println("Roll No:"+super.rollno);
		System.out.println("--------------------------------");
		System.out.println("Displaying Marks in each Subject");
		System.out.println("--------------------------------");
		System.out.println("English:"+m1);
		System.out.println("Maths:"+m2);
		System.out.println("Science:"+m3);
		System.out.println("Assamese:"+m4);
		System.out.println("Sanskrit:"+m5);
		System.out.println("--------------------------------");
		System.out.println("Total Marks:"+total);
		System.out.println("Percentage:"+percentage);
		System.out.println("--------------------------------");
		
	}
	
	
}

