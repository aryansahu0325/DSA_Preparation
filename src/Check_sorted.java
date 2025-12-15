public class Check_sorted
{
    public static void main(String args[])
    {
        int arr[]={1,2,3,4,5};
        int arr1[]={2,1,8,5,9,5};
        System.out.println(checksort(arr,0));
        System.out.println(checksort(arr1,0));
    }
    public static boolean checksort(int arr[],int i)
    {
        if(i== arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return checksort(arr,i+1);
    }
}
