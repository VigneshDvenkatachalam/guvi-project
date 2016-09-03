import java.io.*;
import java.util.Iterator;
import java.util.TreeSet;

public class loginuser {

	public static void main(String[] args) throws Exception {
		
		FileReader fr=new FileReader("user.txt");
		BufferedReader br=new BufferedReader(fr);
		StringBuilder sb=new StringBuilder();
		String s;
		TreeSet<String> tr = new TreeSet<String>();
		
		while((s=br.readLine())!=null)
		{
			sb.append(s+",");
	    }
		br.close();
		String[] s1=sb.toString().split(",");
		
		for(int i=0;i<s1.length;i++)
		{
			tr.add(s1[i]);
		}
		
		StringBuilder sb1=new StringBuilder();
		Iterator<String> it=tr.iterator();
		while(it.hasNext())
		{
			String value=(String)it.next();
			sb1.append(value+" ");
			
		}
		
		String[] s2=sb1.toString().split(" ");
		
		for(int i=0;i<s2.length;i++)
		{
			int count=0;
			
			String str1=s2[i];
			for(int j=0;j<s1.length;j++)
			{
				String str2=s1[j];
				if(str1.equals(str2))
				{
				 count++;	
				}
			}
			System.out.println(str1+" "+count);
		}
		
	}

}
