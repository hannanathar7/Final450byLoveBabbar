package BinaryTree;


public class ConvertBinaryTreetoDLL {

	public static class Node
	{
		int data;
		Node left;
		Node right;
		
		Node(int d)
		{
			data=d;
			left=null;
			right=null;
		}
	}
	
	
	static Node head=null;
	static Node prev=null;
    public static Node bToDLL(Node node)
    {
      
    
      if(node==null)
      return null;
      
      bToDLL(node.left);
      
      if(head==null)
      head=node;
      else
      {
          prev.right=node;
          node.left=prev;
      }
      prev=node;
      
      bToDLL(node.right);
      
      return head;
    }
	
	public static void main(String[] args)
    {
       
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        
 
        bToDLL(root);
    }
	
	
	
	
	
}
