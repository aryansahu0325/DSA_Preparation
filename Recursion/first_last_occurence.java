public class first_last_occurence
{
    public static void main(String args[])
    {
        int arr[]={1,2,3,4,3,9,6};
        int key=3;
        System.out.println("First Occurence of Array "+first_occ(arr,key,0));
        System.out.println("Last Occurence of Array "+last_occ(arr,key,arr.length-1));
    }
    public static int first_occ(int arr[],int key, int i)
    {
        if(arr[i]==key){
            return i;
        }
        return first_occ(arr,key,i+1);
    }
    public static int last_occ(int arr[],int key, int i)
    {
        if(arr[i]==key){
            return i;
        }
        return last_occ(arr,key,i-1);
    }
}
