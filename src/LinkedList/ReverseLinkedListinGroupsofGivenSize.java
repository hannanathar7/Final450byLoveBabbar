package LinkedList;



public class ReverseLinkedListinGroupsofGivenSize {
	
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
	
	public static Node reverse(Node node,int k)
	{
		Node dummy=new Node(0);
		dummy.next=head;
		
		if(head==null || k==1) 
			return head;
		
		Node prev=dummy;
		Node next=dummy;
		
		int len=0;
		Node curr=head;
		while(curr!=null)
		{
			len++;
			curr=curr.next;
		}
		
		while(len>=k) {
			curr=prev.next;
			next=curr.next;
			for(int i=1;i<=k-1;i++)
			{
				curr.next=next.next;
				next.next=prev.next;
				prev.next=next;
				next=curr.next;
			}
			len=len-k;
			prev=curr;
		}
		
		return dummy.next;
		
		
	}
	
	public static void display(Node node)
	{
		if(head==null)
			return;
		
		Node curr=head;
		while(curr!=null)
		{ 
			System.out.print(curr.data+" ");
			curr=curr.next;
		}
	}
	
	public static void main(String args[])
	{
		
		head=new Node(1);
		head.next=new Node(2);
		head.next.next=new Node(3);
		head.next.next.next=new Node(4);
		head.next.next.next.next=new Node(5);
		
		head=reverse(head,3);
		display(head);
	}

}
