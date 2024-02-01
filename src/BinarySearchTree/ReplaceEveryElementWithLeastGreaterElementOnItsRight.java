package BinarySearchTree;



public class ReplaceEveryElementWithLeastGreaterElementOnItsRight {
	
	public static class Node
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
	
	public static Node suc;
	

	public static void bst(int a[])
	{
		
		Node root=null;
		for(int i=a.length-1;i>=0;i--)
		{
			suc=null;
			root=insert(root,a[i]);
			if(suc!=null)
				a[i]=suc.data;
			else
				a[i]=-1;
				
		}
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
	}
	
	
	
	public static Node insert(Node node,int data)
	{
		if(node==null)
		{
			node=new Node(data);
		}
		
	if(data<node.data)
	{
		suc=node;
		node.left=insert(node.left,data);
		
	}
	
	else if(data>node.data)
	{
		node.right=insert(node.right,data);
	}
		return node;
	}
	
	public static void main(String args[])
	{
		
		int a[]={8, 58, 71, 18, 31, 32, 63, 92,43, 3, 91, 93, 25, 80, 28};
		bst(a);
		
	}
	
	
	
	
	
	
    
	

}
	
