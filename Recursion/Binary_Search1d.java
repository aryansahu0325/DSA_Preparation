import java.util.*;
public class Binary_Search1d {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of the array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter elements in array");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("Elements in array are:");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]);
        }
        System.out.println("Enter elements to be searched");
        int key=sc.nextInt();
        System.out.println("Element"+key+"found at index:"+binary1d(arr,key,0,arr.length-1));
    }
    public static int binary1d(int arr[], int key,int low, int high)
    {
        int mid=low+(high-low)/2;
        if(arr[mid]==key){
            return mid;
        }
        if(key<arr[mid]){
            return binary1d(arr,key,low,mid-1);
        }
        if(key>arr[mid]){
            return binary1d(arr,key,mid+1,high);
        }
        return -1;
    }
}
