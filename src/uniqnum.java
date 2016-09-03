import java.util.*;
import java.io.*;

public class uniqnum {

	public static void main(String[] args) throws IOException {
		int n;

		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no of digits ");
		n=sc.nextInt();
		String[] num=new String[n];
		StringBuilder s=new StringBuilder();
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter the numbers ");
		for(int i=0;i<n;i++)
		{
			num[i]=br.readLine();
			s.append(num[i]);
		}
		sc.close();
		String s1=s.toString();
		
		//System.out.println(s);
		//System.out.println(s1);
		
       char z=00;
        for(int i=0;i<n;i++)
        {
        	for(int j=0;j<n;j++)
        	{
        	if(i!=j)
        	{
        		char a=s.charAt(i);
            	char b=s1.charAt(j);
            	
            	if(a==b)
        		s1=s1.replace(b,z);
        	}
        	}
        }
        for(int i=0;i<n;i++)
        {
        	for(int j=0;j<n;j++)
        	{

        		char a=s.charAt(i);
            	char b=s1.charAt(j);
        	
        		if((i==j)&&(a==b))
            	{
        			System.out.println(b);
        	        	
            	}
                
        	}

        }
	}
}
