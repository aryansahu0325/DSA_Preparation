import java.util.*;
public class subsequence_Array
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int nums[]={1,2,3};
        List<Integer> current=new ArrayList<>();
        int idx=0;
        printsub(idx,nums,current);
    }
    public static void printsub(int idx, int nums[],List<Integer> current)
    {
        if (idx == nums.length) {
            System.out.println(current);
            return;
        }
        //take condition
        current.add(nums[idx]);
        printsub(idx+1,nums, current);
        //nottake calling
        current.remove(current.size()-1);
        printsub(idx+1,nums,current);
    }
}
