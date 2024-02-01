package StackAndQueue;

import java.util.*;

class LRUCache {

	  
    HashMap<Integer,Node> map=new HashMap<>();
    int capacity;
    Node head=new Node(0,0);
    Node tail=new Node(0,0); 
    

    public LRUCache(int cap) {
        capacity=cap;
        head.next=tail;
        tail.prev=head;
    }
    
    public int get(int key) {

        if(!map.containsKey(key))
        return -1;
        else
        {
            Node node=map.get(key);
            remove(node);
            insert(node);
            return node.value;
        }
        
    }
    
    public void put(int key, int value) {

        if(map.containsKey(key))
        {
            Node node=map.get(key);
            remove(node);     
        } 
       if(map.size()==capacity)
        {
            remove(tail.prev); 
        }
        insert(new Node(key,value));
    }


    public void insert(Node node)
    {
        Node headNext=head.next;
        head.next=node;
        node.prev=head;
        node.next=headNext;
        headNext.prev=node;
        map.put(node.key,node);

    }

    public void remove(Node node)
    {
            map.remove(node.key);

             node.prev.next=node.next;
             node.next.prev=node.prev;
              node.next=null;
			 node.prev=null;

    }

    class Node
    {
        int key;
        int value;
        Node next;
        Node prev;

        Node(int k,int v)
        {
            key=k;
            value=v;
            prev=null;
            next=null;
        }
    }






/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
		 
	
	
	
	public static void main(String args[])
	{
		
	}
		
		
		
		
		
	
}
