package StackAndQueue;

public class Implement2StackinArray {

	int stack[];
	int top1,top2;
	
	Implement2StackinArray()
	{
		stack=new int[100];
		top1=-1;
		top2=stack.length;
	}
	
	int size1()
	{
		return top1+1;
	}
	
	int size2()
	{
		return stack.length-top2;
	}
	
	
	void push1(int val )
	{
		if(top2==top1+1)
			System.out.println("Overflow");
		
		else
		{
		top1++;
		stack[top1]=val;
		}
	}
	
	void push2(int val)
	{
		if(top2==top1+1)
			System.out.println("Overflow");
		
		else
		{
		top2--;
		stack[top2]=val;
		}
	}
	
	int pop1()
	{
		if(top1==-1)
		{
			System.out.println("Underflow");
			return -1;
		}
		else
		{
		int n=stack[top1];
		top1--;
		return n;
		}
	}
	
	int pop2()
	{
		if(top2==stack.length)
		{
			System.out.println("Underflow");
			return -1;
		}
		else
		{
		int n=stack[top2];
		top2++;
		return n;
		}
	}
	
}
