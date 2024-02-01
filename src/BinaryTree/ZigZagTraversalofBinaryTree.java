package BinaryTree;


import java.util.*;



public class ZigZagTraversalofBinaryTree {

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
	
	
	public static void zigZag(Node root)
	{
		
		  List<List<Integer>> res=new ArrayList<>();

	        Queue<Node> q=new LinkedList<>();

	        if(root==null)
	        {
	        	System.out.println(res); 
	        	return;
	        }
	       
	        boolean flag=true;
	        q.add(root);
	        while(q.size()>0)
	        {
	            int size=q.size();
	             List<Integer> list1=new ArrayList<>();
	            for(int i=1;i<=size;i++)
	            {
	               
	                Node node=q.remove();

	                if(flag==true)
	                list1.add(node.data);

	                else
	                list1.add(0,node.data);

	                if(node.left!=null)
	                q.add(node.left);
	                
	                if(node.right!=null)
	                q.add(node.right);
	            }
	            res.add(new ArrayList<>(list1));
	            flag=!flag;
	            }
		
		System.out.println(res);
	
	}
	
	public static void main(String[] args)
    {
       
        Node root = new Node(3);
        root.left = new Node(2);
        root.right = new Node(1);
        zigZag(root);
    }
	

	
	
	
	
	
	
}
