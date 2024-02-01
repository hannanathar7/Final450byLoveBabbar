package LinkedList;


public class CheckifLinkedListisCircularLinkedList {

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
	
	public static boolean isCircular(Node head)
	{
		if(head==null)
			return true;
		
		boolean b=false;
		Node curr=head;
		
		while(curr.next!=head)
		{
			curr=curr.next;
			if(curr==null)
				break;
		}
		if(curr==null)
			b=false;
		else
			b=true;
		
		return b;
		
				
	}
	
	
	
}
