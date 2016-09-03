import java.io.*;
import java.util.*;
public class mindistanc {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb=new StringBuilder();
		String str;
		System.out.println("enter the array of numbers ");
		do
		{
			str=br.readLine();
			sb.append(str);
		}while(str=="\n");
		
		System.out.println("two numbers to find MinDistance ");
		StringBuilder sb1=new StringBuilder();
		String str1;
		do
		{
			str1=br.readLine();
			sb1.append(str1);
		}while(str1=="\n");
		
		char ch1=sb1.charAt(0);
		char ch2=sb1.charAt(2);
		char q=44;
		int c=0;
		TreeSet<Integer> tr=new TreeSet<Integer>();
		
		for(int i=0;i<sb.length();i++)
		{
			char z=sb.charAt(i);
			if(z!=q)
			{
				if(z==ch1)
				{
					int count=0;
					int j=i;
				    while(j<sb.length())
					{
				    	char x=sb.charAt(j);
						j++;
						if(x!=q)
						{
							c=count++;
							
							if(x==ch2)
							{
								tr.add(c);
							}
						}
					}		 
				}
			}	
		}
		StringBuilder sb2=new StringBuilder();
		Iterator<Integer> it=tr.iterator();
		while(it.hasNext())
		{
			int value=(int)it.next();
			sb2.append(value);
		}
		System.out.println("Shortest distance is "+sb2.charAt(0));
		
	}

}
