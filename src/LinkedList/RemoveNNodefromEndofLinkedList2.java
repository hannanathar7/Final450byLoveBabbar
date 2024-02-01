package LinkedList;



public class RemoveNNodefromEndofLinkedList2 {

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
	
	public static Node NthNode(Node head,int n)
	{
		 	Node dummy=new Node(-1);
	        dummy.next=head;
	        Node second=dummy;
	        Node first=dummy;

	        for(int i=1;i<=n;i++)
	        {
	            first=first.next;
	        }

	        while(first.next!=null)
	        {
	            first=first.next;
	            second=second.next;
	        }
	        

	        second.next=second.next.next;

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
