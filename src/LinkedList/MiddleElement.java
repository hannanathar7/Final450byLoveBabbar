package LinkedList;

public class MiddleElement {

	public static Node head;
	
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
	
	
	
	public static Node middle(Node node)
	{
		Node slow=head;
		Node fast=head;
		while(fast!=null && fast.next!=null)
		{
			slow=slow.next;
			fast=fast.next.next;
		}
		
		
	return slow;		
	}
	
	
	
	
	
}
