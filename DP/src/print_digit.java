import java.util.*;
public class print_digit {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        printdigit(n);
    }
    public static void printdigit(int n)
    {
        if(n<10){
            System.out.println(n);
            return;
        }
        printdigit(n/10);
        System.out.println(n%10);
    }
}
