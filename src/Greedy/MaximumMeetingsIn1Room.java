package Greedy;

import java.util.*;


public class MaximumMeetingsIn1Room {
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int start[]=new int[n];
		int end[]=new int[n];
		for(int i=0;i<n;i++)
			start[i]=sc.nextInt();
		for(int i=0;i<n;i++)
			end[i]=sc.nextInt();
		sc.close();
		
		System.out.println(maxMeetings(start,end,n));
		
	
		
		
	}
	
	public static int maxMeetings(int start[], int end[], int n)
    {
        ArrayList<Meet> meet=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
          meet.add(new Meet(start[i],end[i]));
        }
        
        
        Collections.sort(meet,new Comparator <Meet>(){
           
           
           public int compare(Meet o1,Meet o2)
           {
               return o1.end-o2.end;
           }
        });
        
        int c=1,endt=meet.get(0).end;
        for(int i=1;i<meet.size();i++)
        {
            if(meet.get(i).start>endt)
            {
                c++;
                endt=meet.get(i).end;
            }
            
        }
        
        return c;
        
    }
	
	
	 public static class Meet
	    {
	        int start,end;
	        
	        Meet(int s,int e)
	        {
	            start=s;
	            end=e;
	        }
	    }
	
	

}

