package BinarySearchTree;


import java.util.*;

public class ConvertBSTtoBalancedBST {
	
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
	
	
	public Node BalancedBST(Node root)
	{
		 ArrayList<Integer> list=new ArrayList<Integer>();
			inOrder(root,list);
			
			root=solve(0,list.size()-1,list);
			return root;
		}
		
		public Node solve(int start,int end,ArrayList<Integer> list)
		{
			if(start>end)
				return null ;
			
			int mid=(start+end)/2;
			Node root=new Node(list.get(mid));
			root.left=solve(start,mid-1,list);
			root.right=solve(mid+1,end,list);
			
			return root;
		}
		
		
		
		
		public void inOrder(Node node,ArrayList<Integer> list)
		{
			if(node==null)
				return;
			
			inOrder(node.left,list);
			
			list.add(node.data);
			
			inOrder(node.right,list);

	    }
	
    
	

}
	
