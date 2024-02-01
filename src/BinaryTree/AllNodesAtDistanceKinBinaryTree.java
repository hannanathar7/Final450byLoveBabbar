package BinaryTree;

import java.util.*;

public class AllNodesAtDistanceKinBinaryTree {

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
	
	public List<Integer> distanceK(Node root, Node target, int k) {
		
		List<Integer> list=new ArrayList<>();
		HashMap<Node,Node> par=new HashMap<>();
		
		if(root==null || target==null || k<0)
			return list;
		
		if(k==0)
		{
			list.add(target.data);
			return list;
		}
		
		makeParent(root,par);
		HashMap<Node,Boolean> vis=new HashMap<>();
		Queue<Node> q=new ArrayDeque<>();
		q.add(target);
		vis.put(target,true);
		int dis=0;
		
		
		while(q.size()>0)
		{
			int size=q.size();
			if(dis==k)
				break;
			dis++;
			
			
			for(int i=0;i<size;i++)
			{
				Node curr=q.remove();
				
				if(curr.left!=null && vis.get(curr.left)==null)
				{
					vis.put(curr.left,true);
					q.add(curr.left);
					
				}
				
				if(curr.right!=null && vis.get(curr.right)==null)
				{
					vis.put(curr.right,true);
					q.add(curr.right);
					
				}
				
				if(par.get(curr)!=null && vis.get(par.get(curr))==null)
				{
					vis.put(par.get(curr),true);
					q.add(par.get(curr));
					
				}
			}	
		}
		
		while(q.size()>0)
		{
			list.add(q.remove().data);
		}
		
		return list;
        
    }
	
	public void makeParent(Node root,HashMap<Node,Node> par)
	{
		Queue<Node> q=new ArrayDeque<>();
		q.add(root);
		while(q.size()>0)
		{
			Node curr=q.remove();
			
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
	}
	
	
	
	
}
