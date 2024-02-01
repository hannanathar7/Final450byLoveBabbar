package String;

import java.util.*;

public class RomantoDecimal {
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		sc.close();
		
		
		
		System.out.println(romanToDecimal(s));
		
	}
	
	 public static int romanToDecimal(String s) {
	        
	        int sum=0;
	        int l=s.length();
	        for(int i=0;i<l;i++)
	        {
	            char ch=s.charAt(i);
	            int v1=value(ch);
	            
	            if(i<l-1)
	            {
	                int v2=value(s.charAt(i+1));
	                if(v2>v1)
	                {
	                    sum+=v2-v1;
	                    i++;
	                }
	                else
	                {
	                    sum+=v1;
	                }
	            }
	            else
	            {
	                sum+=v1;
	            }
	        }
	        
	        return sum;
	    }
	    
	    public static int value(Character ch)
	    {
	        if(ch=='I')
	        return 1;
	        
	        if(ch=='V')
	        return 5;
	        
	        if(ch=='X')
	        return 10;
	        
	        if(ch=='L')
	        return 50;
	        
	        if(ch=='C')
	        return 100;
	        
	        if(ch=='D')
	        return 500;
	        
	        
	        return 1000;        
	        
	    }
	
	
	
	

}
