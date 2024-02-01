package LinkedList;

public class MergeKSortedLL {

	static Node head;

	public static class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}
	
	public Node mergeKList(Node[]a,int k)
    {
       int last=k-1;
	        while(last!=0)
	        {
	        	int i=0;
	        	int j=last;
	        	while(i<j)
	        	{
	        		a[i]=merge(a[i],a[j]);
	        		i++;
	        		j--;
	        		if(i>=j)
	        			last=j;
	        	}
	        }
	        return a[0];
	    }
		
		public Node merge(Node a,Node b)
		{
			if(a==null)
				return b;
			
			if(b==null)
				return a;
			
			Node res=null;
			
			if(a.data<=b.data)
			{
				res=a;
				res.next=merge(a.next,b);
			}
			else
			{
				res=b;
				res.next=merge(a,b.next);
			}
			
			return res;
		 
    }

	



}
