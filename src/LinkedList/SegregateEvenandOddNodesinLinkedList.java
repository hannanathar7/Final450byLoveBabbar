package LinkedList;



public class SegregateEvenandOddNodesinLinkedList {

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
	
	public static Node divide(Node head)
	{
		Node evenHead=null;
		Node evenTail=null;
		Node oddHead=null;
		Node oddTail=null;
		Node curr=head;
		
		while(curr!=null)
		{
			if(curr.data%2==0)
			{
				if(evenHead==null)
				{
					evenHead=curr;
					evenTail=curr;
				}
				else
				{
					evenTail.next=curr;
					evenTail=evenTail.next;
				}
			}
			else
			{
				if(oddHead==null)
				{
					oddHead=curr;
					oddTail=curr;
				}
				else
				{
					oddTail.next=curr;
					oddTail=oddTail.next;
				}
			}
			curr=curr.next;
		}
		
		if(evenHead==null || oddHead==null)
			return head;
		
		evenTail.next=oddHead;
		oddTail.next=null;
		
		return evenHead;
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
