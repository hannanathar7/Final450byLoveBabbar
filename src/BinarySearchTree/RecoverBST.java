package BinarySearchTree;

public class RecoverBST {
	
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
	
	private Node prev;
	private Node first;
	private Node middle;
	private Node last;
	
	public void recoverTree(Node root) {
		
		if(root==null)
			return;
		prev=first=middle=last=null;
		
		inOrder(root);
        
		if(first!=null && last!=null)
		{
			int t=first.data;
			first.data=last.data;
			last.data=t;
		}
		
		else if(first!=null && middle!=null)
		{
			int t=first.data;
			first.data=middle.data;
			middle.data=t;
		}
    }
	
	public void inOrder(Node node)
	{
		if(node==null)
			return;
		
		inOrder(node.left);
		
		if(prev!=null && node.data<prev.data)
		{
			if(first==null)
			{
				first=prev;
				middle=node;
			}
			
			else
			{
				last=node;
			}
		}
		
		prev=node;
		
		inOrder(node.right);
	}
	
	
	
	
	
	
	
	

}
