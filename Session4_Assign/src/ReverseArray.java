import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) 
	{
	
		int[] Arr={10,20,30,40,50,60,70,80,90,100};
		System.out.println("Before Reversing the Position of the Array Elements");
		for(int j=0;j<=9;j++)	
		System.out.println("Arr["+j+"]="+Arr[j]);
		
		System.out.println("After Reversing the Position of the Array Elements");
		
	/*	for(int i=0;i<=9;i++)
		{
		//Not able to change the index position
		for(int j=9;j>=0;j--)
		{
			if(i<=9)
			{
			
				int temp=Arr[j];
				Arr[j]=Arr[i];
				Arr[i]=temp;
			}
			
		}

		}*/
				
		for(int k=9;k>=0;k--)
		System.out.println("Arr["+k+"]="+Arr[k]);
		
	}

}
