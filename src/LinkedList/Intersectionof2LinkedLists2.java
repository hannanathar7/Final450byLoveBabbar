package LinkedList;


public class Intersectionof2LinkedLists2 {

	static Node head1;
	static Node head2;

	
	public static class Node{
		int data;
		Node next;
		
		Node(int d)
		{
			data=d;
			next=null;
		}
	}
	
	public static Node intersection (Node node1, Node node2)
	{
		if(head1==null && head2==null)
			return null;
		
		if(head1==null)
			return head2;
		
		if(head2==null)
			return head1;
		
		
		Node dummy=new Node(0);
		Node prev=dummy;
		
		Node curr1=head1;
		Node curr2=head2;
		
		while(curr1!=null && curr2!=null)
		{
		
			if(curr1.data==curr2.data)
			{
				Node n=new Node(curr1.data);
				prev.next=n;
				prev=prev.next;
				curr1=curr1.next;
				curr2=curr2.next;
			}
			else if(curr1.data<curr2.data)
			{
				curr1=curr1.next;
			}
			else
			{
				curr2=curr2.next;
			}
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
