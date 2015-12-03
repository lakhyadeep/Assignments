import java.util.Scanner;

public class ArraySorting {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int[] arr=new int[20];
		System.out.print("Enter size of the array:");
		int n=s.nextInt();
		for(int i=0;i<=n-1;i++)
		arr[i]=s.nextInt();
		System.out.println("The Unsorted Array is:");
		for(int j=0;j<=n-1;j++)
		System.out.print(" "+arr[j]);	
		for(int k=0;k<=n-1;k++)
		{
			for(int a=k+1;a<=n-1;a++)
			{
			
			if(arr[k]>arr[a])
			{
				int temp=0;
				temp=arr[k];
				arr[k]=arr[a];
				arr[a]=temp;
			}
			}
		}
		
		System.out.println("\nThe Sorted Array in Ascending order :");
		for(int b=0;b<=n-1;b++)
		System.out.print(" "+arr[b]);	
		s.close();
	}
		



}
