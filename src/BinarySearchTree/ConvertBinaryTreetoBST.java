package BinarySearchTree;

import java.util.ArrayList;
import java.util.Collections;

public class ConvertBinaryTreetoBST {
	
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
	
	
	public Node BinaryTreetoBST(Node root)
	{
		 ArrayList<Integer> list=new ArrayList<Integer>();
			inOrder(root,list);
			Collections.sort(list);
			int i[]=new int[1];
			solve(root,i,list);
			return root;
		}
		
		public void solve(Node node,int i[],ArrayList<Integer> list)
		{
			if(node==null)
				return ;
			
			solve(node.left,i,list);
			
			node.data=list.get(i[0]);
			i[0]=i[0]+1;

			solve(node.right,i,list);

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
	
