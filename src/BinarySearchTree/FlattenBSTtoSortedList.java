package BinarySearchTree;



public class FlattenBSTtoSortedList {
	
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
	
	
	public Node find(Node root)
	{
		
		Node dummy=new Node(-1);
		Node curr=dummy;
		
		inOrder(root,curr);
		
		curr.left=null;
		curr.right=null;
		
		return dummy.right;
		
	}
	
	
	
	
	
	public void inOrder(Node node,Node curr)
	{
		if(node==null)
			return;
		
		inOrder(node.left,curr);
		
		curr.left=null;
		curr.right=node;
		curr=node;
		
		inOrder(node.right,curr);
	}
	
	
    
	

}
	
