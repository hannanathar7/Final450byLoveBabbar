package LinkedList;



public class NNodeFromEndofLinkedList {

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
	
	int getNthFromLast(Node head, int n)
    {
	
	int l=length(head);
	if(n>l)
		return -1;
	int k=l-n+1;
	Node curr=head;
	
	for(int i=1;i<k;i++)
	{
		curr=curr.next;
	}
	return curr.data;	
}

public static int length(Node head)
{
	Node curr=head;
	int l=0;
	while(curr!=null)
	{
		l++;
		curr=curr.next;
	}
	return l;
}
	
	
}
