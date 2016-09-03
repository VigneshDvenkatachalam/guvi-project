import java.io.*;
public class combinations {

	public static void main(String[] args) throws Exception {
		
		  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		  StringBuilder sb=new StringBuilder();
		  int x=97;
		  String s1;
		  sb.append(0);
		  for(int i=0;i<26;i++)
		  {
			  sb.append((char) x);
			  x++;
		  }
		  System.out.println("translation num. ");
		  s1=br.readLine();
		  
		  for(int i=0;i<s1.length();i++)
		  {
			  StringBuilder sb1=new StringBuilder();
			  sb1.append(s1.charAt(i));
			  for(int j=0;j<s1.length();j++)
			  {
				 StringBuilder sb2=new StringBuilder();
				 sb2.append(sb1+""+s1.charAt(j));
				 String s2=sb2.toString();
				 //System.out.println(s2);
				 int y=Integer.valueOf(s2);
				 if(y<=26)
				 {
					System.out.print(sb.charAt(y)); 
				 }  
			  }
			  System.out.println("");
			  
			
		  }
		}

}
