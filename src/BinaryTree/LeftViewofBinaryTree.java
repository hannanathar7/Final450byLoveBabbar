package BinaryTree;

import java.util.ArrayList;

public class LeftViewofBinaryTree {

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
	
	
	public static ArrayList<Integer> leftView(Node node)
	{
		
		ArrayList<Integer> list=new ArrayList<>();
		view(node,0,list);
		return list;
	
	}
	
	public static void view(Node node,int level,ArrayList<Integer> list)
	{
		
		if(node==null)
			return;
		
		if(level==list.size())
			list.add(node.data);
		
		view(node.left,level+1,list);
		view(node.right,level+1,list);
		
	
	}
	
	
	
	
	
}
