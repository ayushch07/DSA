import java.util.Arrays;
import java.util.Scanner;

import DP;
public class edit_distance {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        String s2=sc.next();
        int dp[][]=new int[s1.length()][s2.length()];
        for(int a[]:dp)
        {
            Arrays.fill(a, -1);
        }
        int ans=find(s1, s2, 0, 0,dp);
        System.out.println(ans);

    }
    public static int find(String s1,String s2,int i,int j,int dp[][]) {
        if(i==s1.length())
        {
            return s2.length()-j;
        }
        if(j==s2.length())
        {
            return s1.length()-i;
        }
        if(dp[i][j]!=-1)
        return dp[i][j];
        int ans=0;
        if(s1.charAt(i)==s2.charAt(j))
        {
            ans=find(s1, s2, i+1, j+1,dp);
        }
        else
        {
            int insert=find(s1, s2, i, j+1,dp);
            int delete=find(s1, s2, i+1, j,dp);
            int replace=find(s1, s2, i+1, j+1,dp);
            ans=Math.min(insert,Math.min(delete, replace))+1;
        }
        return ans;
        
    }
}
