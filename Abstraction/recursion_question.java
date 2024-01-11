package Abstraction;

import java.util.ArrayList;
import java.util.List;

public class recursion_question{
	
	public static void main(String[] args)
	{
		int n=5;//row
		int m=5;//col
        int arr[][]={{1,2,1,1,1},{1,2,1,2,1},{1,2,1,2,1},{1,2,1,2,1},{1,1,1,2,1}};
        List<Integer> li=new ArrayList<>();
        List<List<Integer>> l=new ArrayList<>();
	prntans(n,m,0,0,arr,li,l);
    System.out.println(l);
    int d=Integer.MAX_VALUE;
    int diff=Integer.MIN_VALUE;
    int ans=-1;
    for(int i=0;i<l.size();i++)
    {
        List<Integer> temp=l.get(i);
        diff=Integer.MIN_VALUE;
        for(int j=0;j<temp.size()-1;j++)
        {
               int minus=Math.abs(temp.get(j)-temp.get(j+1));
               diff=Math.max(minus,diff);
        }
         if(diff<d)
         {
            d=diff;
         }
    }
    System.out.println(d);
	
	}
	public static void prntans(int n,int m,int cc,int cr,int a[][],List<Integer> li,List<List<Integer>> l)
{
		//int c,d;
		if(cc==m-1 && cr==n-1)
		{
            li.add(a[cr][cc]);
			l.add(new ArrayList<>(li));
              li.remove(li.size()-1);
            return;
		}
        if(cr<0 || cc<0 || cc>=m  || cr>=n || a[cr][cc]==-2)
       {
        return;}
        int temp=a[cr][cc];
        li.add(temp);
        a[cr][cc]=-2;
         prntans(n, m, cc+1, cr, a, li, l);
         prntans(n, m, cc, cr+1, a, li, l);
         prntans(n, m, cc-1, cr, a, li, l);
         prntans(n, m, cc, cr-1, a, li, l);
         a[cr][cc]=temp;
        li.remove(li.size()-1);

}
	

}
