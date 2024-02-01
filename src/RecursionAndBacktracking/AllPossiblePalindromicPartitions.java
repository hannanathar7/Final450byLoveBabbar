package RecursionAndBacktracking;

import java.util.*;

public class AllPossiblePalindromicPartitions {
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		sc.close();
		 int i=0;
	        List<List<String>> res=new ArrayList<>();
	        List<String> list=new ArrayList<>();

	        palindromePartition(i,s,list,res);
		System.out.println(res);
		
	}
	


    public static void palindromePartition(int idx,String s,List<String> list,List<List<String>> res)
    {
        if(idx==s.length())
        {
            res.add(new ArrayList<>(list));
            return;
        }

        for(int i=idx;i<s.length();i++)
        {
            if(isPalindromePossible(s,idx,i))
            {
            list.add(s.substring(idx,i+1));
            palindromePartition(i+1,s,list,res);
            list.remove(list.size()-1);
            }
        }
    }

    public static boolean isPalindromePossible(String s, int i,int j)
    {
        while(i<j)
        {
            if(s.charAt(i)!=s.charAt(j))
            {
                return false;
            }

            i++;
            j--;
        }

        return true;
    }
	
}
