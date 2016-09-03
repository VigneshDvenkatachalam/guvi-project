import java.io.*;
import java.util.*;
public class namesuggestion {

	public static void main(String[] args) throws Exception {
		
		System.out.println("search for: ");
		BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
		String ch=b.readLine();
		FileReader fr=new FileReader("name.txt");
		BufferedReader br=new BufferedReader(fr);
		StringBuilder sb=new StringBuilder();
		String s1;
		while((s1=br.readLine())!=null)
		{
			sb.append(s1+",");
		}
		fr.close();
		String[] s2=sb.toString().split(",");
		TreeSet<String> tr=new TreeSet<String>();
		for(int i=0;i<s2.length;i++)
		{
			tr.add(s2[i]);
		}
		StringBuilder sb1=new StringBuilder();
		Iterator<String> it=tr.iterator();
		while(it.hasNext())
		{
			String value=(String)it.next();
			sb1.append(value+"-");
		}
		
		String[] s3=sb1.toString().split("-");
		for(int i=0;i<s3.length;i++)
		{
			if(s3[i].contains(ch))
				System.out.println(s3[i]);
				
		}
		
	}

}
