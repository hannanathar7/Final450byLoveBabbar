package LinkedList;

import java.util.*;

public class AddAtLast
{
	
public static  class Node
{
	int data;
	Node next;
}

public static class LinkedList {
	
	Node head;
	Node tail;
	int size;

}

public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	LinkedList list=new LinkedList();
	boolean b=true;
	while(b)
	{
	int val=sc.nextInt();
	
	Node temp=new Node();
	temp.data=val;
	temp.next=null;
	if(list.size==0)
	{
		list.head=temp;
		list.tail=temp;
	}
	else
	{
		list.tail.next=temp;
		list.tail=temp;
	}
	list.size++;
	System.out.println("Enter false to exit/true to continue");
	b=sc.nextBoolean();
	}
	sc.close();
	
	Node t=list.head;
	while(t!=null)
	{
		System.out.println(t.data);
		t=t.next;
	}
}

}


