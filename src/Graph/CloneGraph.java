package Graph;

import java.util.*;



class Node {
    public int val;
    public List<Node> neighbors;
    
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    
}

public class CloneGraph {
	
	
	 public Node cloneGraph(Node node) {

	        if(node==null)
	        return node;

	        Node vis[]=new Node[101];

	        Node curr=new Node(node.val);

	        dfs(node,curr,vis);

	        return curr;
	        
	    }

	    public void dfs(Node node,Node curr, Node vis[])
	    {
	            vis[curr.val]=curr;

	            for(Node n:node.neighbors)
	            {
	                if(vis[n.val]==null)
	                {
	                    Node newNode=new Node(n.val);
	                    curr.neighbors.add(newNode);
	                    dfs(n,newNode,vis); 
	                }
	                else
	                {
	                    curr.neighbors.add(vis[n.val]); 
	                }
	            }
	    }

	 
	
}
	
	

