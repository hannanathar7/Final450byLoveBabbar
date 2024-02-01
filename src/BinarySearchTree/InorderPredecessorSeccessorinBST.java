package BinarySearchTree;

public class InorderPredecessorSeccessorinBST {
	
	static Node pre=null,suc=null;
	
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
	
	
	public void find(Node root,int key)
	{
		findPreSuc(root,key);
		
		System.out.println(pre.data+" "+suc.data);
		
	}
	
	
	
	public static void findPreSuc(Node root, int key)
	{
	  
	   Node curr=root;
	   
	   if(curr==null)
	   return;
	   
	   
	   if(key==curr.data)
	   {
	       findPreSuc(curr.left,key);
	       findPreSuc(curr.right,key);
	   }
	   
	   else if(key>curr.data)
	   {
	       
	       pre=curr;
	       findPreSuc(curr.right,key);
	   }
	   else if(key<curr.data)
	   {
	       suc=curr;
	       findPreSuc(curr.left,key);
	   }
	}
	
	
	
	
	
	

}
