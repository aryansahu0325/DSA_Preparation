public class digit_of_n
{
    public static void main(String args[])
    {
        int n=123;
        dig_of_n(n);
    }
    public static void dig_of_n(int n)
    {
        if(n==0)
            return;
        else
            dig_of_n(n/10);
            System.out.println(n%10);
    }
}
