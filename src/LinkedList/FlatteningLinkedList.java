package LinkedList;



public class FlatteningLinkedList {

	static Node root;
	
	public static class Node
	{
		int data;
		Node next;
		Node bottom;
		
		
		Node(int d)
		{
			data=d;
			next=null;
			bottom=null;
			
		}
	}
	
	public static void display(Node node)
	{
		Node curr=node;
		while(curr!=null)
		{
			System.out.println(curr.data);
			curr=curr.bottom;
		}
	}
	
	public static Node flatten(Node root)
	{
		if(root==null || root.next==null)
			return root;
		
		root.next=flatten(root.next);
		
		root=mergeRoot(root,root.next);
		
		return root;
		
	}
	
	public static Node mergeRoot(Node a,Node b)
	{
		Node dummy=new Node(0);
		Node prev=dummy;
		while(a!=null && b!=null)
		{
			if(a.data<=b.data)
			{
				prev.bottom=a;
				prev=prev.bottom;
				a=a.bottom;
			}
			else
			{
				prev.bottom=b;
				prev=prev.bottom;
				b=b.bottom;
			}
		}
		
		if(a!=null)
		{
			prev.bottom=a;
		}
		else
		{
			prev.bottom=b;
		}
		return dummy.bottom;
	}
	
	
	
}
