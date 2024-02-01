
package BinarySearchTree;
import java.util.*;



class Node
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

public class BSTIterator {

	   Stack<Node> st=new Stack<>();

		    public BSTIterator(Node root) {
		    	
		    	pushAll(root);
		        
		    }
		    
		    public int next() {
		    	
		    	Node d=st.pop();
		    	pushAll(d.right);
		    	
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
		    		node=node.left;
		    	}
		    }
}
