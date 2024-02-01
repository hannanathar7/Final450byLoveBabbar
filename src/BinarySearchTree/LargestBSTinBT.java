package BinarySearchTree;



public class LargestBSTinBT {
	
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
	
	public class NodeValue
	{
		
		int max,min,size;
		
		NodeValue(int m1,int m2,int s)
		{
			max=m1;
			min=m2;
			size=s;
		}
	}
	
	
	public int largest(Node root)
	{
		return solve(root).max;
	}
	
	public NodeValue solve(Node node)
	{
		if(node==null)
			return new NodeValue(Integer.MIN_VALUE,Integer.MAX_VALUE,0);
		
		NodeValue left=solve(node.left);
		NodeValue right=solve(node.right);
		
		if(node.data>left.max && node.data<right.min)
		{
			return new NodeValue(Math.max(node.data,right.max), Math.min(node.data,left.min),1+left.size+right.size);
		}
		
		return new NodeValue(Integer.MAX_VALUE,Integer.MIN_VALUE,Math.max(left.size,right.size));
	}
	
	
	
	
	
	
	
	
	
	
	
	
    
	

}
	
