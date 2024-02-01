package BinarySearchTree;

import java.util.ArrayList;

public class PreOrderToPostOrder {
	
	public static class Node
	{
		Node left,right;
		int data;
		
		Node(int d)
		{
			data=d;
			left=null;
			right=null;
		}
	}
	
	
	

	public static void bst(int pre[])
	{
		ArrayList<Integer> list=new ArrayList<Integer>();
		pretopost(0,pre.length-1,pre,list);
		System.out.println(list);
	}
	
	public static void pretopost(int start,int end,int pre[],ArrayList<Integer> list)
	{
		if(start>end)
			return;
		
		int mid=start+1;
		
		while(mid<=end && pre[mid]<pre[start])
			mid++;
		
		mid--;
		
		pretopost(start+1,mid,pre,list);
		pretopost(mid+1,end,pre,list);
		
		list.add(pre[start]);
		
	}
	
	public static void main(String args[])
	{
		int a[]= {40,30,35,80,100};
		bst(a);
	}
	
	
	
	
	
	
	
	
	
	
	
    
	

}
	
