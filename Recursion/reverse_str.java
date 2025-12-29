public class reverse_str {
    public static void main(String args[])
    {
            String st="Aryan";
            char arr[]=st.toCharArray();
            System.out.println(without_swap(st));
            with_swap(arr,0,st.length()-1);
            System.out.println(arr);
            reversestitr(st);
    }
    public static String without_swap(String st)
    {
        if(st.length()==0){
            return "";
        }
        return without_swap(st.substring(1)) + st.charAt(0);
    }
    public static void with_swap(char arr[],int left,int right)
    {
        if(left>=right){
            return;
        }
        char temp=arr[left];
        arr[left]=arr[right];
        arr[right]=temp;

        with_swap(arr, left + 1, right - 1);
    }
    public static void reversestitr(String st) {
        String st1="";
        for(int i=0;i<st.length();i++){
            char ch=st.charAt(i);
            st1=ch+st1;
        }
        System.out.println(st1);
    }
}
