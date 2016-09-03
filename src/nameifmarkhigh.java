import java.io.*;
import java.util.*;
public class nameifmarkhigh {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		ArrayList<String> arr=new ArrayList<String>();
		String s;
		do
		{
			s=br.readLine();
			arr.add(s);
		}
		while(s=="\n");
		
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<arr.size();i++)
		{
			String s2=arr.toString();
			for(int j=0;j<s2.length();j++)
			{
				char x=s2.charAt(j);
				
			if((x==34)||(x==123)||(x==125)||(x==91)||(x==93))
			System.out.print("");	
			else
			sb.append(x);
			}
		}
		
		String[] name=new String[50];
		int total[]=new int[50];
		String[] s1=sb.toString().split(",");
		for(int i=0;i<s1.length;i++)
		{
			String[] str1=s1[i].split("#");
			
			name[i]=str1[0];
			int m1=Integer.valueOf(str1[1]);
			int m2=Integer.valueOf(str1[2]);
			int m3=Integer.valueOf(str1[3]);
			total[i]=m1+m2+m3;
			
		}
		
		int largest=total[0];
		int c=0;
		for(int i=1;i<total.length;i++)
		{
			if(total[i]>largest)
			{
				largest=total[i];
			    c++;
			}
		}
		System.out.println(name[c]);
	
		
	}

}
