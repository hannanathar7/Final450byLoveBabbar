package BinaryTree;

import java.util.*;


public class PostOrderTraversal {

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
	
	
	public static void postOrder(Node node)
	{
		ArrayList<Integer> list=new ArrayList<Integer>();
		
		traversal(node,list);
			
		System.out.println(list);
	}
	
	public static void traversal(Node node,ArrayList<Integer> list)
	{
	
		if(node==null)
		{
		return;
		}
	
		
		traversal(node.left,list);
		traversal(node.right,list);
		list.add(node.data);
		
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
 
        postOrder(root);
    }
	
	
}
