import java.io.*;

public class building {

	public static void main(String[] args) throws Exception {
		
		FileReader fr=new FileReader("build.txt");
		
		BufferedReader br=new BufferedReader(fr);
		StringBuilder sb=new StringBuilder();
		String str;
		int count=0;
		while((str = br.readLine()) != null)
        {
            sb.append(str+"-");
            count++;
        }
		fr.close();
		String s1=sb.toString();
		String[] s2=s1.split("-");
		int floor=count;
		for(int i=0;i<count;i++)
		{
		
		String[] s3=(s2[i]).split(" ");
		int block=1;
		for(int j=0;j<s3.length;j++)
		{
		    if(s3[j].length()!=0)
		    {
			String str1=s3[j];
			
			for(int k=0;k<str1.length();k++)
			 {
			 if(str1.charAt(k)=='$')
			 System.out.println(block+""+floor+""+(k+1));
			  
			 }
			
			block++;
		    }
		 
		}
		
		floor--;
	}	
		
	}

}

