package LinkedList;



public class DeleteNodeshavingGreaterValueonRight {

	static Node head;
	
	public static class Node{
		int data;
		Node next;
		
		Node(int d)
		{
			data=d;
			next=null;
		}
	}
	
	public static Node delete(Node node)
	{
		
		head=reverse(head);
		
		int max=head.data;
		Node curr=head;
		Node prev=null;
		while(curr!=null)
		{
			if(curr.data>=max)
			{
				max=curr.data;
				prev=curr;
				curr=curr.next;
			}
			else
			{
				prev.next=curr.next;
				curr=prev.next;
			}
		}
		
		head=reverse(head);
		
		return head;
		
		
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
	
	public static Node reverse(Node node)
	{
		Node prev=null;
		Node curr=head;
		
		while(curr!=null)
		{
		Node temp=curr.next;
		curr.next=prev;
		prev=curr;
		curr=temp;
		}
		return prev;
	}
	
	
}
