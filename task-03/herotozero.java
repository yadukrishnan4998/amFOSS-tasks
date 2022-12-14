package amfoss_java;
import java.util.*;
class herotozero
{
    public static void main(String args[]) 
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the number of cities");
        int n=sc.nextInt();
        int a[]=new int[n];
        int ans[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            int b[]=new int[a[i]];
            for(int j=0;j<a[i];j++)
            {
                b[j]=sc.nextInt();
                int min=b[0];
                if(b[i]<min)
                {
                	min=b[i];
                }
                
            }
            int c=0;
            for(int m=b.length;m<c;m++)
            {
            	for(int k=0;k<b.length;k++)
                {
                	if(b[k]<b[k+1])
                	{
                		b[k+1]=b[k];
                		c++;
                	}
                	else if(b[k]==b[k+1])
                	{
                		b[k]=0;
                		b[k+1]=0;
                		c++;            		
                	}
                }
            	for(int x=0;x<b.length;x++)
            	{
            		if(m+1==b.length)
                	{
            			ans[x]=c-1;
                	}
            	}
            	
            }
        }
        for(int i=0;i<n;i++)
        {
        	System.out.print(ans[i]);
        }
    }
}
