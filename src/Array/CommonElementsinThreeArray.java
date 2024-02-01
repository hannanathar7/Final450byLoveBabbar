package Array;
import java.util.*;
public class CommonElementsinThreeArray {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		int n1=sc.nextInt();
		int a[]=new int[n1];
		for(int i=0;i<n1;i++)
			a[i]=sc.nextInt();
		
		int n2=sc.nextInt();
		int b[]=new int[n2];
		for(int i=0;i<n2;i++)
			b[i]=sc.nextInt();
		
		int n3=sc.nextInt();
		int c[]=new int[n3];
		for(int i=0;i<n3;i++)
			c[i]=sc.nextInt();
		
		sc.close();
		
		
		ArrayList<Integer> list=new ArrayList<Integer>();
		int i=0,j=0,k=0;
		int prev1=Integer.MIN_VALUE,prev2=Integer.MIN_VALUE,prev3=Integer.MIN_VALUE;
		while(i<n1 && j<n2 && k<n3)
		{
			while(i<n1 && a[i]==prev1 )
			{
				i++;
			}
			
			while(j<n2 && b[j]==prev2)
			{
				j++;
			}
			
			while(k<n3 && c[k]==prev3)
			{
				k++;
			}
			
			if(i<n1 && j<n2 && k<n3)
			{
			if(a[i]==b[j] && b[j]==c[k])
			{
				list.add(a[i]);
				prev1=a[i];
				prev2=b[j];
				prev3=c[k];
				i++;
				j++;
				k++;
			}
			
			else if(a[i]<b[j])
			{
				prev1=a[i];
				i++;
			}
			
			else if(b[j]<c[k])
			{
				prev2=b[j];
				j++;
			}
		
			else
			{
				prev3=c[k];
				k++;
			}
			}
			
			
			
		}
		
		System.out.println(list);
		
		
		
	}
	

	
}
