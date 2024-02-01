package LinkedList;

import java.util.*;

public class RemoveDuplicatesInUnsortedLinkedList {

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
	
	public static void display(Node node)
	{
		Node curr=node;
		while(curr!=null)
		{
			System.out.println(curr.data);
			curr=curr.next;
		}
	}
	
	public static void removeDuplicates(Node node)
	{
		if(head==null || head.next==null)
			return;
		
		
		
		HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
		
		Node prev=null;
		Node curr=head;
		
		while(curr!=null)
		{
			if(map.containsKey(curr.data))
			{
				prev.next=curr.next;
				curr=curr.next;
			}
			else
			{
				map.put(curr.data,1);
				prev=curr;
				curr=curr.next;
			}
		}
		
	
			
		 
	}
	
	public static void main(String args[])
	{
		head=new Node(2);
		head.next=new Node(2);
		head.next.next=new Node(2);
		head.next.next.next=new Node(2);
		removeDuplicates(head);
		display(head);
	}
}
