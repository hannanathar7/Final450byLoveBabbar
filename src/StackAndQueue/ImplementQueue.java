package StackAndQueue;

public class ImplementQueue {

	int queue[];
	int front,size;
	
	ImplementQueue(int n)
	{
		queue=new int[n];
		front=0;
		size=0;
	}
	
	int size()
	{
		return size;
	}
	
	void display()
	{
		for(int i=0;i<size;i++)
		{
			int idx=(front+i)%queue.length;
			System.out.print(queue[idx]+ " ");
		}
		System.out.println();
	}
	
	void add(int val)
	{
		if(size==queue.length)
			System.out.println("Queue Overflow");
		
		else
		{
		int rear=(front+size)%queue.length;
		queue[rear]=val;
		size++;
		}
	}
	
	int remove()
	{
		if(size==0)
		{
			System.out.println("Queue Underflow");
			return -1;
		}
		else
		{
		int n=queue[front];
		front=(front+1)%queue.length;
		size--;
		return n;
		}
	}
	
	int peek()
	{
		if(size==0)
		{
			System.out.println("Queue Underflow");
			return -1;
		}
		else
		{
		int n=queue[front];
		return n;
		}
	}
	
	public static void main(String args[])
	{
		ImplementQueue st=new ImplementQueue(5);
		st.add(10);
		st.display();
		st.add(20);
		st.add(30);
		st.display();
		int n=st.remove();
		System.out.println(n);
		int n1=st.remove();
		System.out.println(n1);
		int n2=st.size();
		System.out.println(n2);
	}
}
