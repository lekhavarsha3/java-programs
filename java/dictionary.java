import java.io.*;
import java.util.*;
public class dictionary
{
public static void main(String args[])
{
       Scanner s=new Scanner(System.in);
	   int n=s.nextInt();
	   System.out.println("Enter the String");
	   String arr[]=new String[n];
       int count=0,i=0;
for(i=0;i<n;i++)
{
	arr[i]=s.next();
}
    System.out.println("Enter the input String");
    String str=s.next();
    count=str.length();
for(i=0;i<n;i++)
{
	int len=arr[i].length();
	
if(arr[i].equals(str.substring(0,arr[i].length())));
{
	
}
}

System.out.println(arr[i]);
}
}