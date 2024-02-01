package String;

import java.util.*;

public class RabinKarpAlgo {
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		sc.close();
		
		
		ArrayList<Integer> res=search(s2,s1);
		System.out.println(res);
		
			
			
	}
		
		
		


	
	static ArrayList<Integer> search(String pat, String s)
    {
        
        ArrayList<Integer> res=new ArrayList<>();
        
        if(pat.length()>s.length() || pat.length()==0)
        return res;
        
        int prime=101;
        int characters=256;
        int patHash=calculateHashcode(pat,characters,prime);
        int sHash=calculateHashcode(s.substring(0,pat.length()),characters,prime);
        
        for(int i=0;i<=s.length()-pat.length();i++)
        {
            if(patHash==sHash)
            {
                int flag=1;
                for(int j=0;j<pat.length();j++)
                {
                    if(pat.charAt(j)!=s.charAt(i+j))
                    {
                        flag=0;
                        break;
                    }
                }
                if(flag==1)
                res.add(i+1);
            }
            
            if(i<s.length()-pat.length())
            {
                sHash=(sHash-(s.charAt(i)*(int)Math.pow(characters,pat.length()-1))%prime)%prime;
                sHash=(sHash*characters)%prime;
                sHash=(sHash+(s.charAt(i+pat.length()))%prime)%prime;
            }
           
            
        }
        if(res.size()==0)
            res.add(-1);
        return res;
        
    }
    
    public static int calculateHashcode(String s,int c,int p)
    {
        int k=s.length()-1;
        int ans=0;
        
        for(int i=0;i<s.length();i++)
        {
            ans=(ans+(s.charAt(i)*(int)Math.pow(c,k))%p)%p;
            k--;
        }
        return ans;
    }

}
