import java.util.*;
class handshakes
{
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        int person=obj.nextInt();
        int total=0;
        for(int i=person-1;i>=1;i--)
        {
            total+=i;
        }
        System.out.println(total);
    }
}