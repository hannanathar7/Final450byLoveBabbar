package RecursionAndBacktracking;

import java.util.*;

public class PermutationsOfAGivenString {
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String S=sc.next();
		sc.close();
		
		int l=S.length();
        char ch[]=S.toCharArray();
        Set<String> set=new HashSet<>();
        
        permutations(S,l,ch,0,set);
        
        List<String> res=new ArrayList<>(set);
        Collections.sort(res);
        
        System.out.println(res);
	}
	
	 public static void permutations(String S,int l,char ch[],int idx,Set<String> set)
	    {
	      if(idx==l)
	      {
	        String ans=String.valueOf(ch);
	        set.add(ans);
	      
	      }
	      
	      for(int i=idx;i<l;i++)
	      {
	          swap(idx,i,ch);
	          permutations(S,l,ch,idx+1,set);
	          swap(idx,i,ch);
	      }
	    }
	    
	    public static void swap(int i,int j,char a[])
	    {
	        char t=a[i];
	        a[i]=a[j];
	        a[j]=t;

	    }
	
}
