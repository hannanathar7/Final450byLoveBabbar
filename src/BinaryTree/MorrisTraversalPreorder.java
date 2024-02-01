package BinaryTree;

import java.util.*;




public class MorrisTraversalPreorder {
	
	public static class Node {
		int data;
		Node left;
		Node right;

		Node(int d) {
			data = d;
			left = null;
			right = null;
		}
	}

	 public List<Integer> preorderTraversal(Node root) {
		 
		 List<Integer> list=new ArrayList<>();
		 
		 if(root==null)
			 return list;
		 
		 Node curr=root;
		 while(curr!=null)
		 {
			 if(curr.left==null)
			 {
				 list.add(curr.data);
				 curr=curr.right;
			 }
			 else
			 {
				 Node next=curr.left;
				 
				 while(next.right!=null && next.right!=curr)
				 {
					 next=next.right;
				 }
				 
				 if(next.right==null)
				 {
					 next.right=curr;
					 list.add(curr.data);
					 curr=curr.left;
				 }
				 else
				 {
					 next.right=null;
					 
					 curr=curr.right;
				 }
			 }
			 
			 
		 }
		 
		 return list;
		 
	 }

}
