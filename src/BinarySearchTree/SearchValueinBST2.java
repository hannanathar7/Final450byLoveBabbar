package BinarySearchTree;

public class SearchValueinBST2 {
	
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
	
	
	public Node searchBST(Node root, int val) {

        if(root==null)
        return null;

        Node curr=root;

        while(curr!=null)
        {
            if(curr.data==val)
            return curr;

            else if(curr.data<val)
            curr=curr.right;

            else
            curr=curr.left;
        }

        return null;
        
    }
	

}
