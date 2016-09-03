import java.io.*;
public class kabali2 {

	public static void main(String[] args) throws IOException {
		BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
		String str;
		System.out.println("enter the word ");
		str=b.readLine();
		StringBuilder s=new StringBuilder();
		for(int i=0;i<str.length();i++)
		{
			if(i!=str.length())
			{
				char x=str.charAt(i);
				s.append(x);
				System.out.println(s);
			}
			else
			{
				System.out.println(str);
			}
		}
		
		int a=str.length();
		for(int k=1;k<=a;)
		{
			
			
			int i=0;
			while(i<a-1)
			{
			System.out.print(str.charAt(i));
			i++;
			}
			
			a--;
			System.out.println("");
		}
		
	}

}
