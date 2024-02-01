package BinaryTree;

import java.util.*;



public class PrintAllKSumPathsinBinaryTree {

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
	
	 static void check(Node node,int k)
	{
		ArrayList<Integer> list=new ArrayList<Integer>();
		solve(node,list,k);
		
	}
	
	static void solve(Node node,ArrayList<Integer> list,int k)
	{
		
		if(node==null)
		{
			
			return ;
		}
		
		list.add(node.data);
		solve(node.left,list,k);
		solve(node.right,list,k);
		
		int f=0;
		for(int i=list.size()-1;i>=0;i--)
		{
			f+=list.get(i);
			if(f==k)
			{
				for(int j=i;j<list.size();j++)
					System.out.print(list.get(j)+" ");
				System.out.println();
			}
			
		}
		
	
		list.remove(list.size()-1);
	
	}
	
	public static void main(String[] args)
    {
       
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        
 
        check(root,3);
    }
	
	
}
