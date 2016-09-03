import java.io.*;
public class kabali {

	public static void main(String[] args) throws IOException {
		BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("no of words ");
		int w=Integer.parseInt(b.readLine());
		System.out.println("enter the words ");
		String[] str1=new String[10];
		for(int i=0;i<w;i++)
		{
		str1[i]=b.readLine();	
		}
		System.out.println("no of lines ");
		int l=Integer.parseInt(b.readLine());
		System.out.println("enter the lines ");
		String[] str2=new String[50];
		StringBuilder s1=new StringBuilder();
		
		for(int i=0;i<l;i++)
		{
		str2[i]=b.readLine();
		s1.append(str2[i]);
		
		if(i!=l-1)
	    s1.append("-");
		
		}
        
		String s2=s1.toString();
		//System.out.println(s2);
		
		String[] s3=s2.split("-");
		//System.out.println("length is"+s3.length);
		
		int count=0;
		for(int i=0;i<w;i++)
		{
			for(int j=0;j<s3.length;j++)
			{
			if((str1[i]).equals(s3[j]))
			{
			count=count+1;	
			}
			}
			System.out.println(str1[i]+" "+count);
			count=0;
		}
			
	}

}
