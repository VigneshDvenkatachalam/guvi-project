import java.io.*;
public class mailverification {

	public static void main(String[] args) throws IOException {
		
		String str;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter your email: ");
		str=br.readLine();
		br.close();
		
		char a=':';
		char b='&';
		char e='@';
		char d='.';
		char x='c';
	    char y='o';
	    char z='m';
		int count=0;
		
		for(int i=0;i<str.length();i++)
		{
			if((str.charAt(i))==a)
				//System.out.println("1"+count++);
				count++;
			if((str.charAt(i))==b)
				//System.out.println("2"+count++);
				count++;
			if(((str.charAt(i))==e)&&((str.charAt(i-1))!='\0')&&((str.charAt(i-2))!='\0')&&((str.charAt(i-3))!='\0'))
				//System.out.println("3"+count++);
				count++;
			if(((str.charAt(i))==e)&&((str.charAt(i+5))==d))
				//System.out.println("4"+count++);
				count++;
			if(((str.charAt(i))==d))
				{
					
				  if(((str.charAt(i+1))==x)&&((str.charAt(i+2))==y)&&((str.charAt(i+3))==z))
					//System.out.println("5"+count++);
					  count++;
				}
			
		}
		if(count==5)
			System.out.println("Valid Email");
		else
			System.out.println("Invalid Email");
	}

}
