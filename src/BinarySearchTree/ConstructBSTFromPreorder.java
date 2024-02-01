package BinarySearchTree;



public class ConstructBSTFromPreorder {
	
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
	
	
	public Node bst(int a[])
	{
		int i[]=new int[1],max=Integer.MAX_VALUE;
		
		Node root=construct(a,i,max);
		return root;
	}
	
	public Node construct(int a[],int i[],int max)
	{
		if(i[0]==a.length || a[i[0]]>max)
			return null;
		
		Node root=new Node(a[i[0]]);
		i[0]++;
		root.left=construct(a,i,root.data);
		root.right=construct(a,i,max);
		
		return root;
	}
	
	
	
	
	
	
    
	

}
	
