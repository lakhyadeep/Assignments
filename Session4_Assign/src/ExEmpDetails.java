import java.util.Scanner;

public class ExEmpDetails {

	public static void main(String[] args)
	{

		EmployeeDetails emp=new EmployeeDetails();
		emp.SetEmpId("EM001");
		emp.SetName("Lakhya");
		emp.SetAge(23);
		emp.SetDepartment("Production");
		emp.SetSalary(30000.00);
		emp.SetAddress("Mumbai City");//This is Hidden 
		emp.GetDetails();
		
	
	}	
	
	

}
