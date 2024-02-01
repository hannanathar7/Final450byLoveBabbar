package BinarySearchTree;
import java.util.*;

public class KthLargestElementinBST {
	
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
	
	
	 public int kthLargest(Node root,int k) {
	        
	        if(root==null)
	        return -1;

	        int key[]=new int[1];
	        int c[]=new int[1];
	        int l=length(root);
	        key[0]=(l-k+1);
	        int ans[]=find(root,key,c);
	        return ans[0];

	        
	    }
	    
	    public int length(Node root)
	    {
	        Node curr=root;
	       int l=0;

	        while(curr!=null)
	        {
	           if(curr.left==null)
	           {
	               l++;
	               curr=curr.right;
	           }
	           else
	            {
	                Node next=curr.left;
	                while(next.right !=null && next.right!=curr)
	                next=next.right;

	                if(next.right==null)
	                {
	                    next.right=curr;
	                    curr=curr.left;
	                }
	                else
	                {
	                    l++;
	                    next.right=null;
	                    curr=curr.right;
	                }
	            }
	        }
	        return l;
	    }

	    public int[] find(Node root,int k[],int c[]) // morris traversal to do in O(1) space
	    {
	        Node curr=root;
	        int ans[]=new int[1];

	        while(curr!=null)
	        {
	           if(curr.left==null)
	           {
	               c[0]++;
	               if(c[0]==k[0])
	               {
	                   ans[0]=curr.data;
	                   break;
	               }
	                
	               curr=curr.right;
	           }
	           else
	            {
	                Node next=curr.left;
	                while(next.right !=null && next.right!=curr)
	                next=next.right;

	                if(next.right==null)
	                {
	                    next.right=curr;
	                    curr=curr.left;
	                }
	                else
	                {
	                    c[0]++;
	               if(c[0]==k[0])
	               {
	                   ans[0]=curr.data;
	                   break;
	               }
	                    next.right=null;
	                    curr=curr.right;
	                }
	            }
	        }
	        return ans;
	    }
	    
	    public void inOrder(Node root,int k[],int res[],int c[])//recursive method
	    {
	        if(root==null)
	        return;
	        
	        inOrder(root.right,k,res,c);
	        c[0]=c[0]+1;
	        if(c[0]==k[0])
	        {
	        res[0]=root.data;
	        return;
	        }
	        inOrder(root.left,k,res,c);
	    }
	
	
	 public int kthLargest2(Node root,int k) // other iterative method
	    {
	       Stack<Node> s=new Stack<Node>();
	       int res=-1;
	       int c=0;
	       
	       while(true)
	       {
	    	   if(root!=null)
	    	   {
	    		   s.push(root);
	    		   root=root.right;
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
	    		   root=root.left;
	    	   }
	       }
	       return res;
	    }
	
	
	
	
	
	
	

}
