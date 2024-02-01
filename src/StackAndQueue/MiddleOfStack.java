package StackAndQueue;



public class MiddleOfStack {

	
	
	public class Node
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
	
	int count=0;
	Node dummy=new Node(-1);
	Node head=dummy;
	Node mid=dummy;
	
	void push(int data)
	{
		Node curr=new Node(data);
		curr.prev=head;
		head.next=curr;
		head=head.next;
		count++;
		
		if (count==1)
			mid=curr;
			
		else if(count%2==0)
			mid=mid.next;
		
	}
	
	int pop()
	{
		int data=-1;
		if(count==0)
		{
			System.out.println("Stack underflow");
			return data;
		}
		else
		{
			count--;
			data=head.data;
			
			if(count==0)
				mid=null;
			
			else if(count%2==1)
				mid=mid.prev;
			
			head=head.prev;
			head.next=null;
			
		}
		
		return data;
	
	}
	
	int middle()
	{
		int data=-1;
		if(count==0)
		{
			System.out.println("Stack underflow");
			return data;
		}
		else
		{
			data=mid.data;
		}
		return data;
	}
	
	void display()
	{
		if(count==0)
		{
			System.out.println("Stack underflow");
			return;
		}
		Node curr=dummy.next;
		while(curr!=null)
		{
			System.out.print(curr.data+" ");
			curr=curr.next;
		}
		System.out.println();
	}
	
	public static void main(String args[])
	{
		MiddleOfStack st=new MiddleOfStack();
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		st.push(5);
		st.display();
		int mid=st.middle();
		System.out.println(mid);
		
		int n1=st.pop();
		System.out.println(n1);
		st.display();
		int mid1=st.middle();
		System.out.println(mid1);
		
		int n2=st.pop();
		System.out.println(n2);
		st.display();
		int mid2=st.middle();
		System.out.println(mid2);
		
		int n3=st.pop();
		System.out.println(n3);
		st.display();
		int mid3=st.middle();
		System.out.println(mid3);
		
		int n4=st.pop();
		System.out.println(n4);
		st.display();
		int mid4=st.middle();
		System.out.println(mid4);
		
		int n5=st.pop();
		System.out.println(n5);
		st.display();
		int mid5=st.middle();
		System.out.println(mid5);
		
		
	}
	
	
	
}
