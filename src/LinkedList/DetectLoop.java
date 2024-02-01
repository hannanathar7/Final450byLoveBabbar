package LinkedList;



public class DetectLoop {

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
	
	public static boolean detect(Node node)
	{
		
		
		if(head==null || head.next==null)
			return false;
			
		Node fast=head;
		Node slow=head;
		
		while(fast.next!=null && fast.next.next!=null)
		{
			fast=fast.next.next;
			slow=slow.next;
			if(fast==slow)
				return true;
		}
		return false;
	}
	
	
	public static void main(String args[])
	{
		boolean b=detect(head);
		System.out.println(b);
	
	}
	
	
	
}
