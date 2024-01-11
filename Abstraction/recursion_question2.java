package Abstraction;
import java.util.*;

public class recursion_question2 {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		long t=sc.nextInt();
		while(t-->0)
		{
			long n=sc.nextLong();
			long val=sc.nextLong();
			long arr[]=new long[(int) n];
			for(int i=0;i<arr.length;i++)
			{
				arr[i]=sc.nextInt();

			}

			long ans=0,th=0;
			long h=arr[0];
			for(int i=1;i<arr.length;i++)
			{
				if(arr[i]<h)
				{
					h=arr[i];
				}
			}
			long temp=arr[0];
			long tt=arr[arr.length-1];

		    while(th<=val && arr.length>1){
						arr[0]=h;
						arr[arr.length-1]=h;

				   th=trap(arr);
					   if(h>=temp)
						 {
						  th=th+(h-temp);
						 }
						 if(h>=tt)
						 {
							th+=(h-tt);
						 }
						  if(th<=val)
			        ans=h;
					h++;
			}
			if(arr.length==1)
			{
				System.out.println(arr[0]+val);
			}
			else if(arr.length==1 && val==0)
			{
				System.out.println(1);
			}
		else
			System.out.println(ans);
			
			


		
	}
}
	public static long trap(long[] height) {
        long n = height.length;
        long l = 0;
        long r = n-1;
        long leftMax = 0;
        long rightMax = 0;
        long res = 0;

        while(l < r){
            if(height[(int)l] <= height[(int)r]){

                if(height[(int)l] >= leftMax){
                    leftMax = height[(int)l];
                }else{
                    res += leftMax - height[(int)l];
                }
                l++;
            }else {
                
                if(height[(int)r] >= rightMax){
                    rightMax = height[(int)r];
                }else{
                    res += rightMax - height[(int)r];
                }
                r--;                
            }
        }
        return res;
    }
}
			