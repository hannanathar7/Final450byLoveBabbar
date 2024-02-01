package BinarySearchTree;

import java.util.*;

public class CountPairsFrom2BSTwhoseSumisX {
	
	public class Node
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
	
	public static int countPairs(Node root1, Node root2, int x)
	{
		
		int c[]=new int[1];
		Set<Integer> set=new HashSet<Integer>();
		inOrder1(root2,set);
		inOrder2(root1,set,x,c);
		return c[0];
	}
	
	public static void inOrder1(Node node,Set<Integer> set)
	{
		if(node==null)
			return;
		
		inOrder1(node.left,set);
		set.add(node.data);
		inOrder1(node.right,set);
		
	}
	
	public static void inOrder2(Node node,Set<Integer> set,int x,int c[])
	{
		if(node==null)
			return;
		
		inOrder2(node.left,set,x,c);
		if(set.contains(x-node.data))
			c[0]=c[0]+1;
		inOrder2(node.right,set,x,c);
		
	}
	
	
	
	

}
