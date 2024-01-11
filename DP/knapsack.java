//Coding blocks question similar to coin change 2
package DP;
import java.util.*;
public class knapsack {
    public static void main(String[] args) {
        
        int cap=8;
        int weight[]={1,2,3,4};
        int val[]={2,3,5,1};
        int dp[][]=new int[cap+1][weight.length+1];
        for(int []a:dp)
        {
            Arrays.fill(a, -1);
        }

        System.out.println(find(cap, val,weight,0,dp));
        

    }
    public static int find(int val,int arr[],int wt[],int i,int dp[][])
    {
        if(val==0 || i==arr.length)
        return 0;
        int inc=0;
        int exc=0;
        if(val>=wt[i])
        {
            inc=arr[i]+find(val-wt[i], arr, wt, i+1,dp);
        }
        exc=find(val, arr, wt, i+1,dp);
        return dp[val][i]=Math.max(inc, exc);
    }
    
}
