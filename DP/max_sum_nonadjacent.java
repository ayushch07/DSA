package DP;

import java.util.ArrayList;

public class max_sum_nonadjacent {
    
    public static void main(String[] args) {
        
    }
    public static int find(ArrayList<Integer> nums,int n,int dp[])
	{
			if(n<0)
			return 0;
			if(n==0)
			return nums.get(0);
			if(dp[n]!=0)
			return dp[n];
			int pick=nums.get(n)+find(nums, n-2, dp);
			int npick=0+find(nums,n-1,dp);
			return dp[n]=Math.max(pick,npick);
		//House robber2 me first or last adjacent hai to pehle arr me first ko chod ke saare call karo or phir dusre me last ko chod ke saare call karo or  dono ka max nikal lo.
	}
}
