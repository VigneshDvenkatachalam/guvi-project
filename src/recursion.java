import java.util.*;
public class recursion {

	public static void main(String[] args) {
		System.out.println("enter a number ");
		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		sc.close();
		int p,sum=0;
		while(n>0)
		{
			p=n%10;
			sum=sum+p;
			n=n/10;
			if(n==0&&sum>9)
			{
				n=sum;
				sum=0;
			}
			
		}
		System.out.println(sum);

	}

}
