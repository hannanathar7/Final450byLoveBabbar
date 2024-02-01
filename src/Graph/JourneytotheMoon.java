package Graph;

import java.util.*;

public class JourneytotheMoon {
    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int v=sc.nextInt();
        int n=sc.nextInt();
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        
        for(int i=0;i<v;i++)
         {
             adj.add(new ArrayList<Integer>());
         }
        
        for(int i=0;i<n;i++)
        {
            int x=sc.nextInt();
            int y=sc.nextInt();
            
            adj.get(x).add(y);
            adj.get(y).add(x);
        }
        sc.close();
        
        ArrayList<Integer> list=new ArrayList<>();
         boolean vis[]=new boolean[v];
         
        for(int i=0;i<v;i++)
        {
            if(vis[i]==false)
            {
                int c[]=new int[1];
                dfs(i,vis,adj,c);
                list.add(c[0]);
            }
        }
        
        long val=(v*(v-1))/2;
        
        for(int i=0;i<list.size();i++)
        {
            int j=list.get(i);
            int x=((j*(j-1))/2);
            val=val-x;
        }
        
        System.out.println(val);
    }
    
    

     
     
     public static void dfs(int i,boolean vis[],ArrayList<ArrayList<Integer>> adj,int c[])
         {
             
             vis[i]=true;
             c[0]++;
             
             for(int j:adj.get(i))
             {
                 if(vis[j]==false)
                     dfs(j,vis,adj,c);
             }
        }
     
}
    
    

