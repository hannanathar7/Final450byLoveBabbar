package LinkedList;



public class StartingPointofLoop {

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
		
		while(fast.next!=null && fast.next.next!=null)
		{
			fast=fast.next.next;
			slow=slow.next;
			if(fast==slow)
				return slow;
		}
		return null;
	}
	
	public static Node StartingNode(Node node)
	{
		
		
		Node meet=DetectLoop(head);
		Node start=head;
		

			while(start!=meet)
			{
				start=start.next;
				meet=meet.next;
			}

		
		return start;
	}
	
	
	public static void main(String args[])
	{
		
		Node node=StartingNode(head);
		System.out.println(node.data);
	
	}
	
	
	
}
