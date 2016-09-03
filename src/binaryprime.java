import java.util.Scanner;
public class binaryprime {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int x,y;
		System.out.println("enter the range ");
		x=sc.nextInt();
		y=sc.nextInt();
		sc.close();
		int out=0;
		for(int i=x;i<=y;i++)
		{
			String s1=Integer.toBinaryString(i);
			int count=0;
			for(int j=0;j<s1.length();j++)
			{
				
				char ch1='1',ch2=s1.charAt(j);
				if(ch1==ch2)
				{
		        	count++;
		        	
				}
			}
			int n,k,c=0;
			n=count;
			for(k=2;k<=n/2;k++)
			{
				if(n%k==0)
				{
					c++;
					break;
				}
				
			}
			if(c==0 && n!=1 && n!=0)
			{
				out++;
				System.out.println("prime"+" "+i+" "+s1);
			}
				
		}
		System.out.println(out);
		
		}

}
