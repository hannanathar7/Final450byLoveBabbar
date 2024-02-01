package BinarySearchTree;



public class InorderSeccessorOfAllNodes {
	
	public class Node
	{
		Node left,right,next;
		int data;
		
		Node(int d)
		{
			data=d;
			left=null;
			right=null;
			next=null;
		}
	}
	
	
	public void find(Node root)
	{
		
		Node prev=null;;
		inOrder(root,prev);
		
	}
	
	
	
	
	
	public void inOrder(Node node,Node prev)
	{
		if(node==null)
			return;
		
		inOrder(node.left,prev);
		
		if(prev!=null)
		{
			prev.next=node;
		}
		prev=node;
		
		inOrder(node.right,prev);
	}
	
	
    
	

}
	
