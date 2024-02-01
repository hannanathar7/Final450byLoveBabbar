package StackAndQueue;

public class ImplementStack {

	int stack[];
	int top;
	
	ImplementStack(int n)
	{
		stack=new int[n];
		top=-1;
	}
	
	int size()
	{
		return top+1;
	}
	
	void display()
	{
		for(int i=0;i<=top;i++)
			System.out.print(stack[i]+ " ");
		System.out.println();
	}
	
	void push(int val)
	{
		if(top==stack.length-1)
			System.out.println("Overflow");
		
		else
		{
		top++;
		stack[top]=val;
		}
	}
	
	int pop()
	{
		if(top==-1)
		{
			System.out.println("Underflow");
			return -1;
		}
		else
		{
		int n=stack[top];
		top--;
		return n;
		}
	}
	
	int top()
	{
		if(top==-1)
		{
			System.out.println("Underflow");
			return -1;
		}
		else
		{
		int n=stack[top];
		return n;
		}
	}
	
	public static void main(String args[])
	{
		ImplementStack st=new ImplementStack(5);
		st.push(10);
		st.display();
		st.push(20);
		st.push(30);
		st.display();
		int n=st.pop();
		System.out.println(n);
		int n1=st.top();
		System.out.println(n1);
		int n2=st.size();
		System.out.println(n2);
	}
}
