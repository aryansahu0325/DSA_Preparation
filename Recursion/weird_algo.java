public class weird_algo
{
    public static void main(String args[])
    {
        int n=3;
        divide(n);
    }
    public static void divide(int n)
    {
        if(n==1){
            return ;
        }
        System.out.println(n);
        if(n%2==0) {
            divide(n / 2);
        }
        else
            divide(n*3+1);
    }
}
