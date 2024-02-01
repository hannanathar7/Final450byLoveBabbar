package LinkedList;
import java.util.*;


public class SortaKSortedDLL {

	static Node head;
	
	public static class Node
	{
		int data;
		Node next;
		Node prev;
		
		Node(int d)
		{
			data=d;
			next=null;
			prev=null;
		}
	}
	

	
	public static Node sort(Node head,int k)
	{
		if(head==null || head.next==null)
			return head;
		
		PriorityQueue<Node> pq=new PriorityQueue<>((a,b)->(a.data-b.data));
		Node curr=head;
		
		for(int i=1;i<=k+1 && curr!=null;i++)
		{
			pq.add(curr);
			curr=curr.next;
		}
		
		Node newHead=null;
		Node prev=null;
		
		while(pq.size()>0)
		{
			Node n=pq.remove();
			
			if(newHead==null)
			{
				newHead=n;
				newHead.prev=null;
				prev=newHead;
			}
			else
			{
				prev.next=n;
				n.prev=prev;
				prev=n;
			}
			
			if(curr!=null)
			{
				pq.add(curr);
				curr=curr.next;
			}
			
		}
		prev.next=null;
		
		
		return newHead;
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
	
	public static void main(String args[])
	{
		head=new Node(3);
		head.next=new Node(6);
		head.next.next=new Node(2);
		head.next.next.next=new Node(12);
		head.next.next.next.next=new Node(56);
		head.next.next.next.next.next=new Node(8);
		head=sort(head,2);
		display(head);
	}
	
	
	
}
