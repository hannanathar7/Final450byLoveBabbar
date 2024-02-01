package Heap;

import java.util.*;





public class ConvertBSTtoMinHeap {
	
	
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

	
	
	public static Node bstToMinHeap(Node root)
	{
		ArrayList<Integer> list=new ArrayList<Integer>();
		
		inOrder(root,list);
		int i[]=new int[1];
		preOrder(root,list,i);
		
		
		return root;
	}
	
	
	public static void inOrder(Node root,ArrayList<Integer> list)
	{
		if(root==null)
			return;
		
		inOrder(root.left,list);
		list.add(root.data);
		inOrder(root.right,list);
	}
	
	
	public static void preOrder(Node root,ArrayList<Integer> list,int i[])
	{
		if(root==null)
			return;
		
		root.data=list.get(i[0]);
		i[0]=i[0]+1;
		preOrder(root.left,list,i);
		preOrder(root.right,list,i);
	}
	
	public static void main(String[] args)
    {
       
        Node root = new Node(4);
        root.left = new Node(2);
        root.right = new Node(6);
        root.left.left = new Node(1);
        root.left.right = new Node(3);
        root.right.left = new Node(5);
        root.right.right = new Node(7);
       
 
        bstToMinHeap(root);
    }

}
