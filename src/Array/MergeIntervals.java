 package Array;
import java.util.*;

class Interval
{
	int start,end;
	public Interval(int start,int end)
	{
		this.start=start;
		this.end=end;
	}
}

public class MergeIntervals {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int a[][]=new int[m][2];
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<2;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		
		Interval b[]=new Interval[m];
		for(int i=0;i<m;i++)
		{
			b[i]=new Interval(a[i][0],a[i][1]);
		}
		
		Arrays.sort(b,new Comparator<Interval>(){
            public int compare(Interval i1,Interval i2)
            {
                return i1.start - i2.start;
            }
        });
		
		
		
		
		
		int idx=0;
		
		for(int i=1;i<m;i++)
		{
			if(b[i].start<=b[idx].end)
			{
				b[idx].start=Math.min(b[i].start,b[idx].start);
				b[idx].end=Math.max(b[i].end,b[idx].end);
			}
			else
			{
				idx++;
				b[idx]=b[i];
			}
		}
		
		
		
		
		int c[][]=new int[idx+1][2];
		
		
		for(int i=0;i<=idx;i++)
		{
			c[i][0]=b[i].start;
			c[i][1]=b[i].end;
		}
		
		for(int i=0;i<=idx;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
		
		
		
		sc.close();
		
		
		
		
		
		
		
		
	}
	

	
}


