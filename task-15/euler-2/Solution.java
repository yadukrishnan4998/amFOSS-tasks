package amfoss_java;

import java.util.*;
class Solution
{
	public static void main(String args [])
	{
		Scanner sc = new Scanner (System.in);
		int n=sc.nextInt();
		int a[]= new int[n];
		int sum=0;
		int b[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int j=1;
		int k=0;
		int l=0;
		for(int i=0;i<n;i++)
		{
		    while(j<a[i])
		    {
		    	l=j;
				if(j%2==0)
					sum=sum+j;
				j=j+k;
				k=l;
		    }
			b[i]=sum;
			sum=0;
			j=1;
			k=1;
		}
		for(int i=0;i<n;i++)
		{
			System.out.println(b[i]);
		}
		
	}
}
