package LinkedList;

import java.util.*;

public class ReverseLinkedList
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


