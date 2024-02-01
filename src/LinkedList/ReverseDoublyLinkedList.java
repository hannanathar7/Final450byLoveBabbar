package LinkedList;

public class ReverseDoublyLinkedList {

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
	
	public static Node reverse(Node head)
	{
		if(head==null || head.next==null)
			return head;
		
		Node curr=head;
		while(curr.next!=null)
		{
			curr=curr.next;
		}
		
		head=curr;
		
		Node next=curr.next;
		curr.next=curr.prev;
		curr.prev=next;
		curr=curr.next;
		
		while(curr.prev!=null)
		{
			next=curr.next;
			curr.next=curr.prev;
			curr.prev=next;
			curr=curr.next;
		}
		
		next=curr.next;
		curr.next=curr.prev;
		curr.prev=next;
		curr=curr.next;
		
		return head;
	}
	
	
	
	
}
