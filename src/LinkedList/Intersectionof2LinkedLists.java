package LinkedList;

import java.util.*;

public class Intersectionof2LinkedLists {

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
		if(head1==null && head2==null)
			return null;
		
		if(head1==null)
			return head2;
		
		if(head2==null)
			return head1;
		
		
		Node dummy=new Node(0);
		Node prev=dummy;
		
		HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
		Node curr1=head1;
		
		while(curr1!=null)
		{
			if(map.containsKey(curr1.data))
				map.put(curr1.data,map.get(curr1.data)+1);
			else
				map.put(curr1.data,1);
			curr1=curr1.next;
		}
		
		Node curr2=head2;
		while(curr2!=null)
		{
			if(map.containsKey(curr2.data) && map.get(curr2.data)>0)
			{
				Node n=new Node(curr2.data);
				prev.next=n;
				prev=n;
				map.put(curr2.data,map.get(curr2.data)-1);
			}
			curr2=curr2.next;
		}
		
		
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
