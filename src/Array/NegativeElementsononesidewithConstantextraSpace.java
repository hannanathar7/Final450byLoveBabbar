package Array;
import java.util.*;
public class NegativeElementsononesidewithConstantextraSpace {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		sc.close();
		int j=0;
		for(int i=0;i<n;i++)
		{
			if(a[i]<0)
			{
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				j++;
			}
		}
		for(int i=0;i<n;i++)
			System.out.print(a[i]+" ");
			
		
		
		
		
	}
	

	
}
































