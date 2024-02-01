package LinkedList;



public class RotateDDLbyNnodes {

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
	
	public static Node rotate(Node head,int n)
	{
		if(head==null || head.next==null)
			return head;
		
		Node curr=head;
		while(curr.next!=null)
		{
			curr=curr.next;
		}
		curr.next=head;
		head.prev=curr;
		
		Node prev=null;
		
		for(int i=1;i<=n;i++)
		{
			prev=head;
			head=head.next;
		}
		
		prev.next=null;
		head.prev=null;
		
		return head;
		
	}
	
	
	
}
