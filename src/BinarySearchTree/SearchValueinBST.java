package BinarySearchTree;

public class SearchValueinBST {
	
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
	
	
	public Node search(Node root,int key)
	{
		if(root==null)
			return root;
		
		if(root.data==key)
			return root;
		
		if(key<root.data)
			return search(root.left,key);
		
		else
			return search(root.right,key);
		
	}

}
