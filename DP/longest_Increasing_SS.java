class Solution {
    public int lengthOfLIS(int[] nums) {
        return find(nums);
    }
    public static int find(int arr[])
    {
        int dp[]=new int[arr.length+1];
        Arrays.fill(dp,1);
        for(int i=1;i<arr.length;i++)
        {
            for(int j=0;j<i;j++)
                  {
                      if(arr[j]<arr[i])
                      {
                          dp[i]=Math.max(dp[i],dp[j]+1);
                      }
                  }
        }
        Arrays.sort(dp);
        return dp[dp.length-1];
    }
}
//distint subsequence is similar to coin change 2
public static int distintss(String s,String t,int i,int j,int dp[][])
    {
        if(i==t.length())
        {
            return 1;
        }
        if(j==s.length())
        return 0;
        if(dp[i][j]!=-1)
        return dp[i][j];
         int inc=0;
         int exc=0;
         if(s.charAt(j)==t.charAt(i))
         {
             inc=distintss(s,t,i+1,j+1,dp);
         }
         exc=distintss(s,t,i,j+1,dp);
         return dp[i][j]=inc+exc;

    }
