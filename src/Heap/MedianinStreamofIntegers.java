package Heap;

import java.util.*;

public class MedianinStreamofIntegers {
	
	
	PriorityQueue<Integer> left;
    PriorityQueue<Integer> right;

    public MedianinStreamofIntegers() {
        left=new PriorityQueue<>(Collections.reverseOrder());
        right=new PriorityQueue<>(); 
    }
    
    public void addNum(int num) {

      

        if(right.size()>0 && num>right.peek())
        right.add(num);

        else
        left.add(num);

        if(left.size()-right.size()>=2)
        right.add(left.remove());

         if(right.size()-left.size()>=2)
        left.add(right.remove());
    }
    
    public double findMedian() {

        if(left.size()>right.size())
        return left.peek();

        else if (right.size()>left.size())
        return right.peek();

        else
        return ((left.peek()+right.peek())/2.0);
        
    }
		
		
		
	
	
	
}
