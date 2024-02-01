package Greedy;

import java.util.*;



public class CoinChange {
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		int V=sc.nextInt();
		sc.close();
		
		
		List<Integer> list=minCoins(V);
		
		
		
		
		
		
		System.out.println(list);
		
		
	}
	
	
	static List<Integer> minCoins(int V)
    {
        int coins[]={ 1, 2, 5, 10, 20, 50, 100, 200, 500, 2000 };
        int n=coins.length;
        List<Integer> ans=new ArrayList<>();
        
        for(int i=n-1;i>=0;i--)
        {
            while(V>=coins[i])
            {
              ans.add(coins[i]);
              V-=coins[i];
            }
            
            
        }
        return ans;
    }
	

}

