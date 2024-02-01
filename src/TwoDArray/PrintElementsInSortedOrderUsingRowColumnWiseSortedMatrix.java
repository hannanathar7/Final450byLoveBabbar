package TwoDArray;

import java.util.Arrays;
import java.util.Scanner;

public class PrintElementsInSortedOrderUsingRowColumnWiseSortedMatrix {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int r=sc.nextInt();
		int c=sc.nextInt();
		int a[][]=new int[r][c];
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}	
		sc.close();
		
		int b[]=new int[r*c];
		int k=0;
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				b[k]=a[i][j];
				k++;
			}
		}	
		
		Arrays.sort(b);
		k=0;
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				a[i][j]=b[k];
				k++;
			}
		}
		
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}	
		
		}
}
