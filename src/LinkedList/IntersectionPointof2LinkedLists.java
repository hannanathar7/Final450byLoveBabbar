package LinkedList;


public class IntersectionPointof2LinkedLists {

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
		if(head1==null || head2==null)
			return null;
		
		Node curr1=head1;
		Node curr2=head2;
		
		while(curr1!=curr2)
		{
			if(curr1==null)
				curr1=head2;
			else
				curr1=curr1.next;
			
			if(curr2==null)
				curr2=head1;
			else
				curr2=curr2.next;
		}
		
		return curr1;
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
