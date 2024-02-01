package LinkedList;



public class CloneLLwithNextandRandomPointer {

	static Node head;
	
	public static class Node{
		int data;
		Node next;
		Node random;
		
		Node(int d)
		{
			data=d;
			next=null;
			random=null;
		}
	}
	
	public static Node clone(Node node)
	{
		Node curr=head;
		
		while(curr!=null)
		{
			Node next=curr.next;
			Node copy=new Node(curr.data);
			curr.next=copy;
			copy.next=next;
			curr=next;
		}
		
		curr=head;
		
		while(curr!=null)
		{
			if(curr.random!=null)
			curr.next.random=curr.random.next;
			
			curr=curr.next.next;
		}
		
		Node dummy=new Node(0);
		Node prev=dummy;
		curr=head;
		
		while(curr!=null)
		{
			Node next=curr.next.next;
			prev.next=curr.next;
			curr.next=next;
			prev=prev.next;
			curr=curr.next;
		}
		
		return dummy.next;
		
		
		
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
	
	
	
}
