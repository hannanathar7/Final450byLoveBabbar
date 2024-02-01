
package BinarySearchTree;
import java.util.*;




public class TwoSumInBST
{
	
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

	public static class BSTIterator {

		   Stack<Node> st=new Stack<>();
		   boolean f=false;
		   
			    public BSTIterator(Node root,boolean f1) {
			    	
			    	f=f1;
			    	pushAll(root);
			        
			    }
			    
			    public int next() {
			    	
			    	Node d=st.pop();
			    	if(f==true)
			    	pushAll(d.right);
			    	else
			    		pushAll(d.left);
			    	
			    	return d.data;
			        
			    }
			    
			    public boolean hasNext() {
			    	
			    	return st.size()>0;
			        
			    }
			    
			    public void pushAll(Node node)
			    {
			    	while(node!=null)
			    	{
			    		st.push(node);
			    		if(f==true)
			    		node=node.left;
			    		else
			    			node=node.right;
			    	}
			    }
	}

	
	 public boolean findTarget(Node root, int k) {
		 
		 if(root==null)
			 return false;
		 
		 BSTIterator l=new BSTIterator(root,true);
		 BSTIterator r=new BSTIterator(root,false);
		 
		 int i=l.next();
		 int j=r.next();
		 
		 while(i<j)
		 {
			 if(i+j==k)
				 return true;
			 else if(i+j<k)
				 i=l.next();
			 else
				 j=r.next();
		 }
		 
		 return false;
	        
	    }
}
