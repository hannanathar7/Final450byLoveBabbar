package BinaryTree;

import java.util.*;




public class PreOrderTraversal2 {

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
	
	
	public static void preOrder(Node node)
	{
		
		ArrayList<Integer> list=new ArrayList<Integer>();
		Stack<Node> s=new Stack<>();
		
		if(node==null)
			return;
		s.push(node);
		
		while(s.size()>0)
		{
			Node curr=s.pop();
			list.add(curr.data);
			
			if(curr.right!=null)
				s.push(curr.right);
			
			
			if(curr.left!=null)
				s.push(curr.left);
			
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
 
        preOrder(root);
    }
	
	
	
	
}
