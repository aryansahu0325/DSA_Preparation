import java.util.*;
public class Binary_Search2D {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no. of rows");
        int n=sc.nextInt();
        int m=sc.nextInt();
        int arr[][]=new int[n][m];
        System.out.println("Enter the element in the double dimensional array");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Printing Original Matrix");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Enter target to be found");
        int target=sc.nextInt();
        System.out.println(binary2d(arr,target,0,m*n-1));
    }
    public static boolean binary2d(int arr[][],int target, int left, int right){
        if(left>right){
            return false;
        }
        int mid=left+(right-left)/2;
        int row=mid/arr[0].length;
        int col=mid%arr[0].length;
        if(arr[row][col]==target){
            return true;
        }
        else if(arr[row][col]<target)
            return binary2d(arr,target,mid+1,right);
        else
            return binary2d(arr,target,left,mid-1);
        }
}

