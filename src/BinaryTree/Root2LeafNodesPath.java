package BinaryTree;

import java.util.ArrayList;

public class Root2LeafNodesPath {

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
	
	
	public ArrayList<ArrayList<Integer>> Paths(Node root){
        ArrayList<ArrayList<Integer>> res=new ArrayList<>();
        
        if(root==null)
        return res;
        
        solve(root,res,new ArrayList<>());
        
        
        return res;
        
    }
    
    public void solve(Node node,ArrayList<ArrayList<Integer>> res,ArrayList<Integer> list)
    {
        if(node==null)
        return;
        
        list.add(node.data);
        
        if(node.left==null && node.right==null)
       {
           res.add(new ArrayList<>(list));
       }
        
        solve(node.left,res,list);
        solve(node.right,res,list);
       
        list.remove(list.size()-1);
        
    }
	
	
	
	
	
	
	
}
