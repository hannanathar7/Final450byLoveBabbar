package BinarySearchTree;


public class KthSmallestElementinBST {
	
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
	
	
	public int kthSmallest(Node root, int k) {
        
        if(root==null)
        return -1;

        int key[]={k};
        int c[]=new int[1];
        int ans[]=find(root,key,c); // use morris traversal to do in O(1) space
        return ans[0];

        
    }

    public int[] find(Node root,int k[],int c[])
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
	    
	    
	
	
	
	
	
	
	

}
