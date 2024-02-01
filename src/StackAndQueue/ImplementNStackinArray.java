package StackAndQueue;

public class ImplementNStackinArray {

	int a[];
	int top[];
	int next[];
	int free;
	
	ImplementNStackinArray(int n,int k)
	{
		a=new int[n];
		top=new int[k];
		next=new int[n];
		free=0;
	}
	
	boolean isFull()
	{
		if(free==-1)
			return true;
		
		return false;
	}
	
	boolean isEmpty(int sn)
	{
		if(top[sn]==-1)
			return true;
		
		return false;
	}
	
	void push(int val,int sn)
	{
		if(isFull())
		{
			System.out.println("Stack Overflow");
			return;
		}
		
		int i=free;
		free=next[i];
		next[i]=top[sn];
		top[sn]=i;
		
		a[i]=val;
		
	}
	
	
	
	int pop(int sn)
	{
		if(isEmpty(sn))
		{
			System.out.println(" Stack Underflow");
			return -1;
		}
		
		int i=top[sn];
		top[sn]=next[i];
		next[i]=free;
		free=i;
		
		return a[i];
		
	}
	
	
	
	
}
