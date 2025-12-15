public class ntozero
{
    public static void main(String args[])
    {
        int n=5;
        print(n);
    }
    public static void print(int n)
    {
        if(n==0)
        {
            return;
        }
        else
        System.out.println(n);
        print(n-1);
    }
}
