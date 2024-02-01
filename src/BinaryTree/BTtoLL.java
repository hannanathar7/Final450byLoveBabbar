package BinaryTree;





public class BTtoLL {
	
	public static class Node {
		int data;
		Node left;
		Node right;

		Node(int d) {
			data = d;
			left = null;
			right = null;
		}
	}

		public void flatten(Node root) {
			
			Node curr=root;
			while(curr!=null)
			{
				if(curr.left!=null)
				{
					Node next=curr.left;
					
					while(next.right!=null)
						next=next.right;
					
					next.right=curr.right;
					curr.right=curr.left;
					curr.left=null;
					
				}
				
				curr=curr.right;
			}
        
		}

}
