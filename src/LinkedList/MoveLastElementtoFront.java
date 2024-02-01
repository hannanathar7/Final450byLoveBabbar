package LinkedList;



public class MoveLastElementtoFront {

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
	
	public static void display(Node node)
	{
		Node curr=node;
		while(curr!=null)
		{
			System.out.println(curr.data);
			curr=curr.next;
		}
	}
	
	public static void moveLastToFront(Node node)
	{
		if(head==null || head.next==null)
			return;
		
		Node curr=head;
		Node prev=null;
		while(curr.next!=null)
		{
			prev=curr;
			curr=curr.next;
		}
		curr.next=head;
		prev.next=null;
		head=curr;
		
	
			
		 
	}
	
	public static void main(String args[])
	{
		head=new Node(1);
		head.next=new Node(2);
		head.next.next=new Node(3);
		head.next.next.next=new Node(4);
		head.next.next.next.next=new Node(5);
		moveLastToFront(head);
		display(head);
	}
}
