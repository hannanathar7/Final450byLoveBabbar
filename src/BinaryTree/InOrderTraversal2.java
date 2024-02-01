package BinaryTree;

import java.util.*;
public class InOrderTraversal2 {

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
	
	
	public static void inOrder(Node node)
	{
		ArrayList<Integer> list=new ArrayList<Integer>();
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
				list.add(node.data);
				node=node.right;
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
 
        inOrder(root);
    }
	
	
	
}
