package Array;
import java.util.*;
public class TrappingRainWater {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		sc.close();
		
		
	
		System.out.println(trap(a));

		
		
	}
	
	public static int trap(int[] a) {

        int n=a.length;
        int leftmax=0,rightmax=0;
        int i=0,j=n-1;
        int res=0;

        while(i<j)
        {
            if(a[i]<=a[j])
            {
                if(a[i]>=leftmax)
                leftmax=a[i];

                else
                res+=leftmax-a[i];

                i++;
            }

            else
            {
                if(a[j]>=rightmax)
                rightmax=a[j];

                else
                res+=rightmax-a[j];

                j--;
            }
        }

        return res;

    }
	

	
}
