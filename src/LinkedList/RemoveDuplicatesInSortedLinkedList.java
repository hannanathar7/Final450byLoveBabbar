package LinkedList;



public class RemoveDuplicatesInSortedLinkedList {

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
	
	public static void removeDuplicates(Node node)
	{
		if(head==null || head.next==null)
			return;
		
		
		Node curr=head;
		
		while(curr.next!=null)
		{
			Node next=curr.next;
			if(curr.data==next.data)
				curr.next=next.next;
			else
				curr=curr.next;		
		}
		
	
			
		 
	}
	
	public static void main(String args[])
	{
		head=new Node(2);
		head.next=new Node(2);
		head.next.next=new Node(2);
		head.next.next.next=new Node(2);
		removeDuplicates(head);
		display(head);
	}
}
