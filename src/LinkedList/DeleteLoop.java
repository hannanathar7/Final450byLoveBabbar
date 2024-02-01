package LinkedList;



public class DeleteLoop {

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
	
	public static Node DetectLoop(Node node)
	{
		
		
		if(head==null || head.next==null)
			return null;
			
		Node fast=head;
		Node slow=head;
		Node prev=null;
		
		while(fast.next!=null && fast.next.next!=null)
		{
			fast=fast.next.next;
			prev=slow;
			slow=slow.next;
			if(fast==slow)
				return prev;
		}
		return null;
	}
	
	public static void delete(Node head)
	{
		
		Node prev=DetectLoop(head);
		
		Node meet=prev.next;
		Node start=head;
		

			while(start!=meet)
			{
				start=start.next;
				prev=meet;
				meet=meet.next;
			}
			prev.next=null;
		
		
	}
	
	
	public static void main(String args[])
	{
		
		delete(head);
		
	
	}
	
	
	
}
