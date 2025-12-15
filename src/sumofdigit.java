public class sumofdigit
{
    public static void main(String args[])
    {
        int n=123;
        System.out.println(sod(n));
    }
    public static int sod(int n)
    {
        if(n<10){
            return n;
        }
        return (n%10)+sod(n/10);
    }
}
