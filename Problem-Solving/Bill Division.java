import java.io.*;
import java.util.*;

public class Solution
{
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int k=sc.nextInt();
    int bill[]=new int[n];
    int sum=0;
    for(int i=0;i<n;i++)
    {
        bill[i]=sc.nextInt();
        if(i!=k)
        sum+=bill[i];
    }
    
    int b=sc.nextInt();
    if(sum/2==b)
    {
        System.out.println("Bon Appetit");
    }
    
    else
    {
        System.out.println(b-sum/2);
    }
    }
    
}
