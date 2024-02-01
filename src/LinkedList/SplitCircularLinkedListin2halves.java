package LinkedList;



public class SplitCircularLinkedListin2halves {

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
	
	public static void split(Node head)
	{
		if(head==null || head.next==null)
			return;
		
		Node mid=middle(head);
		Node secondhead=mid.next;
		mid.next=head;
		Node curr=secondhead;
		while(curr.next!=head)
		{
			curr=curr.next;
		}
		curr.next=secondhead;
		
		
		display(head);
		display(secondhead);
		
	}
	
	
	public static Node middle(Node node)
	{
		Node slow=head;
		Node fast=head;
		while(fast.next!=head && fast.next.next!=head)
		{
			slow=slow.next;
			fast=fast.next.next;
		}
		
		
	return slow;		
	}
	
	
	public static void display(Node head)
	{
		Node curr=head;
		while(curr!=head)
		{
			System.out.print(curr.data+" ");
			curr=curr.next;
		}
	}
	
	
	
	
	
}
