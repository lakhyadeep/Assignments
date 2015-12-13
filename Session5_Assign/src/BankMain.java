
public class BankMain 
{

	public static void main(String[] args) 
	
	{
			StateBank s=new StateBank();
			s.getRateofInterest(7);
			System.out.println("");
			HsbcBank h=new HsbcBank();
			h.getRateofInterest(8);
			System.out.println("");
			AxisBank a=new AxisBank();
			a.getRateofInterest(9);
			
			
	}

}

class StateBank  
{
	int r,p=1000,t=1;
	void getRateofInterest(int r ) //method override for this statebank class
	{
		
		int si=p*t*r/100;
		System.out.println("SBI BANK");
		System.out.println("Principal="+p);
		System.out.println("Time="+t+"yrs");
		System.out.println("Rate of Interest="+r+"%");
		System.out.println("Interest="+si);
		System.out.println("Amount="+(p+si));
	}
	
}

class AxisBank 
{
	int r,p=1000,t=1;
	void getRateofInterest(int r ) //method override for this Axisbank class
	{
		
		int si=p*t*r/100;
		System.out.println("Axis BANK");
		System.out.println("Principal="+p);
		System.out.println("Time="+t+"yrs");
		System.out.println("Rate of Interest="+r+"%");
		System.out.println("Interest="+si);
		System.out.println("Amount="+(p+si));
	}
	
}
class HsbcBank 
{
	int r,p=1000,t=1;
	void getRateofInterest(int r) //method override for this statebank class
	{
		
		int si=p*t*r/100;
		System.out.println("Hsbc BANK");
		System.out.println("Principal="+p);
		System.out.println("Time="+t+"yrs");
		System.out.println("Rate of Interest="+r+"%");
		System.out.println("Interest="+si);
		System.out.println("Amount="+(p+si));	}
	
}


