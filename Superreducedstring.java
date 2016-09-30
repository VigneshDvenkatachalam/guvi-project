import java.io.*;
import java.util.*;


public class Solution {

    public static void main(String[] args) {
       Scanner scan=new Scanner(System.in);
        String str=scan.nextLine();
        scan.close();
        char z='#';
        String s=str;
        StringBuffer sBuffer = new StringBuffer();
        for(int i=0;i<s.length();i++)
            {
            int count=0;
            char a=s.charAt(i);
            for(int j=0;j<str.length();j++)
                {
                char b=str.charAt(j);
                if(a==b)
                    {
                    count++;
                   
                }
            }
            if((count%2)!=0)
                sBuffer.append(s.charAt(i));
            
                str=str.replace(a,z);
            
            
        }
        
        if(sBuffer.length()!=0)
            System.out.print(sBuffer);
        else
            System.out.println("Empty String");
       
    }
}
