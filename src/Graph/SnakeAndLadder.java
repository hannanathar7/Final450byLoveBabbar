package Graph;

import java.util.*;

public class SnakeAndLadder {
	
	

 public int snakesAndLadders(int[][] board) {
		 
		 int moves=0;
		 int n=board.length;
		 boolean vis[][]=new boolean[n][n];
		 Queue<Integer> q=new LinkedList<>();
		 
		 
		 q.add(1);
		 vis[n-1][0]=true;
		 
		 while(q.size()>0)
		 {
			 int size=q.size();
			 for(int i=1;i<=size;i++)
			 {
				 int curr=q.remove();
				 if(curr==n*n)
					 return moves;
				 
				 for(int j=1;j<=6;j++)
				 {
					 if(curr+j>n*n)
						 break;
					 
					 int curr1=curr+j;
					 
					 int r=n-((curr1-1)/n)-1;
					 int c=(curr1-1)%n;
					 if(n%2==r%2)
						 c=n-1-c;
					 
					 if(vis[r][c]==true)
					 continue;
					 
					 vis[r][c]=true;
					 if(board[r][c]==-1)
						 q.add(curr+j);
					 else
						 q.add(board[r][c]);
						 
				 }
			 }
			 moves++;
		 }
		 return -1;
	        
	    }		 
		 
	        
	    }
	
	

