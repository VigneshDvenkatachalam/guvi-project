import java.io.*;
public class balancedword {

	public static void main(String[] args) throws IOException {
		
		String str1;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		str1=br.readLine();
		
		
		String[] str2=str1.split(" ");
		for(int i=0;i<str2.length;i++)
		{
			String s1=str2[i].toUpperCase();
			for(int j=0;j<s1.length()-1;j++)
			{
			if((s1.charAt(j)<77)&&(s1.charAt(j+1)<77))
			{
				System.out.println(str2[i]+" "+"is not balanced");
				break;
			}
			else
				{
				if(s1.charAt(j)<77)
				{
					if((s1.charAt(j+1)>77))
					{
						System.out.println(str2[i]+" "+"is balanced");
						break;
					}
					
				}
				else if(j==s1.length()-2)
				{
				
					if((s1.charAt(s1.length()-1)<77)&&(s1.charAt(s1.length()-2)>77))
					{
						System.out.println(str2[i]+" "+"is not balanced");
						break;
					}
				}
				}
			
			}
			
		}
	}

}
