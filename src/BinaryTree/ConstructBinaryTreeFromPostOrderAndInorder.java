package BinaryTree;

import java.util.*;
public class ConstructBinaryTreeFromPostOrderAndInorder {

	public static class Node
	{
		int data;
		Node left;
		Node right;
		
		Node(int d)
		{
			data=d;
			left=null;
			right=null;
		}
	}
	
	public static Node binaryTree()
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int in[]=new int[n];
		int post[]=new int[n];
		
		for(int i=0;i<n;i++)
			in[i]=sc.nextInt();
		
		for(int i=0;i<n;i++)
			post[i]=sc.nextInt();
		
		sc.close();
		
		if(in.length!=post.length || in==null || post==null)
			return null;
		
		HashMap<Integer,Integer> map=new HashMap<>();
		for(int i=0;i<n;i++)
			map.put(in[i],i);
		
		Node root=construct(in,0,n-1,post,0,n-1,map);
		return root;
		
		
	}
	
	
	public static Node construct(int in[],int instart,int inend,int post[],int poststart,int postend,HashMap<Integer,Integer> map)
	{
	
		if(poststart>postend || instart>inend)
			return null;
		
		Node node=new Node(post[postend]);
		int root=map.get(node.data);
		int numsleft=root-instart;
		
		node.left=construct(in,instart,root-1,post,poststart,poststart+numsleft-1,map);
		node.right=construct(in,root+1,inend,post,poststart+numsleft,postend-1,map);
		
		return node;
		
	}
		
	}
	
	
	
	
	
	
	

