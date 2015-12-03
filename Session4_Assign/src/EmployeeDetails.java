
public class EmployeeDetails
{
	private String emp_id;
	private String name;
	private String department;
	private double basicsalary;
	private String Address;
	private int age;
	
	public String SetAddress(String address)
	{
		this.Address=address;
		return Address;
	}

	public String SetEmpId(String empid)
	{
		this.emp_id=empid;
		return emp_id;
	}
	
	public String SetName(String name)
	{
		this.name=name;
		return name;
	}
	public String SetDepartment(String deprt)
	{
		this.department=deprt;
		return department;

	}
	public double SetSalary(double salary)
	{
		this.basicsalary=salary;
		return basicsalary;
	}
	
	public int SetAge(int age)
	{
		this.age=age;
		return age;
	}
	
	
	public void GetDetails()
	{
		System.out.println("EmpId:"+emp_id);
		
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);
		System.out.println("Department:"+department);
		System.out.println("Basic Salary:"+basicsalary);
		
	}
	
}