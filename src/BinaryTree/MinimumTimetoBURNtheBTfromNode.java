package BinaryTree;

import java.util.*;

public class MinimumTimetoBURNtheBTfromNode {

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
	
	
	
	
	public int minTime(Node root, int start) {
		
	
		if(root==null)
			return -1;
		
		HashMap<Node,Node> par=new HashMap<>();
		
		Node target=makeParent(root,par,start);
		
		if(target==null)
			return -1;
		
		
		HashMap<Node,Boolean> vis=new HashMap<>();
		Queue<Node> q=new ArrayDeque<>();
		q.add(target);
		vis.put(target,true);
		int t=0;
		
		
		while(q.size()>0)
		{
			int size=q.size();
			int flag=0;
			
			
			for(int i=0;i<size;i++)
			{
				Node curr=q.remove();
				
				if(curr.left!=null && vis.get(curr.left)==null)
				{
					vis.put(curr.left,true);
					q.add(curr.left);
					flag=1;
					
				}
				
				if(curr.right!=null && vis.get(curr.right)==null)
				{
					vis.put(curr.right,true);
					q.add(curr.right);
					flag=1;
					
				}
				
				if(par.get(curr)!=null && vis.get(par.get(curr))==null)
				{
					vis.put(par.get(curr),true);
					q.add(par.get(curr));
					flag=1;
					
				}
				
			}
			if(flag==1)
				t++;
		}
		
		
		
		return t;
        
    }
	
	public Node makeParent(Node root,HashMap<Node,Node> par,int start)
	{
		Queue<Node> q=new ArrayDeque<>();
		Node res=null;
		
		q.add(root);
		
		while(q.size()>0)
		{
			Node curr=q.remove();
			if(curr.data==start)
				res=curr;
			
			if(curr.left!=null)
			{
				par.put(curr.left,curr);
				q.add(curr.left);
			}
			
			if(curr.right!=null)
			{
				par.put(curr.right,curr);
				q.add(curr.right);
			}
			
		}
		
		return res;
	}
	
	
	
	
}
