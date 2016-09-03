import java.io.*;
public class trim {
	
	public static void main(String[] args) throws IOException {
		
		String str;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter the sentence ");
		str=br.readLine();
		char z=32;
		char x,y=0;
		
		for(int i=0;i<str.length();i++)
		{
			x=str.charAt(i);
			if(i!=str.length()-1)
			y=str.charAt(i+1);
			else
			y=str.charAt(i);
				
			
			if((x==z)&&(y==z))	
				System.out.print("");
			else
				System.out.print(x);
		}
    }
}