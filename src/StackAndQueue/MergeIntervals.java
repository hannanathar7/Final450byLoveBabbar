package StackAndQueue;
import java.util.*;

class Pair
{
	int start,end;
	
	Pair(int start,int end)
	{
		this.start=start;
		this.end=end;
	}
}

public class MergeIntervals {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[][]=new int[n][2];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<2;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		
		
		Pair b[]=new Pair[n];
		for(int i=0;i<n;i++)
		{
			b[i]=new Pair(a[i][0],a[i][1]);
		}
		
		Arrays.sort(b,new Comparator<Pair>(){
            public int compare(Pair i1,Pair i2)
            {
                return i1.start - i2.start;
            }
        });
		
		
		
		Stack<Pair> st=new Stack<>();
		for(int i=0;i<n;i++)
		{
			if(st.isEmpty())
				st.push(b[i]);
			
			else
			{
				Pair top=st.peek();
				if(b[i].start<=top.end)
				{
					top.start=Math.min(b[i].start,top.start);
					top.end=Math.max(b[i].end,top.end);
				}
				else
				{
					st.push(b[i]);
				}
				
			}
		}
		
		Stack<Pair> res=new Stack<>();
		
		while(!st.isEmpty())
		{
			res.push(st.pop());
		}
		
		ArrayList<Pair> list=new ArrayList<Pair>();
		
		while(!res.isEmpty())
		{
			Pair top=res.pop();
			list.add(top);
		}
		
		int c[][]=new int[list.size()][2];
		
		for(int i=0;i<list.size();i++)
		{
			
			c[i][0]=list.get(i).start;
			c[i][1]=list.get(i).end;
		}
		
		for(int i=0;i<list.size();i++)
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


