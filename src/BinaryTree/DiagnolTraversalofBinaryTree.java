package BinaryTree;

import java.util.*;




public class DiagnolTraversalofBinaryTree {

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
	
	
	public static void diagnol(Node node)
	{
		
		ArrayList<Integer> list=new ArrayList<Integer>();
		Queue<Node> q=new LinkedList<>();
		
		if(node==null)
			return;
		q.add(node);
		
		while(q.size()>0)
		{
			Node curr=q.remove();
			
			while(curr!=null)
			{
				
			list.add(curr.data);
			
			if(curr.left!=null)
				q.add(curr.left);
			
			curr=curr.right;
			
			}
			
		}
		
		System.out.println(list);
		
	}
	
	
	
	public static void main(String[] args)
    {
       
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.right.left = new Node(5);
        root.right.right = new Node(6);
        root.right.left.left = new Node(7);
        root.right.left.right = new Node(8);
 
        diagnol(root);
    }
	
	
	
	
}
