package LinkedList;



public class FindPairswithGivenSuminDLL { // DLL is sorted

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
	
	public static void pairsWithGivenSum(Node head,int sum)
	{
		if(head==null || head.next==null)
			return;
		
		Node first=head;
		Node last=head;
		
		while(last.next!=null)
		{
			last=last.next;
		}
		
		while(first!=last && last.next!=first)
		{
			int s=first.data+last.data;
			if(s==sum)
			{
				System.out.println(first.data+" "+last.data);
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
	}
	
	
	
}
