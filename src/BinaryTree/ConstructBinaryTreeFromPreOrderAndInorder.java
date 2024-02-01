package BinaryTree;

import java.util.*;
public class ConstructBinaryTreeFromPreOrderAndInorder {

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
		int pre[]=new int[n];
		
		for(int i=0;i<n;i++)
			in[i]=sc.nextInt();
		
		for(int i=0;i<n;i++)
			pre[i]=sc.nextInt();
		
		sc.close();
		
		if(in.length!=pre.length || in==null || pre==null)
			return null;
		
		HashMap<Integer,Integer> map=new HashMap<>();
		for(int i=0;i<n;i++)
			map.put(in[i],i);
		
		Node root=construct(in,0,n-1,pre,0,n-1,map);
		return root;
		
		
	}
	
	
	public static Node construct(int in[],int instart,int inend,int pre[],int prestart,int preend, HashMap<Integer,Integer> map)
	{
	
		if(prestart>preend || instart>inend)
			return null;
		
		Node node=new Node(pre[prestart]);
		int root=map.get(node.data);
		int numsleft=root-instart;
		
		node.left=construct(in,instart,root-1,pre,prestart+1,prestart+numsleft,map);
		node.right=construct(in,root+1,inend,pre,prestart+numsleft+1,preend,map);
		
		return node;
		
	}
		
	}
	
	
	
	
	
	
	

