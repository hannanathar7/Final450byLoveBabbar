package BinaryTree;

import java.util.*;

public class BoundaryTraversalofBinaryTree {

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
	
	
	public static void boundary(Node node)
	{
		
		ArrayList<Integer> list=new ArrayList<>();
		 if(node==null)
		 {
			 System.out.println(list);
		 }
		 
		 
		 if(!isLeafNode(node))
		 list.add(node.data);
		 
		 addLeftBoundary(node,list);
		 addLeaf(node,list);
		 addRightBoundary(node,list);
		 
		 System.out.println(list);
		 
		}
		
		public static boolean isLeafNode(Node node)
		{
		    if(node.left==null && node.right==null)
		    return true;
		    
		    return false;
		}
		
		public static void addLeftBoundary(Node node,ArrayList<Integer> list)
		{
		    Node curr=node.left;
		    
		    while(curr!=null)
		    {
		        if(!isLeafNode(curr))
		        list.add(curr.data);
		        
		        if(curr.left!=null)
		        curr=curr.left;
		        
		        else
		        curr=curr.right;
		    }
		}
		
		public static void addLeaf(Node node,ArrayList<Integer> list)
		{
		    if(node==null)
		    return;
		    
		    if(isLeafNode(node))
		    list.add(node.data);
		    
		    addLeaf(node.left,list);
		    addLeaf(node.right,list);
		}
		
		public static void addRightBoundary(Node node,ArrayList<Integer> list)
		{
		    Node curr=node.right;
		    Stack<Integer> st=new Stack<>();
		    
		    while(curr!=null)
		    {
		         if(!isLeafNode(curr))
		        st.push(curr.data);
		        
		        if(curr.right!=null)
		        curr=curr.right;
		        
		        else
		        curr=curr.left;
		    }
		    
		    while(st.size()>0)
		    list.add(st.pop());
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
 
        boundary(root);
    }
	
	
	
	
}
