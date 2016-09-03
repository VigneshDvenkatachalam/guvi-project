import java.io.*;
public class savedetails {

	public static void main(String[] args) throws Exception {
		
		File file=new File("details.txt");
		FileWriter fw=new FileWriter(file);
		BufferedWriter bw=new BufferedWriter(fw);
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb=new StringBuilder();
		String temp;
		String decision;
		boolean yn=true;
		
		while(yn)
        {
		System.out.println("Name: ");
		temp=br.readLine();
		sb.append(temp+"-");
		System.out.println("E-mail: ");
		temp=br.readLine();
		sb.append(temp+"-");
		System.out.println("Ph.no: ");
		temp=br.readLine();
		sb.append(temp+",");
		System.out.println("add new: y(or)n");
		 decision=br.readLine();
		 
		 switch(decision)
		 {
		 case "y":
			 yn=true;
			 break;
		 case "n":
			 yn=false;
			 break;
		default:
			yn=false;
			System.out.println("Error");
			 
		 }
		}
		String D1=sb.toString();
		String[] D=sb.toString().split(",");
		bw.write(D1);
		bw.close();
		System.out.println(sb);
		for(int i=0;i<D.length;i++)
		{
		System.out.println(D[i]);
		}

	}

}
