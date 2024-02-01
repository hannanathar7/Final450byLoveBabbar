  package LinkedList;



public class Add2Numbers {

	static Node head1;
	static Node head2;
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
	
	public static Node add (Node node1, Node node2)
	{
		if(head1==null && head2==null)
			return head1;
		
		head1=reverse(head1);
		head2=reverse(head2);
		
		Node curr1=head1;
		Node curr2=head2;
		
		
		int sum=0,c=0;
		
		Node dummy=new Node(-1);
		Node prev=dummy;
		
		
		while(curr1!=null && curr2!=null)
		{
			sum=c+curr1.data+curr2.data;
			c=sum/10;
			sum=sum%10;
			Node n1=new Node(sum);
			prev.next=n1;
			prev=n1;
			curr1=curr1.next;
			curr2=curr2.next;
		}
		
		while(curr1!=null)
		{
			sum=c+curr1.data;
			c=sum/10;
			sum=sum%10;
			Node n1=new Node(sum);
			prev.next=n1;
			prev=n1;
			curr1=curr1.next;	
		}
		
		while(curr2!=null)
		{
			sum=c+curr2.data;
			c=sum/10;
			sum=sum%10;
			Node n1=new Node(sum);
			prev.next=n1;
			prev=n1;
			curr2=curr2.next;	
		}
		
		if(c!=0)
		{
			Node n1=new Node(c);
			prev.next=n1;
			prev=n1;
		}
		
		Node head=reverse(dummy.next);
		
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
	
	
}
