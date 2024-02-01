package BinaryTree;

import java.util.*;




public class PostOrderTraversal2 {

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
	
	
	public static void postOrder(Node node)
	{
		ArrayList<Integer> list=new ArrayList<Integer>();
		Stack<Node> s=new Stack<>();
		
		if(node==null)
			return;
		
		Node curr=node;
		while(s.size()>0 || curr!=null )
		{
			if(curr!=null)
			{
				s.push(curr);
				curr=curr.left;
			}
			else
			{
			Node temp=s.peek().right;
			
			if(temp==null)
			{
				temp=s.pop();
				list.add(temp.data);
				
				while(s.size()>0 && temp==s.peek().right)
				{
					temp=s.pop();
					list.add(temp.data);
				}
			}
			else
				curr=temp;
			
		}
		}
		
		
		System.out.println(list);
	}
	
	
	
	
	public static void main(String[] args)
    {
       
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.right.left = new Node(5);
        root.right.right = new Node(6);
        root.right.left.left = new Node(7);
        root.right.left.right = new Node(8);
 
        postOrder(root);
    }
	
	
}
