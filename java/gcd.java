import java.util.*;
class gcd
{
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        int n1=obj.nextInt();
        int n2=obj.nextInt();
        int sol=0;
        if(n1>n2)
        sol=n1-n2;
        else
        sol=n2-n1;
        System.out.println(sol);
    }
}