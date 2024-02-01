package BinaryTree;



public class CheckIfTreesAreIdentical {

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
	
	
	 public boolean isSameTree(Node p, Node q) {
	        
		 if(p==null || q==null)
		        return (p==q);

		        return (p.data==q.data) && isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
	        
	    }
	
	
	
	
	
	
}
