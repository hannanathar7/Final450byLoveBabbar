package BinarySearchTree;
import java.util.*;




public class FindMedianofBSTinNTimeAnd1Space {
	
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
	
	public static int median(Node root)
	{
		int res=-1;
		int n=inOrder(root);
		if(n%2==0)
		{
			int k1=findmedian(root,n/2);
			int k2=findmedian(root,(n/2)+1);
			res=(k1+k2)/2;
		}
		else
		{
			int k1=findmedian(root,(n/2)+1);
			res=k1;
		}
		
		return res;
		
			
	}
	
	public static int inOrder(Node node)
	{
		int n=0;
		Stack<Node> s=new Stack<>();
		while(true)
		{
			if(node!=null)
			{
			s.push(node);
			node=node.left;
			}
			
			else
			{
				if(s.isEmpty())
					break;
				
				node=s.pop();
				n++;
				node=node.right;
			}
		}
		return n;
		
	}
	
	
	 public static  int findmedian(Node root,int k)
	    {
	       Stack<Node> s=new Stack<Node>();
	       int res=-1;
	       int c=0;
	       
	       while(true)
	       {
	    	   if(root!=null)
	    	   {
	    		   s.push(root);
	    		   root=root.left;
	    	   }
	    	   else
	    	   {
	    		   if(s.size()==0)
	    			   break;
	    		   
	    		   root=s.pop();
	    		   c++;
	    		   if(c==k)
	    		   {
	    			   res=root.data;
	    			   break;
	    		   }
	    		   root=root.right;
	    	   }
	       }
	       return res;
	    }
	 
	 public static void main(String[] args)
	    {
		
		 
	        Node root = new Node(6);
	        root.left = new Node(3);
	        root.right = new Node(8);
	        root.left.left = new Node(1);
	        root.left.right=new Node(4);
	        root.right.left=new Node(7);
	        
	 
	       System.out.println(median(root));
	    }
	
	
	
	
	
	
	

}
