package String;

import java.util.*;

public class MinimumNumberofBracketReversalstoMakeExpressionBalanced {
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		sc.close();
		
		int l=s.length();
		int left=0,right=0,ans;
		
		if(l%2==1)
		{
			ans=-1;
		}

		else
		{
		
		for(int i=0;i<l;i++)
		{
			if(s.charAt(i)=='{')
				left++;
			else
			{
				if(left!=0)
					left--;
				else
					right++;
			}
		}
		
		ans=(int)(Math.ceil(left/2.0)+Math.ceil(right/2.0));
		}
		
		System.out.println(ans);
		
	}
	
	

}
