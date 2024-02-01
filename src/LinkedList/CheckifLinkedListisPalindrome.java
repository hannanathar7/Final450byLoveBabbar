package LinkedList;


public class CheckifLinkedListisPalindrome {

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
	
	public static boolean isPalindrome(Node node)
	{
		boolean b=true;
		Node mid=middle(head);
		mid=reverse(mid.next);
		Node curr=head;
		while(mid!=null)
		{
			if(curr.data!=mid.data)
			{
				b=false;
				break;
			}
			curr=curr.next;
			mid=mid.next;
		}
		
		mid=middle(head);
		mid=reverse(mid.next);
		
		return b;
	}
	
	
	
	public static Node middle(Node node)
	{
		Node slow=head;
		Node fast=head;
		while(fast.next!=null && fast.next.next!=null)
		{
			slow=slow.next;
			fast=fast.next.next;
		}
		
		return slow;		
	}
	
	public static Node reverse(Node node)
	{
		if(node==null || node.next==null)
		{
			return node;
		}
		
		Node newNode=reverse(node.next);
		Node nextNode=node.next;
		nextNode.next=node;
		node.next=null;
		return newNode;
	}

	
	
	
	
	
	
}
