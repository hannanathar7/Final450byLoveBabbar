package BinaryTree;
import java.util.*;

public class SerializeAndDeserializeBT {

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
	
	
	 
    public String serialize(Node root) {
    	
    	
    	if(root==null)
    		return "";
    	
    	Queue<Node> q=new LinkedList<>();
    	StringBuilder sb=new StringBuilder();
    	
    
    	q.add(root);
    	
    	while(q.size()>0)
    	{
    		int size=q.size();
    		for(int i=1;i<=size;i++)
    		{
    			
    		Node curr=q.remove();
    		
    		if(curr==null)
    		{
    			sb.append("n ");
    			continue;
    		}
    		
    		sb.append(curr.data+" ");
    		
    		q.add(curr.left);
    		q.add(curr.right);
    		}
    	}
    	
    	
    	return sb.toString();
        
    }

    
    public Node deserialize(String data) {
        
    	if(data=="")
    		return null;
    	
    	Queue<Node> q=new LinkedList<>();
    	String s[]=data.split(" ");
    	Node root=new Node(Integer.parseInt(s[0]));
    	q.add(root);
    	for(int i=1;i<s.length;i++)
    	{
    		Node par=q.remove();
    		if(!s[i].equals("n"))
    		{
    			Node left=new Node(Integer.parseInt(s[i]));
    			par.left=left;
    			q.add(left);
  
    		}

    		i++; 
    		
    		if(!s[i].equals("n"))
    		{
    			Node right=new Node(Integer.parseInt(s[i]));
    			par.right=right;
    			q.add(right);

    		}
    		
    	}
    	return root;
    	
    	
    }
	
}
