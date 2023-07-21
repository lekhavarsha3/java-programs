import java.util.*;
class monkey
{
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int k=obj.nextInt();
        int j=obj.nextInt();
        int m=obj.nextInt();
        int p=obj.nextInt();
        int ban=m/k;
        int pea=p/j;
        int rem=k%m;
        int rem1=p%j;
        int sol=0;
        if(rem<k || rem1<j)
        sol=pea+ban+1;
        else if(rem==0)
        sol=pea+ban;
        int ans=n-sol;
        System.out.print(ans);
    }
}