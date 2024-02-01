package BinaryTree;

public class HeightOfBinaryTree2 {

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
	
	
	  public int maxDepth(Node root) {

	        if(root==null)
	        return 0;

	        int max[]=new int[1];
	        max[0]=0;

	        solve(root,max,0);
	        
	        return max[0]+1;
	        
	    }

	    public void solve(Node node,int max[],int level)
	    {
	        if(node==null)
	        return;

	        if(level>max[0])
	        max[0]=level;

	        solve(node.left,max,level+1);
	        solve(node.right,max,level+1);
	    }
	
	
}
