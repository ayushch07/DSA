package DP;

import java.sql.Array;
import java.util.Arrays;

//max profint find karna hai wine ka or har year me wine se into ho jaega
public class wine_problem {
    public static void main(String[] args) {
        int wine[]={2,3,5,1,4};
         int dp[][]=new int[wine.length][wine.length];
         for(int a[]:dp)
         {
            Arrays.fill(a, -1);
         }
        System.out.println(maxprofit(wine, 0,wine.length-1,1,dp));
    }
    public static int maxprofit(int arr[],int i,int j,int year,int dp[][])
    {
         if(i>j)
         {
            return 0;
         }
         if(dp[i][j]!=-1)
         {
            return dp[i][j];
         }
          int a=arr[i]*year+maxprofit(arr, i+1, j,year+1,dp);
          int b=arr[j]*year+maxprofit(arr, i, j-1,year+1,dp);
          return dp[i][j]=Math.max(a, b);
    }
}
