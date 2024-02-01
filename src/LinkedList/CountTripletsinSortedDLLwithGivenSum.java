package LinkedList;


public class CountTripletsinSortedDLLwithGivenSum {

	static Node head;
	
	public static class Node
	{
		int data;
		Node next;
		Node prev;
		
		Node(int d)
		{
			data=d;
			next=null;
			prev=null;
		}
	}
	
	public static void display(Node node)
	{
		Node curr=node;
		while(curr!=null)
		{
			System.out.println(curr.data);
			curr=curr.next;
		}
	}
	
	public static void tripletsWithGivenSum(Node head,int sum)
	{
		if(head==null || head.next==null || head.next.next==null)
			return;
		
		Node curr=head;
		while(curr.next.next!=null)
		{
			
		Node first=head.next;
		Node last=head.next.next;
		
		while(last.next!=null)
		{
			last=last.next;
		}
		
		while(first!=last && last.next!=first)
		{
			int s=curr.data+first.data+last.data;
			if(s==sum)
			{
				System.out.println(curr.data+" "+first.data+" "+last.data);
				first=first.next;
				last=last.prev;
			}
			else if(s<sum)
			{
				first=first.next;
			}
			else
			{
				last=last.prev;
			}
		}
		curr=curr.next;
		}
	}
	
	
	
}
