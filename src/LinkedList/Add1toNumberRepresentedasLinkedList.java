package LinkedList;



public class Add1toNumberRepresentedasLinkedList {

	public static Node head;
	
	public static class Node{
		int data;
		Node next;
		
		Node(int d)
		{
			data=d;
			next=null;
		}
	}
	
	public static Node add1 (Node node)
	{
		if(head==null)
			return head;
		
		head=reverse(head);
		
		Node curr=head;
		Node one=new Node(1);
		while(curr!=null)
		{
			if(curr.next==null && curr.data==9)
			{
				curr.data=0;
				curr.next=one;
				break;
			}
			else {
			curr.data=curr.data+1;
			if(curr.data==10)
			{
				curr.data=0;
				curr=curr.next;
			}
			else
				break;
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
	
	
	
	public static Node reverse (Node head)
	{
		if(head==null || head.next==null)
			return head;
		
		Node prev=null,curr=head;
		while(curr!=null)
		{
			Node next=curr.next;
			curr.next=prev;
			prev=curr;
			curr=next;
		}
		return prev;
		
	}
	
	public static void main(String args[])
	{
		head=new Node(9);
		head.next=new Node(9);
		head.next.next=new Node(9);
		head=add1(head);
		display(head);
	}
	
}
