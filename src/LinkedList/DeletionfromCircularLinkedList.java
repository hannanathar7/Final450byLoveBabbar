package LinkedList;



public class DeletionfromCircularLinkedList {

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
	
	public static Node delete(Node head,int data)
	{
		if(head==null)
			return head;
		
		if(head.data==data)
		{
			head=head.next;
			return head;
		}	
		
		Node curr=head.next;
		Node prev=head;
		while(curr!=head)
		{
			if(curr.data==data)
			{
				prev.next=curr.next;
				curr.next=null;
				break;
			}
			else
			{
				prev=curr;
				curr=curr.next;
			}
		}
		
		
		return head;		
	}
	
	
	
}
