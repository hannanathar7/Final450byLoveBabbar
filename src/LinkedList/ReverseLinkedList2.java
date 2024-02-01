package LinkedList;

import java.util.*;

public class ReverseLinkedList2
{
	static Node head;
	
public static  class Node
{
	int data;
	Node next;
	
	Node(int d)
	{
		data=d;
		next=null;
	}
}

public static Node reverse(Node node)
{
	Node prev=null;
	Node curr=head;
	
	while(curr!=null)
	{
	Node next=curr.next;
	curr.next=prev;
	prev=curr;
	curr=next;
	}
	return prev;
}

public static void display(Node node)
{
	Node temp=head;
	while(temp!=null)
	{
		System.out.println(temp.data);
		temp=temp.next;
	}
}


public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	
	
	head=new Node(5);
	head.next=new Node(7);
	head.next.next=new Node(8);
	display(head);
	head=reverse(head);
	display(head);
	sc.close();
	
	
}

}


