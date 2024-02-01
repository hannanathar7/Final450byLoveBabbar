package LinkedList;


public class SortLLof012 {

	static Node head;
	
	public static class Node
	{
		int data;
		Node next;
		
		Node(int d)
		{
			data=d;
			next=null;
		}
	}
	
	public static Node sort(Node node)
	{
		if(head==null || head.next==null)
			return head;
		int count[]=new int[3];
		Node curr=head;
		while(curr!=null)
		{
			count[curr.data]+=1;
			curr=curr.next;
		}
		curr=head;
		int i=0;
		
		while(curr!=null)
		{
			if(count[i]!=0)
			{
				curr.data=i;
				count[i]-=1;
				curr=curr.next;
			}
			else
			{
				i++;
			}
		}
		return head;
	}
	
	
	
	
	
	
	
	
	
	
}
