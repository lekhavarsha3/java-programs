import java.util.*;
class subset 
{
public static void main(String args[])
{
Scanner obj=new Scanner(System.in);
String a=obj.next();
for(int i=0;i<a.length();i++)
{
 for(int j=i+1;j<=a.length();j++)
 {
   System.out.println(a.substring(i,j));
   }
   }
   }
   }