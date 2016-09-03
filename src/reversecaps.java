import java.io.*;
public class reversecaps {

	public static void main(String[] args) throws IOException {
		String str1;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		str1=br.readLine();
		
		String[] s1=str1.split(" ");
		for(int j=0;j<s1.length;j++)
		{
		String s2=new StringBuffer(s1[j]).reverse().toString();
		
		for(int i=0;i<s1[j].length();i++)
		{
		 if((s1[j].charAt(i)>=65)&&(s1[j].charAt(i)<=90))
		 {
		   char z=s2.charAt(i);
		   String s=String.valueOf(z).toUpperCase();
		   System.out.print(s);
		 }
		 else
		 {
			 char z=s2.charAt(i);
			  String s=String.valueOf(z).toLowerCase();
			  System.out.print(s);
		 }
			 
		}
		System.out.print(" ");
		    
	   }

    }
}