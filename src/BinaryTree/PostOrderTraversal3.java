package BinaryTree;

import java.util.*;




public class PostOrderTraversal3 {

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
	
	
	public static void postOrder(Node root)
	{
		
	        
	        List<Integer> list=new ArrayList<>();
	        Stack<Node> st1=new Stack<>();
	        Stack<Node> st2=new Stack<>();

	        if(root==null)
	        	System.out.println(list);

	        st1.push(root);

	        while(st1.size()>0)
	        {
	            Node node=st1.pop();
	            st2.push(node);
	            if(node.left!=null)
	            st1.push(node.left);
	            if(node.right!=null)
	            st1.push(node.right);
	        }

	        while(st2.size()>0)
	        {
	            list.add(st2.pop().data);
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
 
        postOrder(root);
    }
	
	
}
